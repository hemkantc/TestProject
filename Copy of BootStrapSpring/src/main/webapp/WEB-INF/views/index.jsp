<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bootstrap Form With Spring Mvc Example</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css"/>
<!-- jQuery from Google CDN -->
     <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
     <!-- jQuery UI from Google CDN -->
     <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
</head>
<body>
	<div class="page-header">
		<h1>Bootstrap Form With Spring Mvc Example</h1>
		<p>Test form layout</p>
	</div>
	<div class="col-md-6">
			
				<form class="form-horizontal" method="post" action='employee/add.htm' name="employeeForm" id="employeeForm">
					<div class="form-group" >
						<label class="form-label col-sm-2 col-sm-offset-2">First Name</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" name="firstName" id="firstName" title="First Name" placeholder="e.g. Name">
						</div>
					</div>
					<div class="form-group">
						<label class="form-label col-sm-2 col-sm-offset-2">Last Name</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" name="lastName" id="lastName" title="Last Name" placeholder="e.g. LastName">
						</div>
					</div>
					<div class="form-group">
						<label class="form-label col-sm-2 col-sm-offset-2">Email</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" name="email" id="email" title="Email" placeholder="e.g. abc@xyz.com">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-8 col-sm-offset-4">
							<button type="submit" class="btn btn-success">Submit</button>
							<button type="button" class="btn">Cancel</button>
						</div>
					</div>
				</form>
	</div>		
</body>
</html>