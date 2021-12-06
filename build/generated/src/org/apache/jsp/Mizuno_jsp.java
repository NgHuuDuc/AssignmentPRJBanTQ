package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.Product;

public final class Mizuno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"js/jquery1.min.js\"></script>\r\n");
      out.write("        <!-- start menu -->\r\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("        <script>$(document).ready(function () {\r\n");
      out.write("                $(\".megamenu\").megamenu();\r\n");
      out.write("            });</script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.jscrollpane.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" id=\"sourcecode\">\r\n");
      out.write("            $(function ()\r\n");
      out.write("            {\r\n");
      out.write("                $('.scroll-pane').jScrollPane();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"mens\">    \r\n");
      out.write("                <div class=\"main\">\r\n");
      out.write("                    <div class=\"wrap\">\r\n");
      out.write("                        <div class=\"cont span_2_of_3\">\r\n");
      out.write("                            <h2 class=\"head\">Giày Mizuno</h2>\r\n");
      out.write("                            <div class=\"mens-toolbar\">\r\n");
      out.write("                                <div class=\"sort\">\r\n");
      out.write("                                    <div class=\"sort-by\">\r\n");
      out.write("                                        <label>Sort By</label>\r\n");
      out.write("                                        <select>\r\n");
      out.write("                                            <option value=\"\">\r\n");
      out.write("                                                Position                \r\n");
      out.write("                                            </option>\r\n");
      out.write("                                            <option value=\"\">\r\n");
      out.write("                                                Name                \r\n");
      out.write("                                            </option>\r\n");
      out.write("                                            <option value=\"\">\r\n");
      out.write("                                                Price                \r\n");
      out.write("                                            </option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        <a href=\"\"><img src=\"images/arrow2.gif\" alt=\"\" class=\"v-middle\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"pager\">   \r\n");
      out.write("                                    <ul class=\"dc_pagination dc_paginationA dc_paginationA06\">\r\n");
      out.write("                                        <li><a href=\"#\" class=\"previous\">Pages</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">1</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">2</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">3</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <div class=\"clear\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row top-box\">\r\n");
      out.write("                            ");

                                List<Product> products = (List<Product>) request.getAttribute("listP");
                                if (products != null) {
                                    for (Product product : products) {
                            
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 khung equal\"> \r\n");
      out.write("                                <div class=\"border\">\r\n");
      out.write("                                    <a href=\"single.jsp\">\r\n");
      out.write("                                        <div class=\"inner_content clearfix\">\r\n");
      out.write("                                            <div class=\"product_image\">\r\n");
      out.write("                                                <img src=\"");
      out.print(product.getImage());
      out.write("\" alt=\"\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"price\">\r\n");
      out.write("                                                <div class=\"cart-left\">\r\n");
      out.write("                                                    <p class=\"title\">");
      out.print(product.getName());
      out.write("</p>\r\n");
      out.write("                                                    <div class=\"price1\">\r\n");
      out.write("                                                        ");
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
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"cart-right\"> </div>\r\n");
      out.write("                                                <div class=\"clear\"></div>\r\n");
      out.write("                                            </div>\t\t\t\t\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");

                                    }
                                }
                            
      out.write("\r\n");
      out.write("                            <div class=\"clear\"></div>\r\n");
      out.write("                        </div>\t                      \t                        \t\t \t\t\t\t\t\t\t \t\t\t    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"rsidebar span_1_of_left\">\r\n");
      out.write("                        <section  class=\"sky-form\">\r\n");
      out.write("                            <h4>Loại Đinh</h4>\r\n");
      out.write("                            <div class=\"row row1 scroll-pane\">\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Đinh AG</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Đinh TF</label>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section  class=\"sky-form\">\r\n");
      out.write("                            <h4>Size</h4>\r\n");
      out.write("                            <div class=\"row row1 scroll-pane\">\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>34</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>35</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>36</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>37</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>38</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" ><i></i>39</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>40</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>42</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>43</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>44</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>45</label>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section  class=\"sky-form\">\r\n");
      out.write("                            <h4>Loại Cổ</h4>\r\n");
      out.write("                            <div class=\"row row1 scroll-pane\">\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Cổ Thấp</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Cổ Lửng</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Cổ Cao</label>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section  class=\"sky-form\">\r\n");
      out.write("                            <h4>Mức Giá</h4>\r\n");
      out.write("                            <div class=\"row row1 scroll-pane\">\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Dưới 300k</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-4\">\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>300k-400k</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>400k-500k</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>500k-800k</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" ><i></i>800k-1tr</label>\r\n");
      out.write("                                    <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Trên 1tr</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </section>\r\n");
      out.write("                        <section  class=\"sky-form\">\r\n");
      out.write("                            <h4>Colors</h4>\r\n");
      out.write("                            <ul class=\"color-list\">\r\n");
      out.write("                                <li><a href=\"#\"> <span class=\"color1\"> </span><p class=\"red\">Red</p></a></li>\r\n");
      out.write("                                <li><a href=\"#\"> <span class=\"color2\"> </span><p class=\"red\">Green</p></a></li>\r\n");
      out.write("                                <li><a href=\"#\"> <span class=\"color3\"> </span><p class=\"red\">Blue</p></a></li>\r\n");
      out.write("                                <li><a href=\"#\"> <span class=\"color4\"> </span><p class=\"red\">Yellow</p></a></li>\r\n");
      out.write("                                <li><a href=\"#\"> <span class=\"color5\"> </span><p class=\"red\">Violet</p></a></li>\r\n");
      out.write("                                <li><a href=\"#\"> <span class=\"color6\"> </span><p class=\"red\">Orange</p></a></li>\r\n");
      out.write("                                <li><a href=\"#\"> <span class=\"color7\"> </span><p class=\"red\">Gray</p></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"js/jquery.easydropdown.js\"></script>\r\n");
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
