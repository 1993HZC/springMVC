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
<h3>����</h3>
<a href="param/testParam?username=huangzicheng">���������</a>
<%--<form action="param/saveAccount" method="post">--%>
<%--    ������<input type="text" name="username" /><br/>--%>
<%--    ���룺<input type="text" name="password" /><br/>--%>
<%--    ��<input type="text" name="money" /><br/>--%>
<%--    �û�������<input type="text" name="user.username" /><br/>--%>
<%--    �û����䣺<input type="text" name="user.age" /><br/>--%>
<%--    <input type="submit" value="�ύ" />--%>
<%--</form>--%>

<%--<form action="param/saveAccount" method="post">--%>
<%--    ������<input type="text" name="username" /><br/>--%>
<%--    ���룺<input type="text" name="password" /><br/>--%>
<%--    ��<input type="text" name="money" /><br/>--%>

<%--    �û�������<input type="text" name="list[0].username" /><br/>--%>
<%--    �û����䣺<input type="text" name="list[0].age" /><br/>--%>

<%--    �û�������<input type="text" name="map['one'].username" /><br/>--%>
<%--    �û����䣺<input type="text" name="map['one'].age" /><br/>--%>
<%--    <input type="submit" value="�ύ" />--%>
<%--</form>--%>

<form action="param/saveUser" method="post">
    �û�������<input type="text" name="username" /><br/>
    �û����䣺<input type="text" name="age" /><br/>
    �û����գ�<input type="text" name="date" /><br/>
    <input type="submit" value="�ύ" />
</form>
<a href="param/testServlet">Servletԭ����API</a>
<a href="param/testPathVariable/10">Restful���</a>





</body>
</html>