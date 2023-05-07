<?php

session_start();
include('db.php');

$status="";
if (isset($_POST['code']) && $_POST['code']!=""){
$code = $_POST['code'];
$result = mysqli_query($con,"SELECT * FROM `products` WHERE `code`='$code'");
$row = mysqli_fetch_assoc($result);
$name = $row['name'];
$code = $row['code'];
$price = $row['price'];
$image = $row['image'];

$cartArray = array(
	$code=>array(
	'name'=>$name,
	'code'=>$code,
	'price'=>$price,
	'quantity'=>1,
	'image'=>$image)
);

if(empty($_SESSION["shopping_cart"])) {
	$_SESSION["shopping_cart"] = $cartArray;
	$status = "<div class='box'>Product is added to your cart!</div>";
}else{
	$array_keys = array_keys($_SESSION["shopping_cart"]);
	if(in_array($code,$array_keys)) {
		$status = "<div class='box' style='color:red;'>
		Product is already added to your cart!</div>";	
	} else {
	$_SESSION["shopping_cart"] = array_merge($_SESSION["shopping_cart"],$cartArray);
	$status = "<div class='box'>Product is added to your cart!</div>";
	}

	}
}
?>
<html>
<head>
<script src="https://kit.fontawesome.com/929a86cd76.js" crossorigin="anonymous"></script>
<title>Demure’ Beauty</title>
<!-- <link rel='stylesheet' href='style.css' type='text/css' media='all' /> -->
<link rel="stylesheet" href= "../Assignment1/index.css"/>
</head>

<body>
<div class="header">
            <h1>Demure’ Beauty</h1>
            <p class="subheader">“Demure’ Goddesses don’t need crowns, we need Demure’ Beauty”</p>
        </div>
        <div class="topnav">

            <a href="Homepage.php">Home</a>
            <a href="Makeup.php">Dear, Dahlia! Line</a>
            <a href="Skincare.php">Dear, Lily! Line</a>

            <a href="../addtocart/cart.php" style="float:right">
                <i class="fa-solid fa-cart-shopping"></i>
            </a>

            <a href="../Testlogin/logout.php" style="float:right" >
                <i class="fa-solid fa-right-from-bracket"></i> 
            </a>

            <a style="float:right;" >  Welcome <span><?php echo $_SESSION['user_name'] ?></span> 
                <i  style=" margin-left: 5px;"class="fa-solid fa-user"></i>
            </a>
</div>
<div>

<?php
if(!empty($_SESSION["shopping_cart"])) {
$cart_count = count(array_keys($_SESSION["shopping_cart"]));
?>
<div class="cart_div">
<a href="cart.php"><img src="cart-icon.png" /> Cart<span><?php echo $cart_count; ?></span></a>
</div>
<?php
}
?>
	<div class="row">
        <div>
            <h2>Dear, Dahlia! Line</h2>
        </div>

        <hr>
		<?php
$result = mysqli_query($con,"SELECT * FROM `products`");
while($row = mysqli_fetch_assoc($result)){
	?>


		      <div class='column'>
			  <form method='post' action=''>
			  <div class='image'><img src=<?php echo$row['image'] ?> style= 'width: 100%' /></div>
			  <h3 class='name'>  <?php echo $row['name'] ?></h3>
			  <input type='hidden' name='code' value="<?php echo $row['code']?>" />
			  <p class='price'>RM<?php echo $row['price']?></p>
			  <p class='description'><?php echo $row['description'] ?></p>
			  <p>
			  <button type='submit' class='buy'>Buy Now</button>
</p>
			  </form>
		   	  </div>


				 <?php
        }
mysqli_close($con);
?>
	</div>

<div style="clear:both;"></div>

<div class="message_box" style="margin:10px 0px;">
<?php echo $status; ?>
</div>

</div>
</body>
</html>