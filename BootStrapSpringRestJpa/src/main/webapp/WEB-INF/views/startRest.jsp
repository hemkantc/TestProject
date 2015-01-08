<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css"/>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="resources/js/myAjax.js"></script>
</head>
<body>

<div class="page-header">
		<h1>Bootstrap Form With Spring Mvc Example</h1>
		<p>Test form layout</p>
</div>
<div class="row">
	<div class="col-md-4 col-md-offset-2">
				
					<form class="form-horizontal" id="employeeForm">
						<div class="form-group" >
							<label class="form-label col-sm-2">Employee Id</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" name="eid" id="eid" placeholder="e.g. 12">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-8 col-sm-offset-2">
								<button type="submit" class="btn btn-success">Submit</button>
							</div>
						</div>
					</form>
	</div>	
</div>	

<div class="row">
		<div class="col-md-4 col-md-offset-2">
			<table id="loadHere" class="table table-striped table-bordered">
					<thead>
					
					<tr><th>Id</th>
						<th>Name</th>
						<th>Created</th>
					</tr>
					<thead>
					
			</table>
		</div>	
</div>

<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>