<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<a href="param/testParam?username=hehe&password=123">���������</a>

�����ݷ�װAccount����
<form action="param/saveAccount" method="post">
    ������<input type="text" name="name" /><br/>
    ���룺<input type="text" name="password" /><br/>
    ��<input type="text" name="money" /><br/>
<%--    �û�������<input type="text" name="user.uname" /><br/>--%>
<%--    �û����䣺<input type="text" name="user.age" /><br/>--%>
    <input type="submit" value="�ύ" />
</form>

<%--�����ݷ�װAccount���У����д���list��map�ļ���
<form action="param/saveAccount" method="post">
    ������<input type="text" name="username" /><br/>
    ���룺<input type="text" name="password" /><br/>
    ��<input type="text" name="money" /><br/>

    �û�������<input type="text" name="list[0].uname" /><br/>
    �û����䣺<input type="text" name="list[0].age" /><br/>

    �û�������<input type="text" name="map['one'].uname" /><br/>
    �û����䣺<input type="text" name="map['one'].age" /><br/>
    <input type="submit" value="�ύ" />
</form>
--%>

<%--�Զ�������ת����
<form action="param/saveUser" method="post">
    �û�������<input type="text" name="uname" /><br/>
    �û����䣺<input type="text" name="age" /><br/>
    �û����գ�<input type="text" name="date" /><br/>
    <input type="submit" value="�ύ" />
</form>
--%>


<%--<a href="param/testServlet">Servletԭ����API</a>--%>

</body>
</html>
