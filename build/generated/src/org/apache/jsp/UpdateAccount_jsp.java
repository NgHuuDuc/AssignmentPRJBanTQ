package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>HD Sport</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                color: #566787;\n");
      out.write("                background: #fff;\n");
      out.write("                font-family: \"Open Sans\", sans-serif;\n");
      out.write("            }\n");
      out.write("            .contact-form {\n");
      out.write("                padding: 50px;\n");
      out.write("                margin: 30px 0;\n");
      out.write("            }\n");
      out.write("            .contact-form h1 {\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                margin: 0 0 15px;\n");
      out.write("            }\n");
      out.write("            .contact-form .form-control, .contact-form .btn  {\n");
      out.write("                min-height: 38px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("            .contact-form .btn-primary {\n");
      out.write("                min-width: 150px;\n");
      out.write("                background: #ffc82e;\n");
      out.write("                color: #292929;\n");
      out.write("                border: none;\n");
      out.write("                margin-left: 38%;\n");
      out.write("            }\n");
      out.write("            .contact-form .btn-primary:hover {\n");
      out.write("                background: #292929;\n");
      out.write("                color: #ffc82e;\n");
      out.write("            }\n");
      out.write("            .contact-form label {\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            .contact-form textarea {\n");
      out.write("                resize: vertical;\n");
      out.write("            }\n");
      out.write("            .hint-text {\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding-bottom: 15px;\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("            .bs-example {\n");
      out.write("                margin: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container-xl\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8 mx-auto\">\n");
      out.write("                        <div class=\"contact-form\">\n");
      out.write("                            <h1 style=\"\n");
      out.write("                                font-size: 30px;\n");
      out.write("                                font-weight: bold;\n");
      out.write("                                text-align: center;\n");
      out.write("                                margin-bottom: 15%;\n");
      out.write("                                background-color: #292929;\n");
      out.write("                                color: #ffc82e;\n");
      out.write("                                padding: 10px;\n");
      out.write("                                border-radius: 5px;\">\n");
      out.write("                                Tài Khoản\n");
      out.write("                            </h1>\n");
      out.write("                            <form action=\"updateacc\" method=\"post\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"inputEmail\">Mã Người Dùng</label>\n");
      out.write("                                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getCusID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"ID\" class=\"form-control\" id=\"inputEmail\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputFirstName\">Tên Người Dùng</label>\n");
      out.write("                                        <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"UserName\" class=\"form-control\" id=\"inputFirstName\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputLastName\"> Email </label>\n");
      out.write("                                        <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"Email\" class=\"form-control\" id=\"inputLastName\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputLastName\">Mật Khẩu</label>\n");
      out.write("                                        <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"Password\" class=\"form-control\" id=\"inputLastName\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                                               \n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputLastName\">SĐT</label>\n");
      out.write("                                        <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"Phone\" class=\"form-control\" id=\"inputLastName\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                                       \n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" value=\"Submit\">Cập Nhật</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
