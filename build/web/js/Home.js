
import InfiniteCarousel from './js/carousel.js';


console.log("asagsdhjasd");
let slider = new InfiniteCarousel({
    carousel: document.getElementById("carousel"),
    displacement: "calc(100% / 3 - 13.33px)"
});
slider.setDurationPerSlide(2000);
slider.enableAutoSlide(true);
slider.run();

document.getElementById("prev").onclick = slider.prevSlide.bind(slider);
document.getElementById("next").onclick = slider.nextSlide.bind(slider);