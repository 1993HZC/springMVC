<%--
  Created by IntelliJ IDEA.
  User: Markov Huang
  Date: 2020/6/23
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>文件上传</h3>
<form action="user/fileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传文件"/>
</form>
<form action="user/fileupload2" method="post" enctype="multipart/form-data">
    选择文件2：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传文件"/>
</form>
<form action="user/fileupload3" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="跨域上传文件"/>
</form>


</body>
</html>
