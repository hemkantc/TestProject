<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
	<link rel="stylesheet" href="resources/css/bootstrap.theme.min.css" />
	<script src="resources/js/bootstrap.min.js"></script>
</head>
<body>

<div class="bs-example">
    <nav role="navigation" class="navbar navbar-default">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
           <!-- <a href="#" class="navbar-brand">Menu</a> -->
        </div>
        <!-- Collection of nav links and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Messages</a></li>
            </ul>
        </div>
    </nav>
</div>

<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p> User name is ${name} </p>

<h2>Sample Rest Example</h2>




<a class="btn btn-success" href="<%=request.getContextPath()%>/startRest">REST</a>

</body>
</html>
