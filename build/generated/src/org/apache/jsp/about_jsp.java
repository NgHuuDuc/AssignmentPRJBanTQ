package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Free Leoshop Website Template | About :: w3layouts</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery1.min.js\"></script>\r\n");
      out.write("        <!-- start menu -->\r\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("        <script>$(document).ready(function () {\r\n");
      out.write("        $(\".megamenu\").megamenu();\r\n");
      out.write("    });</script>\r\n");
      out.write("        <!-- dropdown -->\r\n");
      out.write("        <script src=\"js/jquery.easydropdown.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"login\">\r\n");
      out.write("            <div class=\"wrap\">\r\n");
      out.write("                <ul class=\"breadcrumb breadcrumb__t\"><a class=\"home\" href=\"#\">Home</a>  / About</ul>\r\n");
      out.write("                <div class=\"section group\">\r\n");
      out.write("                    <div class=\"labout span_1_of_about\">\r\n");
      out.write("                        <h3>Testimonials</h3>\r\n");
      out.write("                        <div class=\"testimonials \">\r\n");
      out.write("                            <div class=\"testi-item\">\r\n");
      out.write("                                <blockquote class=\"testi-item_blockquote\">\r\n");
      out.write("                                    <a href=\"#\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </a>\r\n");
      out.write("                                    <div class=\"clear\"></div>\r\n");
      out.write("                                </blockquote>\r\n");
      out.write("                                <small class=\"testi-meta\"><span class=\"user\">Lorem ipsum dolor </span>,\r\n");
      out.write("                                    <span class=\"info\">sit amet</span><br><a href=\"#\">http://demolink.org</a></small></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"testimonials \">\r\n");
      out.write("                            <div class=\"testi-item\">\r\n");
      out.write("                                <blockquote class=\"testi-item_blockquote\">\r\n");
      out.write("                                    <a href=\"#\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </a>\r\n");
      out.write("                                    <div class=\"clear\"></div>\r\n");
      out.write("                                </blockquote>\r\n");
      out.write("                                <small class=\"testi-meta\"><span class=\"user\">Lorem ipsum dolor</span>,\r\n");
      out.write("                                    <span class=\"info\">sit amet</span><br><a href=\"#\">http://demolink.org</a></small></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"cont span_2_of_about\">\r\n");
      out.write("                        <h3>Our Mission</h3>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>\r\n");
      out.write("                        <h5 class=\"m_6\">Meet Our Team</h5>\t\r\n");
      out.write("                        <div class=\"section group\">\r\n");
      out.write("                            <div class=\"col_1_of_about-box span_1_of_about-box\">\r\n");
      out.write("                                <a class=\"popup-with-zoom-anim\" href=\"#small-dialog3\">  <span class=\"rollover\"></span><img src=\"images/a-img.jpg\" title=\"continue\" alt=\"\"/></a>\r\n");
      out.write("                                <div id=\"small-dialog3\" class=\"mfp-hide\">\r\n");
      out.write("                                    <div class=\"pop_up2\">\r\n");
      out.write("                                        <h2>Lorem ipsum </h2>\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h4 class=\"m_7\"><a href=\"#\">consectetuer adipiscing</a></h4>\r\n");
      out.write("                                <p>Lorem ipsum dolor consectetur adipisicing elit, sed do eiusmod.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col_1_of_about-box span_1_of_about-box\">\r\n");
      out.write("                                <a class=\"popup-with-zoom-anim\" href=\"#small-dialog3\">  <span class=\"rollover\"></span><img src=\"images/a-img1.jpg\" title=\"continue\" alt=\"\"/></a>\r\n");
      out.write("                                <h4 class=\"m_7\"><a href=\"#\">consectetuer adipiscing</a></h4>\r\n");
      out.write("                                <p>Lorem ipsum dolor consectetur adipisicing elit, sed do eiusmod.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col_1_of_about-box span_1_of_about-box\">\r\n");
      out.write("                                <a class=\"popup-with-zoom-anim\" href=\"#small-dialog3\">  <span class=\"rollover\"></span><img src=\"images/a-img2.jpg\" title=\"continue\" alt=\"\"/></a>\r\n");
      out.write("                                <h4 class=\"m_7\"><a href=\"#\">consectetuer adipiscing</a></h4>\r\n");
      out.write("                                <p>Lorem ipsum dolor consectetur adipisicing elit, sed do eiusmod.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"clear\"></div> \r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Add fancyBox main JS and CSS files -->\r\n");
      out.write("                        <script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("                        <link href=\"css/magnific-popup.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("                        <script>\r\n");
      out.write("                                            $(document).ready(function () {\r\n");
      out.write("                                                $('.popup-with-zoom-anim').magnificPopup({\r\n");
      out.write("                                                    type: 'inline',\r\n");
      out.write("                                                    fixedContentPos: false,\r\n");
      out.write("                                                    fixedBgPos: true,\r\n");
      out.write("                                                    overflowY: 'auto',\r\n");
      out.write("                                                    closeBtnInside: true,\r\n");
      out.write("                                                    preloader: false,\r\n");
      out.write("                                                    midClick: true,\r\n");
      out.write("                                                    removalDelay: 300,\r\n");
      out.write("                                                    mainClass: 'my-mfp-zoom-in'\r\n");
      out.write("                                                });\r\n");
      out.write("                                            });\r\n");
      out.write("                        </script>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\t\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\t\r\n");
      out.write("        </div>  \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
