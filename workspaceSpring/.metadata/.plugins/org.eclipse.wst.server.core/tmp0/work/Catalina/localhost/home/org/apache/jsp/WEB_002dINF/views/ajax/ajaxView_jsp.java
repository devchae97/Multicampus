/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-28 00:39:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.ajax;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajaxView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js></script>\r\n");
      out.write("<script>\r\n");
      out.write("	$(function(){\r\n");
      out.write("		// 문자열 받아오기\r\n");
      out.write("		$(\"#ajaxString\").click(function(){\r\n");
      out.write("		// 비동기식으로 서버에 접속하여 문자열을 결과로 리턴받는다.\r\n");
      out.write("			var url = \"/home/ajaxString\";\r\n");
      out.write("			var params = \"num=123&name=세종대왕&tel=010-8660-5793\";\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : url,\r\n");
      out.write("				data : params,\r\n");
      out.write("				type : \"GET\",\r\n");
      out.write("				success : function(result){\r\n");
      out.write("					$(\"#view\").append(result);\r\n");
      out.write("				},\r\n");
      out.write("				error : function(e){\r\n");
      out.write("					console.log(e.responseText);\r\n");
      out.write("				} \r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("		// 객체 받아오기\r\n");
      out.write("		$(\"#ajaxObject\").click(function(){\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/home/ajaxObject\",\r\n");
      out.write("				data : \"num=568&username=이순신\",\r\n");
      out.write("				type : \"GET\",\r\n");
      out.write("				success : function(obj){\r\n");
      out.write("					var tag = \"<ol>\";\r\n");
      out.write("					tag += \"<li>번호 = \" + obj.no + \"</li>\";\r\n");
      out.write("					tag += \"<li>이름 = \" + obj.username + \"</li>\";\r\n");
      out.write("					tag += \"<li>연락처 = \" + obj.tel + \"</li>\";\r\n");
      out.write("					tag += \"<li>주소 = \" +obj.addr + \"</li></ol>\";\r\n");
      out.write("					\r\n");
      out.write("					$(\"#view\").append(tag);\r\n");
      out.write("				},\r\n");
      out.write("				error : function(){\r\n");
      out.write("					console.log(\"에러발생\");\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		// List 객체 얻어오기\r\n");
      out.write("		$(\"#ajaxList\").click(function(){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/home/ajaxList\",\r\n");
      out.write("				success : function(result){\r\n");
      out.write("					var tag = \"<ul>\";\r\n");
      out.write("					\r\n");
      out.write("					// 컬렉션 List를 반복문을 돌리기 위해서는 컬렉션 변수를 선택자로 지정\r\n");
      out.write("					var $result = $(result);\r\n");
      out.write("					\r\n");
      out.write("					$result.each(function(idx, vo){\r\n");
      out.write("						tag += \"<li>\" + vo.no + \", \" + vo.username + \", \" + vo.tel + \", \" + vo.addr + \"</li>\";\r\n");
      out.write("					});\r\n");
      out.write("					\r\n");
      out.write("					tag += \"</ul>\";\r\n");
      out.write("					$(\"#view\").append(tag);\r\n");
      out.write("				},\r\n");
      out.write("				error : function(){\r\n");
      out.write("					console.log(\"List에러발생\");\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		// Map\r\n");
      out.write("		$(\"#ajaxMap\").click(function(){\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/home/ajaxMap\",\r\n");
      out.write("				success : function(result){\r\n");
      out.write("					var tag =  \"<ul>\";\r\n");
      out.write("					tag += \"<li>\" + result.m1.no + \", \" + result.m1.username + \", \" + result.m1.tel + \", \" + result.m1.addr + \"</li>\"\r\n");
      out.write("					tag += \"<li>\" + result.m2.no + \", \" + result.m2.username + \", \" + result.m2.tel + \", \" + result.m2.addr + \"</li>\"\r\n");
      out.write("					tag += \"<li>\" + result.m3.no + \", \" + result.m3.username + \", \" + result.m3.tel + \", \" + result.m3.addr + \"</li>\"\r\n");
      out.write("					tag += \"</ul>\";\r\n");
      out.write("					$(\"#view\").append(tag);\r\n");
      out.write("				},\r\n");
      out.write("				error : function(){\r\n");
      out.write("					console.log(\"Map에러발생\");	\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		// ajax를 이용하여 서버로 json데이터 보내기\r\n");
      out.write("		// 		클라이언트 json형식을 문자열 보내기\r\n");
      out.write("		$(\"#ajaxJson\").click(function(){\r\n");
      out.write("			var url = \"/home/ajaxJson\";\r\n");
      out.write("			var jsonData = {\r\n");
      out.write("					num : 100,\r\n");
      out.write("					name : \"홍길동\",\r\n");
      out.write("					tel : \"010-5432-4321\"\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : url,\r\n");
      out.write("				type : \"GET\",\r\n");
      out.write("				data : jsonData,\r\n");
      out.write("				dataType : \"json\",\r\n");
      out.write("				success : function(result){\r\n");
      out.write("					// json데이터로 받아짐\r\n");
      out.write("					console.log(result);\r\n");
      out.write("					var jsonString = JSON.stringify(result); // json을 문자화\r\n");
      out.write("					console.log(jsonString);\r\n");
      out.write("					// 문자열을 json으로 변환하여야 한다\r\n");
      out.write("					var json = JSON.parse(jsonString); // 문자를 json으로\r\n");
      out.write("					console.log(json);\r\n");
      out.write("					\r\n");
      out.write("					var tag = \"<ul>\";\r\n");
      out.write("					tag += \"<li>코드 : \"+result.code+\"</li>\";\r\n");
      out.write("					tag += \"<li>상품명 : \"+result.productName+\"</li>\";\r\n");
      out.write("					tag += \"<li>가격 : \"+result.price+\"</li></ul>\";\r\n");
      out.write("					$(\"#view\").append(tag);\r\n");
      out.write("				},\r\n");
      out.write("				error : function(e){\r\n");
      out.write("					console.log(e.responseText);\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$(\"#frm\").submit(function(){\r\n");
      out.write("			// form태그는 action의 주소로 이동하는 기능\r\n");
      out.write("			event.preventDefault();\r\n");
      out.write("			\r\n");
      out.write("			// 	num=54&username=홍길동\r\n");
      out.write("			// var params = \"num=\" + $(\"#num\").val()+\"&username\"+$(\"#username\").val();\r\n");
      out.write("			var params = $(\"#frm\").serialize(); // 폼의 값을 전송데이터로 만들어준다\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url:\"/home/ajaxForm\",\r\n");
      out.write("				type:\"POST\",\r\n");
      out.write("				data:params,\r\n");
      out.write("				success:function(result){\r\n");
      out.write("					$(\"#view\").append(\"<p>\"+result+\"</p>\");\r\n");
      out.write("				},\r\n");
      out.write("				error:function(error){\r\n");
      out.write("					console.log(error.responseText)\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	});	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>비동기식으로 Controller에 접속하여 정보를 리턴받는다.</h1>\r\n");
      out.write("<button id=\"ajaxString\">ajax 문자열</button>\r\n");
      out.write("<button id=\"ajaxObject\">ajax 객체</button>\r\n");
      out.write("<button id=\"ajaxList\">ajax List</button>\r\n");
      out.write("<button id=\"ajaxMap\">ajax Map</button>\r\n");
      out.write("<button id=\"ajaxJson\">ajax Json</button><br/>\r\n");
      out.write("<form method=\"post\" id=\"frm\">\r\n");
      out.write("	번호 : <input type=\"text\" name=\"num\" id=\"num\"/><br/>\r\n");
      out.write("	이름 : <input type=\"text\" name=\"username\" id=\"username\"/><br/>\r\n");
      out.write("	<input type=\"submit\" value=\"전송하기\"/>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<hr/>\r\n");
      out.write("<div id=\"view\" style=\"border:1px solid gray;\"></div>\r\n");
      out.write("</body>\r\n");
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
