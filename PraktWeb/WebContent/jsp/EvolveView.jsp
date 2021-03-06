<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Evolve Home</title>
<meta name="viewport" content="width=device-width , initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../css/Evolve.css" />
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

<!-- Main -->
<div class="main">
	<div class="row">
		<div class="text-main">
			<h4 class="text-1">SUMMER MUSE FOREVER</h4>
			<p class="text-2">Shop looks styled by your favorite influencer</p>
			<a href="" class="explore"> Explore Now </a>
		</div>
	</div>
</div>


<!-- New Arrivals -->
<div class="arrival">
	<div class="arrival-title">
		<h2>NEW ARRIVALS</h2>
	</div>
	<div class="arrival-rows">
		<div class="items">
			<img class="image" alt="" src="../img/IMG_5219.jpg">
		</div>
		<div class="items">
			<img class="image" alt="" src="../img/IMG_5229.jpg">
		</div>
		<div class="items">
			<img class="image" alt="" src="../img/IMG_5225.jpg">
		</div>
		<div class="items">
			<a href="" class="view"> View more... </a>
		</div>
	</div>
</div>
<!-- NEW COLLECTION -->

<div class="newcoll">
	<div class="collrow">
		<div class="colltext">
			<h4 class="text-3">SHOP OUR NEW COLLECTION</h4>
			<a href="" class="explore"> Shop now </a>
		</div>
	</div>
</div>
<!-- Best Sellers -->
<div class="bests-sellers">
	<div class="title-sellers">
		<h2>BEST SELLERS</h2>
	</div>
	<div class="rows-sellers">
		<div class="best">
			<img class="best-image" alt="" src="../img/IMG_5529.jpg">
			<h6 class="best-text"><a>Orange Toe Loop <br> Stilletto Sandals</a></h6>
			<div class="rating">
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star-half-alt"></i>
			</div>
			<p class="price">20,75$</p>
		</div>
		<div class="best">
			<img class="best-image" alt="" src="../img/IMG_5199.jpg">
			<h6 class="best-text"><a>Shape pink mesh <br> midi dress</a></h6>
			<div class="rating">
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star-half-alt"></i>
			</div>
			<p class="price">21,00$</p>
		</div>
		<div class="best">
			<img class="best-image" alt="" src="../img/IMG_5202.jpg">
			<h6 class="best-text"><a>Orange Bodycon dress</a></h6>
			<div class="rating">
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="fas fa-star"></i>
				<i class="far fa-star"></i>
			</div>
			<p class="price">17,99$</p>
		</div>
	</div>
</div>
<!-- Exlusive  -->
<div class="exclusive">
	<div class="exclu-container">
		<div class="text-exclu">
			<p class="text">Buy now. Pay later. With <img class="klarna-logo" alt="" src="../img/klarna_svg_logo.svg"></p>
			<p class="text">Pay in 4 interest-free installments</p>
		</div>
	</div>
</div>

<!-- Payment methods  -->
	<div class="payment">
		<div class="payment-row">
			<div>
				<img class="payment-logo" src="../img/2766961.png">
			</div>
			<div>
				<img class="payment-logo" src="../img/R.png">
			</div>
			<div>
				<img class="payment-logo" src="../img/paypal-784404_960_720.png">
			</div>
			<div>
				<img class="payment-logo" src="../img/apple-pay.png">
			</div>
			<div>
				<img class="payment-logo" src="../img/klarna_svg_logo.svg">
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