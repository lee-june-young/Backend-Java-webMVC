/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2023-10-10 08:53:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("file:/C:/Users/ran/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar", Long.valueOf(1696570624765L));
    _jspx_dependants.put("/include/header.jspf", Long.valueOf(1696577340786L));
    _jspx_dependants.put("jar:file:/C:/Users/ran/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/include/navigation.jspf", Long.valueOf(1696927978962L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    ");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>KUIT</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/css/styles.css\" rel=\"stylesheet\">");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\" aria-label=\"Fourth navbar example\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"/\"> KUIT </a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarsExample04\" aria-controls=\"navbarsExample04\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExample04\">\r\n");
      out.write("        <ul class=\"navbar-nav me-auto mb-2 mb-md-0\">\r\n");
      out.write("          <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown04\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Home</a>\r\n");
      out.write("            <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\r\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\r\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form>\r\n");
      out.write("          <input class=\"form-control\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("  <div class=\"navbar-default\">\r\n");
      out.write("    <header class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom\">\r\n");
      out.write("      <a href=\"/\" class=\"d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none\">\r\n");
      out.write("        <svg class=\"bi me-2\" width=\"40\" height=\"32\" role=\"img\" aria-label=\"Bootstrap\"><use xlink:href=\"#bootstrap\"/></svg>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <ul class=\"nav col-12 col-md-auto mb-2 justify-content-center mb-md-0\">\r\n");
      out.write("        <li><a href=\"/index.html\" class=\"nav-link px-2 link-secondary\">Q&A</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"nav-link px-2 link-dark\">FAQs</a></li>\r\n");
      out.write("        <li><a href=\"/user/userList\" class=\"nav-link px-2 link-dark\">User List</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"nav-link px-2 link-dark\">About</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-md-3 text-end\">\r\n");
      out.write("        <a href=\"/user/login.html\" type=\"button\" class=\"btn btn-outline-primary me-2\">Login</a>\r\n");
      out.write("        <a href=\"/user/form.jsp\" type=\"button\" class=\"btn btn-primary\">Sign-up</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("  </div>");
      out.write("\r\n");
      out.write("    <div class=\"container\" id=\"main\">\r\n");
      out.write("        <h2>Q&A</h2>\r\n");
      out.write("        <div class=\"qna-list\">\r\n");
      out.write("          <ul class=\"list\">\r\n");
      out.write("              <li>\r\n");
      out.write("                  <div class=\"wrap\">\r\n");
      out.write("                      <div class=\"main\">\r\n");
      out.write("                          <strong class=\"subject\">\r\n");
      out.write("                              <a href=\"./qna/show.html\"> 객체지향에서 가장 중요하다고 생각하는 것이 무엇인가요? </a>\r\n");
      out.write("                          </strong>\r\n");
      out.write("                          <div class=\"auth-info\">\r\n");
      out.write("                              <i class=\"icon-add-comment\"></i>\r\n");
      out.write("                              <span class=\"time\">2023-09-25 13:00</span>\r\n");
      out.write("                              <span clas=\"author\">민병욱</span>\r\n");
      out.write("                              <!-- <a href=\"./user/profile.html\" class=\"author\">민병욱</a> -->\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"reply\" title=\"댓글\">\r\n");
      out.write("                              <i class=\"icon-reply\"></i>\r\n");
      out.write("                              <span class=\"point\">12</span>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                  <div class=\"wrap\">\r\n");
      out.write("                      <div class=\"main\">\r\n");
      out.write("                          <strong class=\"subject\">\r\n");
      out.write("                              <a href=\"./qna/show.html\"> 동아리에 시간 얼마나 투자할 수 있는지? </a>\r\n");
      out.write("                          </strong>\r\n");
      out.write("                          <div class=\"auth-info\">\r\n");
      out.write("                              <i class=\"icon-add-comment\"></i>\r\n");
      out.write("                              <span class=\"time\">2023-09-25 13:00</span>\r\n");
      out.write("                              <span class=\"author\">민병욱</span>\r\n");
      out.write("                              <!-- <a href=\"./user/profile.html\" class=\"author\">민병욱</a> -->\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"reply\" title=\"댓글\">\r\n");
      out.write("                              <i class=\"icon-reply\"></i>\r\n");
      out.write("                              <span class=\"point\">8</span>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-5\"></div>\r\n");
      out.write("            <div class=\"col-md-5\">                \r\n");
      out.write("              <ul class=\"pagination\" style=\"display:align-items-center;\">\r\n");
      out.write("                <li class=\"page-item disabled\">\r\n");
      out.write("                  <a class=\"page-link\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Previous</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                <li class=\"page-item active\" aria-current=\"page\">\r\n");
      out.write("                  <a class=\"page-link\" href=\"#\">2</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                <li class=\"page-item\">\r\n");
      out.write("                  <a class=\"page-link\" href=\"#\">Next</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-2 qna-write\">\r\n");
      out.write("                <a href=\"./qna/form.html\" class=\"btn btn-primary pull-right\" role=\"button\">질문하기</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"js/scripts.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
