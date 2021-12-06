export default class InfiniteCarousel {
    #durationInMs;
    #totalSlide;
    #lastIndex;
    #currIndex;
    #timer;
    #actionQueue;
    #autoNextSlide;

    constructor({
        carousel,
        displacement = "100%",
        dots = [],
        maxDotOpacity = "1",
        minDotOpacity = "0.25",
        elementClassesWithText = {},
    }) {
        this.carousel = carousel;
        this.displacement = displacement;
        this.dots = dots;
        this.elementClassesWithText = elementClassesWithText;
        this.maxDotOpacity = maxDotOpacity;
        this.minDotOpacity = minDotOpacity;

        this.#durationInMs = -1;
        this.#totalSlide = this.carousel.childElementCount - 1;
        this.#lastIndex = 0;
        this.#currIndex = 0;
        this.#timer = null;
        this.#actionQueue = [this.nextSlide.bind(this)];
        this.#autoNextSlide = false;
    }

    setDurationPerSlide(durationInMs) {
        const DURATION_OFFSET_IN_MS = 100;
        let transitionDurationInMs = parseFloat(getComputedStyle(this.carousel)['transitionDuration']) * 1000;
        if (durationInMs < transitionDurationInMs + DURATION_OFFSET_IN_MS) {
            throw new Error("CAROUSEL_ERROR: Duration per slide must be at least 100 ms longer than transition duration");
        }
        this.#durationInMs = durationInMs;
    }

    enableAutoSlide(decision) {
        this.#autoNextSlide = decision;
    }

    run() {
        this.#timer = setInterval(this.goToSlide.bind(this, { index: 0 }), 0);
    }

    nextSlide() {
        if (this.#currIndex >= this.#totalSlide) {
            this.goToSlide({ index: 0, animation: false });
            return;
        }
        this.goToSlide({ index: this.#currIndex + 1 });
    }

    prevSlide() {
        if (this.#currIndex <= 0) {
            this.#actionQueue.unshift(this.prevSlide.bind(this));
            this.goToSlide({ index: this.#totalSlide, animation: false });
            return;
        }
        this.goToSlide({ index: this.#currIndex - 1 });
    }

    goToSlide({ index, animation = true }) {
        let duration = animation ? this.#durationInMs : 0;
        let element, content = "";

        this.#chooseAnimationBehavior(animation)

        this.#lastIndex = this.#currIndex;
        this.#currIndex = index;

        if (this.dots !== null && this.dots.length >= this.#totalSlide) {
            this.dots[this.#lastIndex % this.#totalSlide].style.opacity = this.minDotOpacity;
            this.dots[this.#currIndex % this.#totalSlide].style.opacity = this.maxDotOpacity;
        }

        for (const elementClass in this.elementClassesWithText) {
            if (this.elementClassesWithText.hasOwnProperty(elementClass)) {
                element = document.getElementById(elementClass);
                content = this.elementClassesWithText[elementClass][this.#currIndex % this.#totalSlide];
                content = content === undefined ? "" : content;
                element.innerText = content;
            }
        }
        this.carousel.style.right = `calc(${index} * ${this.displacement})`;
        this.#resetTimer(duration);
    }

    #chooseAnimationBehavior(addAnimation) {
        if (!addAnimation) {
            this.carousel.style.transition = 'none'
            this.carousel.style.webkitTransition = 'none'
            return;
        }
        this.carousel.style.transition = ''
        this.carousel.style.webkitTransition = ''
    }

    #resetTimer(durationInMs) {
        let action = this.#actionQueue[0];
        if (this.#actionQueue.length > 1) {
            this.#actionQueue.shift();
        }
        clearInterval(this.#timer);
        if (!this.#autoNextSlide) { return; }
        this.#timer = setInterval(action, durationInMs);
    }
}