<?php
session_start();
@include 'config.php';



if(isset($_POST['delete_user']))
{
    $name_id = mysqli_real_escape_string($conn, $_POST['delete_user']);
    $query = "DELETE FROM user_form WHERE id='$name_id'";
    $query_run = mysqli_query($conn, $query);

    if($query_run)
    {
        $_SESSION['message'] = "User Deleted sucessfully";
        header("Location: admin_page.php");
        exit(0);
    }
    else
    {
        $_SESSION['message'] = "User Deleted Unsuccessfully";
        header("Location: admin_page.php");
        exit(0);
    }


}



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

if(isset($_POST['submit'])){

   $name = mysqli_real_escape_string($conn, $_POST['name']);
   $email = mysqli_real_escape_string($conn, $_POST['email']);
   $pass = md5($_POST['password']);
   $cpass = md5($_POST['cpassword']);
   $user_type = $_POST['user_type'];

   $select = " SELECT * FROM user_form WHERE email = '$email' && password = '$pass' ";

   $result = mysqli_query($conn, $select);

   if(mysqli_num_rows($result) > 0){

      $error[] = 'user already exist!';

   }else{

      if($pass != $cpass){
         $error[] = 'password not matched!';
      }else{
         $insert = "INSERT INTO user_form(name, email, password, user_type) VALUES('$name','$email','$pass','$user_type')";
         mysqli_query($conn, $insert);
         header('location:login_form.php');
      }
   }

};


?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/929a86cd76.js" crossorigin="anonymous"></script>
        <title>register form</title>

        <!-- custom css file link -->
        <link rel="stylesheet" href="style.css">

    </head>
    <body>


    <div class="form-container">

        <form action="" method="post">
            <h3>register now</h3>
            <?php
      if(isset($error)){
         foreach($error as $error){
            echo '<span class="error-msg">'.$error.'</span>';
         };
      };
      ?>

      
            <input
                type="text"
                name="name"
                required="required"
                placeholder="enter your name">
            <input
                type="email"
                name="email"
                required="required"
                placeholder="enter your email">
            <input
                type="password"
                name="password"
                required="required"
                placeholder="enter your password">
            <input
                type="password"
                name="cpassword"
                required="required"
                placeholder="confirm your password">

                <select name="user_type">
                    <option value="user">user</option>
                    <option value="admin">admin</option>
                </select>
            
            <input type="submit" name="submit" value="register now" class="form-btn">
            <p>already have an account?
                <a href="login_form.php">login now</a>
            </p>
        </form>

    </div>

</body>
</html>