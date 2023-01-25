<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">
	console.log("Javascript funktioniert!");
</script>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport">
		<title>Login</title>
	</head>
	<body>
		<div class="container">
			<div class="form-group m-3">
				<form action="ControllerServlet" method="post">
					<div class="mb-3">
						<label for="name" class="form-label">Name:</label>
						<input type="text" class="form-control" id="name" placeholder="Login">
					</div>
					<div class="mb-3">
						<label for="password" class="form-label">Passwort:</label>
						<input type="password" class="form-control" id="password" placeholder="Passwort">
					</div>
					<div class="p-4">
						<button id="login" type="submit" class="btn btn-primary">Login</button>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>