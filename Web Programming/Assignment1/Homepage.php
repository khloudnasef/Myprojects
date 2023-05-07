
<?php

session_start();

?>



<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" href="Homepage.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">  
        <script src="https://kit.fontawesome.com/929a86cd76.js" crossorigin="anonymous"></script> 
        <style>

            * {
                box-sizing: border-box;
            }

            body {
                padding: 10px;
                background-color: #fbf8f1;
                color: #423525;
                font-family: cutefont;
            }

            /* Header/Blog Title */
            .header {
                padding: 10px;
                text-align: center;
                background-color: #f7ecde;
                background-image: url("headtest2.png");
                background-repeat: no-repeat;
                background-size: 100%;
                height: auto;

            }

            .header h1 {
                font-size: 80px;
                color: #423525;
                font-family: Garamond;
                letter-spacing: 3.0px;
                font-weight: bold;

            }

            /* Style the top navigation bar */

            .topnav {
                overflow: hidden;
                background-color: #423525;
                position: sticky;
                top:0;
                z-index: 2;
            }

            /* Style the topnav links */
            .topnav a {
                float: left;
                display: block;
                color: #f2f2f2;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-family: cutefont;
                letter-spacing: 1.5px;
            }

            /* Change color on hover */
            .topnav a:hover {
                background-color: #ddd;
                color: black;
            }

            /* Create two unequal columns that floats next to each other
*/
            /* Left column */
            .leftcolumn {
                float: left;

                width: 75%;
            }

            /* Right column */
            .rightcolumn {
                float: left;
                width: 25%;
                background-color: #fbf8f1;
                padding-left: 20px;
            }

            /* Fake image */
            .fakeimg {
                /*background-color: #aaa;*/
                width: 100%;
                /*padding: 20px;*/
                display: inline-table;
            }

            /* Add a card effect for articles */
            .card {
                background-color: #f7ecde;
                padding: 20px;
                margin-top: 20px;
            }

            /* Clear floats after the columns */
            .row:after {
                content: "";
                display: table;
                clear: both;
            }

            /* Footer */
            .footer {
                padding: 20px;
                text-align: center;
                background-color: #423525;
                margin-top: 20px;

            }

            .footer p {
                font-size: 14px;
                font-family: cutefontlight;

            }

            /* Responsive layout - when the screen is less than 800px
wide, make the two columns stack on top of each other instead
of next to each other */
            @media screen and (max-width: 800px) {
                .leftcolumn,
                .rightcolumn {
                    width: 100%;
                    padding: 0;
                }
            }

            /* Responsive layout - when the screen is less than 400px
wide, make the navigation links stack on top of each other
instead of next to each other */
            @media screen and (max-width: 400px) {
                .topnav a {

                    float: none;
                    width: 100%;
                }
            }

            h2 {
                color: #423525;
                font-family: cutefont;
                letter-spacing: 0.06em;
            }

            .card p {
                text-align: justify;
                line-height: 1.5;
            }

            .subheader {
                font-family: cutefontlight;
                /*letter-spacing:3px;*/
                letter-spacing: 0.4em;
                font-weight: 30;
            }

            /*add new font */
            @font-face {
                font-family: cutefont;
                src: url("VisbyMedium.otf");
            }

            @font-face {
                font-family: cutefontlight;
                src: url("VisbyLight.otf");
            }

            hr{
                height: 1px;
                background-color: #423525;
                width: 33%;
                margin-bottom: 20px;
            }

        </style>
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
            <?php
