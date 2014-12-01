<%@page import="css.training.spring.web.BeanParam"%>
<%@ page session="false" %>
<html>
<head>
    <title>Echo</title>
</head>
<body>
    <% 
    BeanParam param=(BeanParam)request.getAttribute("beanParam"); 
    %>
Param 1= <%=param.getParam1() %>
<br/>
Param 2 = <%= param.getParam2() %>

<form action="../form/submit" method="get" >
Param1 :<input type="text" name="param1"><br/>
Param2 :<input type="text" name="param2">
<input type="submit">
</form>
</body>
</html>