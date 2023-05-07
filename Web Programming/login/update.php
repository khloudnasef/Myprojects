<?php
session_start();
@include 'config.php';



if(isset($_POST['Update']))
{
    $name_id = mysqli_real_escape_string($conn, $_POST['name_id']);
   $name = mysqli_real_escape_string($conn, $_POST['name']);
   $email = mysqli_real_escape_string($conn, $_POST['email']);
   $user_type = $_POST['user_type'];

   $query = "UPDATE user_form SET name='$name', email='$email', user_type='$user_type' WHERE id = '$name_id'";

   $query_run = mysqli_query($conn, $query);

   if($query_run)
   {
        $_SESSION['message'] = "User Updated Successfully";
        header("Location: admin_page.php");
        exit(0);
   }
   else
   {
        $_SESSION['message'] = "User Updated Unsuccessfully";
        header("Location: admin_page.php");
        exit(0);
   }
}




?>