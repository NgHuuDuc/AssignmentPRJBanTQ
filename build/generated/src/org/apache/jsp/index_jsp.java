package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>HD Sport</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery1.min.js\"></script>\r\n");
      out.write("        <!-- start menu -->\r\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script>$(document).ready(function () {\r\n");
      out.write("                $(\".megamenu\").megamenu();\r\n");
      out.write("            });</script>\r\n");
      out.write("        <!--start slider -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fwslider.css\" media=\"all\">\r\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("        <script src=\"js/css3-mediaqueries.js\"></script>\r\n");
      out.write("        <script src=\"js/fwslider.js\"></script>\r\n");
      out.write("        <!--end slider -->\r\n");
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
      out.write("                        <a href=\"Home\"><img src=\"images/logo1.jpg\" alt=\"\"/></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"menu\">\r\n");
      out.write("                        <ul class=\"megamenu skyblue\">\r\n");
      out.write("                            <li class=\"active grid\"><a href=\"Home\">Trang Chủ</a></li>\r\n");
      out.write("<!--                            <c:forEach item=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listB}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\r\n");
      out.write("                                <li><a class=\"color4\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\t\r\n");
      out.write("                            </c:forEach>-->\r\n");
      out.write("                            <li><a class=\"color4\" href=\"Brand?BID=?\">Giày Nike</a></li>\t\t\t\t\r\n");
      out.write("                            <li><a class=\"color5\" href=\"Brand?BID=2\">Giày Adidas</a></li>\r\n");
      out.write("                            <li><a class=\"color6\" href=\"Brand?BID=3\">Giày Mizuno</a></li>\r\n");
      out.write("                            <li><a class=\"color7\" href=\"Brand?BID=4\">Giày Kamito</a></li>\r\n");
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
      out.write("                        <ul class=\"last\"><li><a href=\"checkout.jsp\">Giỏ Hàng(0)</a></li></ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- start slider -->\r\n");
      out.write("        <div id=\"fwslider\">\r\n");
      out.write("            <div class=\"slider_container\">\r\n");
      out.write("                <div class=\"slide\"> \r\n");
      out.write("                    <img src=\"images/slideshow.jpg\" alt=\"\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"slide\"> \r\n");
      out.write("                    <img src=\"images/slideshow1.jpg\" alt=\"\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("                    <img src=\"images/slideshow2.jpg\" alt=\"\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("                    <img src=\"images/slideshow3.jpg\" alt=\"\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("                    <img src=\"images/slideshow4.jpg\" alt=\"\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"timers\"></div>\r\n");
      out.write("            <div class=\"slidePrev\"><span></span></div>\r\n");
      out.write("            <div class=\"slideNext\"><span></span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/slider -->\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"wrap\">\r\n");
      out.write("                <h2 class=\"head tieude\"> <span>Sản Phẩm Hot</span></h2>\r\n");
      out.write("                <div class=\"row top-box\">\r\n");
      out.write("                    ");

                        List<Product> products = (List<Product>) request.getAttribute("listP");
                        if (products != null) {
                            for (Product product : products) {
                    
      out.write("\r\n");
      out.write("                    <div class=\"col-md-3 khung equal\"> \r\n");
      out.write("                        <div class=\"border\">\r\n");
      out.write("                            <a href=\"single.jsp\">\r\n");
      out.write("                                <div class=\"inner_content clearfix\">\r\n");
      out.write("                                    <div class=\"product_image\">\r\n");
      out.write("                                        <img src=\"");
      out.print(product.getImage());
      out.write("\" alt=\"\"/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"price\">\r\n");
      out.write("                                        <div class=\"cart-left\">\r\n");
      out.write("                                            <p class=\"title\">");
      out.print(product.getName());
      out.write("</p>\r\n");
      out.write("                                            <div class=\"price1\">\r\n");
      out.write("                                                ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_0.setParent(null);
      _jspx_th_fmt_formatNumber_0.setPattern("#,##0");
      _jspx_th_fmt_formatNumber_0.setValue(Integer.toString(product.getPrice()));
      int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
      if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      out.write(" đ\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"cart-right\"> </div>\r\n");
      out.write("                                        <div class=\"clear\"></div>\r\n");
      out.write("                                    </div>\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\t\r\n");
      out.write("                <h2 class=\"head tieude\"><span>Giày Bóng Đá Sân Cỏ Tự Nhiên</span></h2>\r\n");
      out.write("                <div class=\"top-box1\">\r\n");
      out.write("                    <div id=\"prev\"> <img src=\"images/left-arrow.png\" alt=\"\"/> </div>\r\n");
      out.write("                    <div  id=\"next\"> <img src=\"images/right-arrow.png\" alt=\"\"/>  </div>\r\n");
      out.write("                    <div class=\"carousel\" id=\"carousel\">\r\n");
      out.write("                        ");

                            List<Product> listGiayTuNhien = (List<Product>) request.getAttribute("listGiayTuNhien");
                            if (listGiayTuNhien != null) {
                                for (Product GiayTuNhien : listGiayTuNhien) {
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"khung carousel__slide\">\r\n");
      out.write("                            <div class=\"border\">\r\n");
      out.write("                                <a href=\"single.html\">\r\n");
      out.write("                                    <div class=\"inner_content clearfix\">\r\n");
      out.write("                                        <div class=\"product_image\">\r\n");
      out.write("                                            <img src=\"");
      out.print(GiayTuNhien.getImage());
      out.write("\" alt=\"\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!--                                            <div class=\"sale-box\"><span class=\"on_sale title_shop\">New</span></div>\t-->\r\n");
      out.write("                                        <div class=\"price\">\r\n");
      out.write("                                            <div class=\"cart-left\">\r\n");
      out.write("                                                <p class=\"title\">");
      out.print(GiayTuNhien.getName());
      out.write("</p>\r\n");
      out.write("                                                <div class=\"price1\">\r\n");
      out.write("<!--                                                            <span class=\"actual\">$");
      out.print(GiayTuNhien.getPrice());
      out.write("</span>-->\r\n");
      out.write("                                                    ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_1.setParent(null);
      _jspx_th_fmt_formatNumber_1.setPattern("#,##0");
      _jspx_th_fmt_formatNumber_1.setValue(Integer.toString(GiayTuNhien.getPrice()));
      int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
      if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      out.write(" đ\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"cart-right\"> </div>\r\n");
      out.write("                                            <div class=\"clear\"></div>\r\n");
      out.write("                                        </div>\t\t\t\t\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                                }
                            }
                        
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\t\r\n");
      out.write("                <h2 class=\"head tieude\"><span>Giày Bóng Đá Sân Cỏ Nhân Tạo</span></h2>\t\r\n");
      out.write("                <div class=\"top-box1\">\r\n");
      out.write("                    <div id=\"prev1\"> <img src=\"images/left-arrow.png\" alt=\"\"/> </div>\r\n");
      out.write("                    <div  id=\"next1\"> <img src=\"images/right-arrow.png\" alt=\"\"/> </div>\r\n");
      out.write("                    <div class=\"carousel\" id=\"carousel1\">\r\n");
      out.write("                        ");

                            List<Product> listGiayNhanTao = (List<Product>) request.getAttribute("listGiayNhanTao");
                            if (listGiayNhanTao != null) {
                                for (Product GiayNhanTao : listGiayNhanTao) {
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"khung carousel__slide\">\r\n");
      out.write("                            <div class=\"border\">\r\n");
      out.write("                                <a href=\"single.html\">\r\n");
      out.write("                                    <div class=\"inner_content clearfix\">\r\n");
      out.write("                                        <div class=\"product_image\">\r\n");
      out.write("                                            <img src=\"");
      out.print(GiayNhanTao.getImage());
      out.write("\" alt=\"\"/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!--                                            <div class=\"sale-box\"><span class=\"on_sale title_shop\">New</span></div>\t-->\r\n");
      out.write("                                        <div class=\"price\">\r\n");
      out.write("                                            <div class=\"cart-left\">\r\n");
      out.write("                                                <p class=\"title\">");
      out.print(GiayNhanTao.getName());
      out.write("</p>\r\n");
      out.write("                                                <div class=\"price1\">\r\n");
      out.write("<!--                                                            <span class=\"actual\">$");
      out.print(GiayNhanTao.getPrice());
      out.write("</span>-->\r\n");
      out.write("                                                    ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_2.setParent(null);
      _jspx_th_fmt_formatNumber_2.setPattern("#,##0");
      _jspx_th_fmt_formatNumber_2.setValue(Integer.toString(GiayNhanTao.getPrice()));
      int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
      if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_2);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      out.write(" đ\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"cart-right\"> </div>\r\n");
      out.write("                                            <div class=\"clear\"></div>\r\n");
      out.write("                                        </div>\t\t\t\t\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                                }
                            }
                        
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\t\t\t \t\t\t\t\t\t \t\t\t    \r\n");
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
      out.write("                                    <h3>VỀ CHÚNG TÔI</h3>\r\n");
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
      out.write("                                    <h3>THÔNG TIN</h3>\r\n");
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
      out.write("                                    <h3>LIÊN HỆ </h3>\r\n");
      out.write("                                    <div class=\"company_address\">\r\n");
      out.write("                                        <p>500 Lorem Ipsum Dolor Sit,</p>\r\n");
      out.write("                                        <p>22-56-2-9 Sit Amet, Lorem,</p>\r\n");
      out.write("                                        <p>USA</p>\r\n");
      out.write("                                        <p>Phone: 038 991 8891</p>\r\n");
      out.write("                                        <p>Fax: (000) 000 00 00 0</p>\r\n");
      out.write("                                        <p>Email: <span>HDSport@gmail.com</span></p>\r\n");
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
      out.write("        </div>  \r\n");
      out.write("        <script type=\"module\">\r\n");
      out.write("\r\n");
      out.write("            import InfiniteCarousel from './js/carousel.js';\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            console.log(\"asagsdhjasd\");\r\n");
      out.write("            let slider = new InfiniteCarousel({\r\n");
      out.write("            carousel: document.getElementById(\"carousel\"),\r\n");
      out.write("            displacement: \"calc(100% / 12 - 10px)\"\r\n");
      out.write("            });\r\n");
      out.write("            slider.setDurationPerSlide(10000);\r\n");
      out.write("            //slider.enableAutoSlide(true);\r\n");
      out.write("            slider.run();\r\n");
      out.write("\r\n");
      out.write("            document.getElementById(\"prev\").onclick = slider.prevSlide.bind(slider);\r\n");
      out.write("            document.getElementById(\"next\").onclick = slider.nextSlide.bind(slider);\r\n");
      out.write("\r\n");
      out.write("            let slider1 = new InfiniteCarousel({\r\n");
      out.write("            carousel: document.getElementById(\"carousel1\"),\r\n");
      out.write("            displacement: \"calc(100% / 12 - 10px)\"\r\n");
      out.write("            });\r\n");
      out.write("            slider1.setDurationPerSlide(10000);\r\n");
      out.write("            //slider.enableAutoSlide(true);\r\n");
      out.write("            slider1.run();\r\n");
      out.write("\r\n");
      out.write("            document.getElementById(\"prev1\").onclick = slider1.prevSlide.bind(slider1);\r\n");
      out.write("            document.getElementById(\"next1\").onclick = slider1.nextSlide.bind(slider1);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
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
