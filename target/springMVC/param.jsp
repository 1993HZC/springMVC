<%--
  Created by IntelliJ IDEA.
  User: markov
  Date: 2020/6/19
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>程序</h3>
<a href="param/testParam?username=huangzicheng">请求参数绑定</a>
<%--<form action="param/saveAccount" method="post">--%>
<%--    姓名：<input type="text" name="username" /><br/>--%>
<%--    密码：<input type="text" name="password" /><br/>--%>
<%--    金额：<input type="text" name="money" /><br/>--%>
<%--    用户姓名：<input type="text" name="user.username" /><br/>--%>
<%--    用户年龄：<input type="text" name="user.age" /><br/>--%>
<%--    <input type="submit" value="提交" />--%>
<%--</form>--%>

<%--<form action="param/saveAccount" method="post">--%>
<%--    姓名：<input type="text" name="username" /><br/>--%>
<%--    密码：<input type="text" name="password" /><br/>--%>
<%--    金额：<input type="text" name="money" /><br/>--%>

<%--    用户姓名：<input type="text" name="list[0].username" /><br/>--%>
<%--    用户年龄：<input type="text" name="list[0].age" /><br/>--%>

<%--    用户姓名：<input type="text" name="map['one'].username" /><br/>--%>
<%--    用户年龄：<input type="text" name="map['one'].age" /><br/>--%>
<%--    <input type="submit" value="提交" />--%>
<%--</form>--%>

<form action="param/saveUser" method="post">
    用户姓名：<input type="text" name="username" /><br/>
    用户年龄：<input type="text" name="age" /><br/>
    用户生日：<input type="text" name="date" /><br/>
    <input type="submit" value="提交" />
</form>
<a href="param/testServlet">Servlet原生的API</a>
<a href="param/testPathVariable/10">Restful风格</a>





</body>
</html>