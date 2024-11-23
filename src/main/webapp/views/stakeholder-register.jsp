<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Stakeholder SignUp</title>
  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css'><link rel="stylesheet" href="./style3.css">
</head>
<body>
<!-- partial:index.partial.html -->
<div class="container" id="container">
	<div class="form-container sign-in-container">
		<form:form method="post" action="/stakeholder-register" modelAttribute="user">
			<h1>Create Account</h1>
			<!---<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<span>or use your email for registration</span>--->
			<br>
			<form:input name="cname" path="cname" type="text" placeholder="Name"/>
			<form:input name="userId" path="userId" type="email" placeholder="Email"/>
			<form:input name="password" path="password" type="password" placeholder="Password"/>
			<form:input name="rpassword" path="rpassword" type="password" placeholder="Confirm Password"/>
			<br>
			<form:button >Sign Up</form:button>
		</form:form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-right">
				<h1>Already have an account?</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button onclick="location.href = '/stakeholder-login';" id="signIn">Sign In</button>
			</div>
		</div>
	</div>
</div>

<!---<footer>
	<p>
		Created with <i class="fa fa-heart"></i> by
		<a target="_blank" href="https://florin-pop.com">Florin Pop</a>
		- Read how I created this and how you can join the challenge
		<a target="_blank" href="https://www.florin-pop.com/blog/2019/03/double-slider-sign-in-up-form/">here</a>.
	</p>
</footer>--->
<!-- partial -->
  <script  src="./script3.js"></script>

</body>
</html>