if(!empty($_SESSION["shopping_cart"])) {
$cart_count = count(array_keys($_SESSION["shopping_cart"]));
?>
                <i class="fa-solid fa-cart-shopping"></i><?php echo $cart_count; ?>
                <?php
}
?>Items
            </a>
            <a href="../Testlogin/logout.php" style="float:right" >
                <i class="fa-solid fa-right-from-bracket"></i> 
            </a>
            
            <a style="float:right;" > Welcome <span><?php echo $_SESSION['user_name'] ?></span>
                <i  style=" margin-left: 5px;"class="fa-solid fa-user"></i>
            </a>

        </div>
        <div class="row">
            <div class="leftcolumn">

                <div class="card">
                    <h2 style="text-align:center">Shop Our Dear, Dahlia! Line</h2>
                    
                    <hr>

                    <div class="slideshow-container">

                        <!-- Full-width images with number and caption text -->
                        <div class="mySlides1">
                            <video width="100%" height="50%"  autoplay="autoplay" controls muted>
                                <source src="dahlia video (1).mp4" type="video/mp4">
                            </video>
                            
                        </div>

                        <div class="mySlides1">
                            <img src="dahlia (1).png" style="width:100%">
                        </div>

                        <div class="mySlides1">
                            <img src="dahlia (2).png" style="width:100%">
                        </div>

                        <div class="mySlides1">
                            <img src="dahlia (3).png" style="width:100%">
                        </div>

                        <!-- Next and previous buttons -->
                        <a class="prev" onclick="plusSlides(-1, 0)">&#10094;</a>
                        <a class="next" onclick="plusSlides(1, 0)">&#10095;</a>
                    </div>
                    <br>

                    <!-- The dots/circles -->
                    <div style="text-align:center">
                        <span class="dot" onclick="currentSlide(1,0)"></span>
                        <span class="dot" onclick="currentSlide(2,0)"></span>
                        <span class="dot" onclick="currentSlide(3,0)"></span>
                        <span class="dot" onclick="currentSlide(4,0)"></span>
                    </div>

                    <p>DEAR, DAHLIA! LINE</p>
                    <p>Designed and engineered in Demure's lab by our Demure Goddess Izue and Khloud. Enriched with Premium Purple Orchid Petals
                         from Jeju for the perfect goddess skin. 
                        Dear, Dahlia is ready to make our Demure Goddesses Glow and Shine for the world to witness. </p>
                </div>

                <div class="card">
                    <h2 style="text-align:center">Shop Our Dear, Lily! Line</h2>
                
                    <hr>

                    <div class="slideshow-container">

                        <!-- Full-width images with number and caption text -->
                        <div class="mySlides2">
                            <video width="100%" height="50%" autoplay="autoplay" controls muted>
                                <source src="lily video.mp4" type="video/mp4">
                            </video>
                            
                        </div>

                        <div class="mySlides2">
                            <img src="lily (1).png" style="width:100%">
                        </div>

                        <div class="mySlides2">
                            <img src="lily (2).png" style="width:100%">
                        </div>

                        <div class="mySlides2">
                            <img src="lily (3).png" style="width:100%">
                        </div>

                        <!-- Next and previous buttons -->
                        <a class="prev" onclick="plusSlides(-1, 1)">&#10094;</a>
                        <a class="next" onclick="plusSlides(1, 1)">&#10095;</a>
                    </div>
                    <br>

                    <!-- The dots/circles -->
                    <div style="text-align:center">
                        <span class="dot" onclick="currentSlide(1,1)"></span>
                        <span class="dot" onclick="currentSlide(2,1)"></span>
                        <span class="dot" onclick="currentSlide(3,1)"></span>
                        <span class="dot" onclick="currentSlide(4,1)"></span>
                    </div>

                    <p>DEAR, LILY! LINE</p>
                    <p>Dear, Lily! is the birth of Demure Beauty! What started off as a small beauty bar has now become a beauty lab catered to 
                        our goddesses! We made Dear, Lily to be safe and effective even for the goddesses with sensitive skin! 
                        Your skin needs help? Call for Lily!</p>
                </div>
            </div>

            <div class="rightcolumn">
                <div class="card">
                    <h2 style="font-style: italic; font-size:20px;">Behind Demure’ Beauty</h2>
                    <div class="fakeimg" style="height:60px;">
                        <img src="Demure Beauty Logo 3.png" style="width:100%">
                    </div>
                    <p>
                        The journey of Izue & Khloud started as two best friends that were very
                        passionate about beauty and nature. They find themselves always looking at new
                        products that consistently of elements that is good for the body but also
                        benefits the earth. That's how Demure Beauty was born. They make sure every
                        product of Demure Beauty are formulated with natural ingredients so our Demure
                        Goddesses can be a part of making the earth a better place.</p>
                </div>
                <div class="card">
                    <h3>Our Best Selling Product</h3>
                    <div class="container">
                        <img src="bestproduct (1).png" alt="product" class="image">
                        <div class="overlay">
                          <div class="text"><a href="Makeup.php" class="overlaytext">Click to view Line</a></div>
                        </div>
                      </div>
                    

                </div>
                <div class="card">
                    <h3>Follow Demure’ Beauty!</h3>
                    <a href="https://www.facebook.com/" class="fa fa-facebook"> </a>  
                    <a href="https://www.twitter.com/" class="fa fa-twitter"> </a>
                    <a href="https://www.instagram.com/" class="fa fa-instagram"> </a>  
                    <a href="https://www.pinterest.com/" class="fa fa-pinterest"> </a>
                    <p style="font-family: cutefontlight; text-align:center; letter-spacing:0.06em; font-size:15px">
                    Follow us to stay in the know!
                    </p>
                </div>
            </div>
        </div>
        <div class="footer">
            <p style="color: #f7ecde">&copy; Demure’ Beauty copyright</p>
        </div>
    </body>

    <!-- a little bit of javascript (looping the images) -->
    <script>
        var slideIndex = [1, 1];
        var slideId = ["mySlides1", "mySlides2"]
        showSlides(1, 0);
        showSlides(1, 1);

        function plusSlides(n, no) {
            showSlides(slideIndex[no] += n, no);
        }

        // Thumbnail image controls
        function currentSlide(n, no) {
            showSlides(slideIndex[no] = n);
        }

        function showSlides(n, no) {
            var i;
            var x = document.getElementsByClassName(slideId[no]);
            var dots = document.getElementsByClassName("dot");
            if (n > x.length) {
                slideIndex[no] = 1
            }
            if (n < 1) {
                slideIndex[no] = x.length
            }
            for (i = 0; i < x.length; i++) {
                x[i].style.display = "none";
            }

            for (i = 0; i < dots.length; i++) {
                dots[i].className = dots[i].className.replace(" active", "");
            }
            x[slideIndex[no] - 1].style.display = "block";
            dots[slideIndex[no]-1].className += " active";
        }
    </script>
</html>