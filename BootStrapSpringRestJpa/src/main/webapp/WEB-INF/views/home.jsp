<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="resources/css/bootstrap.min.css" />

</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p> User name is ${name} </p>

<h2>Sample Rest Example</h2>
<a class="btn btn-success" href="<%=request.getContextPath()%>/startRest">REST</a>
</body>
</html>
