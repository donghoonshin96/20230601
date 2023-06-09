/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-05-24 01:37:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>회원가입 페이지</title>\n");
      out.write("<script>\n");
      out.write("	function validateForm() {\n");
      out.write("		// Get form input values\n");
      out.write("		var name = document.forms[\"registrationForm\"][\"name\"].value;\n");
      out.write("		var age = document.forms[\"registrationForm\"][\"age\"].value;\n");
      out.write("		var id = document.forms[\"registrationForm\"][\"id\"].value;\n");
      out.write("		var password = document.forms[\"registrationForm\"][\"password\"].value;\n");
      out.write("		var email = document.forms[\"registrationForm\"][\"email\"].value;\n");
      out.write("\n");
      out.write("		// Check if any field is empty or contains invalid data\n");
      out.write("		if (name === \"\" || age === \"\" || id === \"\" || password === \"\" || email === \"\") {\n");
      out.write("			alert(\"입력한 정보를 다시 확인해주세요.\");\n");
      out.write("			return false; // Prevent form submission\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		// All fields are filled, show success message\n");
      out.write("		alert(\"축하합니다. 회원가입이 완료되었습니다.\");\n");
      out.write("		return true; // Allow form submission\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<h1>회원가입 페이지</h1>\n");
      out.write("	<form name=\"registrationForm\" action=\"/mem/register\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("		이름 : <input type=\"text\" name=\"name\" placeholder=\"이름\"><br>\n");
      out.write("		나이 : <input type=\"text\" name=\"age\"><br>\n");
      out.write("		아이디 : <input type=\"text\" name=\"id\" placeholder=\"아이디\"><br>\n");
      out.write("		비밀번호 : <input type=\"password\" name=\"password\"><br>\n");
      out.write("		이메일 : <input type=\"email\" name=\"email\" placeholder=\"abc@naver.com\"><br>\n");
      out.write("		<button type=\"submit\">가입완료</button>\n");
      out.write("	</form>\n");
      out.write("		<a href=\"/\"><button type=\"submit\">홈으로</button></a>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
