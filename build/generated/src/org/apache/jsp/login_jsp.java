package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>HD Sport</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery1.min.js\"></script>\r\n");
      out.write("        <!-- start menu -->\r\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("        <script>$(document).ready(function () {\r\n");
      out.write("                $(\".megamenu\").megamenu();\r\n");
      out.write("            });</script>\r\n");
      out.write("        <!-- dropdown -->\r\n");
      out.write("        <script src=\"js/jquery.easydropdown.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header-top\">\r\n");
      out.write("            <div class=\"wrap\"> \r\n");
      out.write("                <div class=\"cssmenu\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"login.jsp\">Đăng Nhập</a></li> |\r\n");
      out.write("                        <li><a href=\"register.jsp\">Đăng Ký</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header-bottom\">\r\n");
      out.write("            <div class=\"wrap\">\r\n");
      out.write("                <div class=\"header-bottom-left\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"images/logo1.jpg\" alt=\"\"/></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"menu\">\r\n");
      out.write("                        <ul class=\"megamenu skyblue\">\r\n");
      out.write("                            <li class=\"active grid\"><a href=\"index.jsp\">Trang Chủ</a></li>\r\n");
      out.write("                            <li><a class=\"color4\" href=\"NikeAdidas.jsp\">Giày Nike, Adidas</a></li>\t\t\t\t\r\n");
      out.write("                            <li><a class=\"color5\" href=\"Kamito.jsp\">Giày Kamito</a></li>\r\n");
      out.write("                            <li><a class=\"color6\" href=\"Mizuno.jsp\">Giày Mizuno</a></li>\r\n");
      out.write("                            <li><a class=\"color7\" href=\"PhuKien.jsp\">Phụ Kiện</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"header-bottom-right\">\r\n");
      out.write("                    <div class=\"search\">\t  \r\n");
      out.write("                        <input type=\"text\" name=\"s\" class=\"textbox\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\r\n");
      out.write("                                    this.value = 'Search';\r\n");
      out.write("                                }\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Subscribe\" id=\"submit\" name=\"submit\">\r\n");
      out.write("                        <div id=\"response\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tag-list\">\r\n");
      out.write("                        <ul class=\"icon1 sub-icon1 profile_img\">\r\n");
      out.write("                            <li><a class=\"active-icon c1\" href=\"#\"> </a>\r\n");
      out.write("                                <ul class=\"sub-icon1 list\">\r\n");
      out.write("                                    <li><h3>sed diam nonummy</h3><a href=\"\"></a></li>\r\n");
      out.write("                                    <li><p>Lorem ipsum dolor sit amet, consectetuer  <a href=\"\">adipiscing elit, sed diam</a></p></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"icon1 sub-icon1 profile_img\">\r\n");
      out.write("                            <li><a class=\"active-icon c2\" href=\"#\"> </a>\r\n");
      out.write("                                <ul class=\"sub-icon1 list\">\r\n");
      out.write("                                    <li><h3>No Products</h3><a href=\"\"></a></li>\r\n");
      out.write("                                    <li><p>Lorem ipsum dolor sit amet, consectetuer  <a href=\"\">adipiscing elit, sed diam</a></p></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"last\"><li><a href=\"#\">Cart(0)</a></li></ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"login\">\r\n");
      out.write("            <div class=\"wrap\">\r\n");
      out.write("                <div class=\"col_1_of_login span_1_of_login\">\r\n");
      out.write("                    <h4 class=\"title\">Khách hàng mới</h4>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Bằng cách tạo một tài khoản với cửa hàng của chúng tôi , bạn sẽ có thể thực hiện những quy trình mua hàng nhanh hơn , lưu trữ nhiều địa chỉ gửi hàng , xem và theo dõi đơn đặt hàng của bạn trong tài khoản của bạn và nhiều hơn nữa .\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <div class=\"button1\">\r\n");
      out.write("                        <a href=\"register.jsp\"><input type=\"submit\" name=\"Submit\" value=\"Tạo tài khoản\"></a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col_1_of_login span_1_of_login\">\r\n");
      out.write("                    <div class=\"login-title\">\r\n");
      out.write("                        <form action=\"login\" method=\"post\" name=\"login\" id=\"login-form\">\r\n");
      out.write("                            <h4 class=\"title\">Đăng Nhập</h4>\r\n");
      out.write("                            <div id=\"loginbox\" class=\"loginbox\">\r\n");
      out.write("                                <fieldset class=\"input\">\r\n");
      out.write("                                    <p id=\"login-form-username\">\r\n");
      out.write("                                        <label for=\"modlgn_username\">Email</label>\r\n");
      out.write("                                        <input id=\"modlgn_username\" type=\"text\" name=\"email\" class=\"inputbox\" size=\"18\" autocomplete=\"off\">\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <p id=\"login-form-password\">\r\n");
      out.write("                                        <label for=\"modlgn_passwd\">Mật Khẩu</label>\r\n");
      out.write("                                        <input id=\"modlgn_passwd\" type=\"password\" name=\"password\" class=\"inputbox\" size=\"18\" autocomplete=\"off\">\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"remember\">\r\n");
      out.write("                                        <div class=\"alert-danger\" role=\"alert\">\r\n");
      out.write("                                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <button class=\"button\" type=\"submit\">Đăng Nhập</button>\r\n");
      out.write("                                        <div class=\"clear\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"footer-top\">\r\n");
      out.write("                <div class=\"wrap\">\r\n");
      out.write("                    <div class=\"section group example\">\r\n");
      out.write("                        <img src=\"images/banner-bottom1.png\" alt=\"\"/>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-middle\">\r\n");
      out.write("                <div class=\"wrap\">\r\n");
      out.write("                    <div class=\"section group example\">\r\n");
      out.write("                        <div class=\"col_1_of_f_1 span_1_of_f_1\">\r\n");
      out.write("                            <div class=\"section group example\">\r\n");
      out.write("                                <div class=\"col_1_of_f_2 span_1_of_f_2\">\r\n");
      out.write("                                    <h3>Facebook</h3>\r\n");
      out.write("                                    <script>(function (d, s, id) {\r\n");
      out.write("                                            var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("                                            if (d.getElementById(id))\r\n");
      out.write("                                                return;\r\n");
      out.write("                                            js = d.createElement(s);\r\n");
      out.write("                                            js.id = id;\r\n");
      out.write("                                            js.src = \"//connect.facebook.net/en_US/all.js#xfbml=1\";\r\n");
      out.write("                                            fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("                                        }(document, 'script', 'facebook-jssdk'));</script>\r\n");
      out.write("                                    <div class=\"like_box\">\t\r\n");
      out.write("                                        <div class=\"fb-like-box\" data-href=\"http://www.facebook.com/w3layouts\" data-colorscheme=\"light\" data-show-faces=\"true\" data-header=\"true\" data-stream=\"false\" data-show-border=\"true\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col_1_of_f_2 span_1_of_f_2\">\r\n");
      out.write("                                    <h3>From Twitter</h3>\r\n");
      out.write("                                    <div class=\"recent-tweet\">\r\n");
      out.write("                                        <div class=\"recent-tweet-icon\">\r\n");
      out.write("                                            <span> </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"recent-tweet-info\">\r\n");
      out.write("                                            <p>Ds which don't look even slightly believable. If you are <a href=\"#\">going to use nibh euismod</a> tincidunt ut laoreet adipisicing</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clear\"> </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"recent-tweet\">\r\n");
      out.write("                                        <div class=\"recent-tweet-icon\">\r\n");
      out.write("                                            <span> </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"recent-tweet-info\">\r\n");
      out.write("                                            <p>Ds which don't look even slightly believable. If you are <a href=\"#\">going to use nibh euismod</a> tincidunt ut laoreet adipisicing</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clear\"> </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col_1_of_f_1 span_1_of_f_1\">\r\n");
      out.write("                            <div class=\"section group example\">\r\n");
      out.write("                                <div class=\"col_1_of_f_2 span_1_of_f_2\">\r\n");
      out.write("                                    <h3>Information</h3>\r\n");
      out.write("                                    <ul class=\"f-list1\">\r\n");
      out.write("                                        <li><a href=\"#\">Duis autem vel eum iriure </a></li>\r\n");
      out.write("                                        <li><a href=\"#\">anteposuerit litterarum formas </a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Tduis dolore te feugait nulla</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Duis autem vel eum iriure </a></li>\r\n");
      out.write("                                        <li><a href=\"#\">anteposuerit litterarum formas </a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Tduis dolore te feugait nulla</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col_1_of_f_2 span_1_of_f_2\">\r\n");
      out.write("                                    <h3>Contact us</h3>\r\n");
      out.write("                                    <div class=\"company_address\">\r\n");
      out.write("                                        <p>500 Lorem Ipsum Dolor Sit,</p>\r\n");
      out.write("                                        <p>22-56-2-9 Sit Amet, Lorem,</p>\r\n");
      out.write("                                        <p>USA</p>\r\n");
      out.write("                                        <p>Phone:(00) 222 666 444</p>\r\n");
      out.write("                                        <p>Fax: (000) 000 00 00 0</p>\r\n");
      out.write("                                        <p>Email: <span>mail[at]leoshop.com</span></p>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"social-media\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li> <span class=\"simptip-position-bottom simptip-movable\" data-tooltip=\"Google\"><a href=\"#\" target=\"_blank\"> </a></span></li>\r\n");
      out.write("                                            <li><span class=\"simptip-position-bottom simptip-movable\" data-tooltip=\"Linked in\"><a href=\"#\" target=\"_blank\"> </a> </span></li>\r\n");
      out.write("                                            <li><span class=\"simptip-position-bottom simptip-movable\" data-tooltip=\"Rss\"><a href=\"#\" target=\"_blank\"> </a></span></li>\r\n");
      out.write("                                            <li><span class=\"simptip-position-bottom simptip-movable\" data-tooltip=\"Facebook\"><a href=\"#\" target=\"_blank\"> </a></span></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-bottom\">\r\n");
      out.write("                <div class=\"wrap\">\r\n");
      out.write("                    <div class=\"copy\">\r\n");
      out.write("                        <p>Â© 2014 Template by <a href=\"http://w3layouts.com\" target=\"_blank\">w3layouts</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"f-list2\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"active\"><a href=\"about.html\">About Us</a></li> |\r\n");
      out.write("                            <li><a href=\"delivery.html\">Delivery & Returns</a></li> |\r\n");
      out.write("                            <li><a href=\"delivery.html\">Terms & Conditions</a></li> |\r\n");
      out.write("                            <li><a href=\"contact.html\">Contact Us</a></li> \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
