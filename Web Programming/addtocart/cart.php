<?php
session_start();
$status="";
if (isset($_POST['action']) && $_POST['action']=="remove"){
if(!empty($_SESSION["shopping_cart"])) {
	foreach($_SESSION["shopping_cart"] as $key => $value) {
		if($_POST["code"] == $key){
		unset($_SESSION["shopping_cart"][$key]);
		$status = "<div class='box' style='color:red;'>
		Product is removed from your cart!</div>";
		}
		if(empty($_SESSION["shopping_cart"]))
		unset($_SESSION["shopping_cart"]);
			}		
		}
}

if (isset($_POST['action']) && $_POST['action']=="change"){
  foreach($_SESSION["shopping_cart"] as &$value){
    if($value['code'] === $_POST["code"]){
        $value['quantity'] = $_POST["quantity"];
        break; // Stop the loop after we've found the product
    }
}
  	
}
?>

<html>
<head>
<script src="https://kit.fontawesome.com/929a86cd76.js" crossorigin="anonymous"></script>
<title>Demure’ Beauty Shopping Cart </title>
<link rel='stylesheet' href='style.css'  type='text/css' media='all' />
<link rel="stylesheet" href= "../Assignment1/index.css"/>
</head>
<body>
	<div>
		<a href="../Assignment1/Homepage.php" style='text-decoration: none; color:#423525;' >
		<i class="fa-solid fa-arrow-left"></i> back</a>
</div>
<div style="width:700px; margin:50 auto;">

<h2>Demure’ Beauty Shopping Cart</h2>   

	<a href="cart.php" style="float:right; text-decoration: none; color:#423525;" >
            <?php
		if(!empty($_SESSION["shopping_cart"])) {
			$cart_count = count(array_keys($_SESSION["shopping_cart"]));
				?>
                <i class="fa-solid fa-cart-shopping"></i><?php echo $cart_count; ?>
                <?php
}
?>Items
            </a>

<div class="cart">
<?php
if(isset($_SESSION["shopping_cart"])){
    $total_price = 0;
?>	
<table class="cart-table">
<tbody>
<tr>
<td></td>
<td>ITEM NAME</td>
<td>QUANTITY</td>
<td>UNIT PRICE</td>
<td>ITEMS TOTAL</td>
</tr>	
<?php		
foreach ($_SESSION["shopping_cart"] as $product){
?>
<tr>
<td><img src='<?php echo $product["image"]; ?>' width="50" height="40" /></td>
<td><?php echo $product["name"]; ?><br/>
<form method='post' action=''>
    <input type='hidden' name='code' value="<?php echo $product["code"]; ?>"/>
    <input type='hidden' name='action' value="remove"/>
    <button type='submit' class='remove'>Remove Item</button>
</form>
</td>
<td>
<form method='post' action=''>
    <input type='hidden' name='code' value="<?php echo $product["code"]; ?>"/>
    <input type='hidden' name='action' value="change"/>
    <select name='quantity' class='quantity' onchange="this.form.submit()">
        <option <?php if($product["quantity"]==1) echo "selected";?> value="1">1</option>
        <option <?php if($product["quantity"]==2) echo "selected";?> value="2">2</option>
        <option <?php if($product["quantity"]==3) echo "selected";?> value="3">3</option>
        <option <?php if($product["quantity"]==4) echo "selected";?> value="4">4</option>
        <option <?php if($product["quantity"]==5) echo "selected";?> value="5">5</option>
    </select>
</form>
</td>
<td><?php echo "$".$product["price"]; ?></td>
<td><?php echo "$".$product["price"]*$product["quantity"]; ?></td>
</tr>
<?php
$total_price += ($product["price"]*$product["quantity"]);
}
?>
<tr>
<td colspan="5" align="right">
<strong>TOTAL:
    <?php echo "$".$total_price; ?></strong>
</td>
</tr>
</tbody>
</table>
<a href="checkout.php"><button type='submit'class= btn> Continue to Checkout </button></a>
<?php
}else{
	echo "<h3>Your cart is empty!</h3>";
	}
?>
</div>

<div style="clear:both;"></div>

<div class="message_box" style="margin:10px 0px;">
<?php echo $status; ?>
</div>

</div>
</body>
</html>