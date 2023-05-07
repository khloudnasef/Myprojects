

<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>checkout</title>
   <link rel="stylesheet" href= "../Assignment1/index.css"/>
   <script src="https://kit.fontawesome.com/929a86cd76.js" crossorigin="anonymous"></script>

</head>
<body>

<style>
    body{
        background-image: url(registerbg.png);
    }
</style>

<div>
		<a href="cart.php" style='text-decoration: none; color:#423525;' >
		<i class="fa-solid fa-arrow-left"></i> back</a>
</div>
<div class="container">

<section class="checkout-form">

   

   <form action="placeorder.php" method="post">

   <h1 class="heading" style='color:#423525; letter-spacing: 1.2px;'> Checkout Page</h1>
   <div class="display-order">
    

      <div class="flex">
         <div class="inputBox">
         
            <span><i class="fa-solid fa-user"></i>  Name</span>
            
            <input type="text" placeholder=" enter your name" name="name" required>
         </div>
         <div class="inputBox">
            <span><i class="fa-solid fa-phone"> </i> Phone Number</span>
            <input type="number" placeholder=" enter your number" name="number" required>
         </div>
         <div class="inputBox">
            <span><i class="fa-solid fa-envelope"></i> Email</span>
            <input type="email" placeholder=" enter your email" name="email" required>
         </div>
         <div class="inputBox">
            <span><i class="fa-solid fa-credit-card"></i> Payment Method</span>
            <select name="method">
               <option value=" cash on delivery" selected>cash on devlivery</option>
               <option value=" credit cart">credit cart</option>
               <option value=" paypal">paypal</option>
            </select>
         </div>
         <div class="inputBox">
            <span><i class="fa-solid fa-address-card"></i> Address line </span>
            <input type="text" placeholder=" e.g. flat no." name="flat" required>
         </div>

         <div class="inputBox">
            <span><i class="fa-solid fa-city"></i> City</span>
            <input type="text" placeholder=" e.g. Kuala Lumpur" name="city" required>
         </div>
         <div class="inputBox">
            <span><i class="fa-solid fa-location-dot"></i> State</span>
            <input type="text" placeholder=" e.g. Selangor" name="state" required>
         </div>
         <div class="inputBox">
            <span><i class="fa-solid fa-flag"></i> Country</span>
            <input type="text" placeholder=" e.g. Malaysia" name="country" required>
         </div>
         <div class="inputBox">
            <span> <i class="fa-solid fa-map-pin"></i> Zip code</span>
            <input type="text" placeholder=" e.g. 123456" name="pin_code" required>
         </div>
      </div>
      
      <input type="submit" value="order now" name="order_btn" class="btn">
   </form>





</section>

</div>

   
</body>
</html>