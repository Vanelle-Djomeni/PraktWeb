<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Evolve Dresses</title>
<meta name="viewport" content="width=device-width , initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../css/Dresses.css" />
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;800&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/d8f3545429.js" ></script>
</head>
<body>

<!-- Header -->
<div class="header">
	<div class="innerheader">
 		<div class="logo">
 			<h2 class= evolvelogo> <a href="../jsp/EvolveView.jsp">EVOLVE</a></h2>
 		</div>
		<ul class="navigation">
			<li class="list-img" > <a class="icon-img" href="../jsp/EvolveLoginView.jsp"><img alt="" src="../img/R (1).png" width="30px" height="30px"></a></li>
			<li class="list-img"> <a class="icon-img" href=""><img alt="" src="../img/2694572.png" width="30px" height="30px">  </a></li>
		</ul>
		<div class="ahka">
			<div class="list">
				<select name="currency" class="currencies">
     					<option value="bwi420" selected>USD</option>
     					<option value="bwi352">EUR </option>
	     				<option value="bwi520">NGN</option>
	     				<option value="bwi511">CAD</option>
	     				<option value="bwi511">AED</option>
	     				<option value="bwi511">GBP</option>
				</select>
			</div>
		</div>
 	</div >
</div>

<!-- Section -->
<div class="section">
	<input type="checkbox" id="check">
    <label for="check" class="checkbtn">
        	<i class="fas fa-bars" id="btn"></i>
    </label>
	<div class="sidebar">
		<ul class="innersection">
	    	<li> <a class=innersections href="../jsp/EvolveView.jsp"> HOME </a></li>
			<li> <a class=innersections href="../jsp/EvolveCategoriesView.jsp"> CATEGORIES </a></li>
			<li> <a class=innersections href=""> SALES </a></li>
			<li> <a class=innersections href=""> ABOUT US</a></li>
		</ul>
	</div>
	<div class="box">
		<form action="">
			<input class="box1" type="text" name="type" value="" placeholder="Type..." /> 
			<input class="box2" type="submit" name="search" value="Search" /> 
		</form> 
	</div>	
</div>

<!--  Main -->
<div class="main">
	<div class="main-rows">
		<p class="name">DRESSES</p>
		<div class= "items">
			<img class= "item" alt="" src="../img/IMG_5206.jpg">
			<p class="best-text"><a>Mesh Ruched Sleeve <br> Bodycon Dress</a></p>
			<p class="price">27,99$</p>
		</div>
		<div class= "items">
			<img class= "item" alt="" src="../img/20210908_163740518_iOS.png">
			<p class="best-text"><a>Cargo Oversized Popper <br>Front Dress</a></p>
			<p class="price">23,00$</p>
		</div>
		<div class= "items">
			<img class= "item" alt="" src="../img/IMG_5200.jpg">
			<p class="best-text"><a>Floral Print Square <br> Shift Dress</a></p>
			<p class="price">15,00$</p>
		</div>
		<div class= "items" >
			<img class= "item" alt="" src="../img/IMG_5194.jpg">
			<p class="best-text"><a>White Blazer Button <br> Dress</a></p>
			<p class="price">30,00$</p>
		</div>
		<div class= "items">
			<img class= "item" alt="" src="../img/IMG_5199.jpg">
			<p class="best-text"><a> Shape Pink <br> Mesh Midi Dress</a></p>
			<p class="price">21,00$</p>
		</div>
		<div class= "items">
			<img class= "item" alt="" src="../img/IMG_5202.jpg">
			<p class="best-text"><a> Orange Bodycon <br> Dress</a></p>
			<p class="price">17,99$</p>
		</div>
		<div class= "items">
			<img class= "item" alt="" src="../img/IMG_5210.jpg">
			<p class="best-text"><a>White Anglaise Smock <br> Dress</a></p>
			<p class="price">25,00$</p>
		</div>
		
	</div>
</div>

<br>
<!-- Footer -->
<div class="footer">
	<div class="footer-row">
		<div class="colonn">
			<h3> Download our app</h3> <br>
			<img class="logo" alt="" src="../img/android-logo.png">
			<img class="logo" alt="" src="../img/apple-logo.png">
		</div>
		<div class="colonn">
			<h3>Get Help</h3>
			<ul class="links">
				<li> <a class=all-links href="">Track Order</a></li>
				<li> <a class=all-links href="">Help Center</a></li>
				<li> <a class=all-links href="">Return Policy</a></li>
				<li> <a class=all-links href="">Shipping Info</a></li>
				<li> <a class=all-links href="">Contact Us</a></li>
			</ul>
		</div>
		<div class="colonn">
			<h3>Company</h3>
			<ul class="links">
				<li> <a class=all-links href="">Careers</a></li>
				<li> <a class=all-links href="">About Us</a></li>
				<li> <a class=all-links href="">Want to collab?</a></li>
			</ul>
		</div>
		<div class="colonn">
			<h3> Sign up for Discounts</h3>
			<div class="box-footer">
				<p>By signing up for email, you agree to Evolve's <a href=""> Term of Services </a > and <a href=""> Privacy Policy</a></p>
				<form action="" class="boxes">
					<input class="box3" type="text" name="type" value="" placeholder="Email Address" /> 
					<input class="box4" type="submit" name="search" value="Sign Up" /> 
				</form> 
			</div>
		</div>
	</div>
	<hr>
		<p class="copyright">Copyright 2021 Evolve, LLC All Rights Reserved </p>
</div>

</body>
</html>