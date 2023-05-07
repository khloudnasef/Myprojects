<?php

@include 'config.php';

session_start();

if(!isset($_SESSION['admin_name'])){
   header('location:login_form.php');
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://kit.fontawesome.com/929a86cd76.js" crossorigin="anonymous"></script>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>admin page</title>

   <!-- custom css file link  -->
   <link rel="stylesheet" href="../Assignment1/index.css">

</head>
<body>


<body>
<div class="header">
            <h1>Demure’ Beauty</h1>
            <p class="subheader">“Demure’ Goddesses don’t need crowns, we need Demure’ Beauty”</p>
        </div>
        <div class="topnav">

        <a href="login_form.php">Login</a>
        <a href="register_form.php">Register</a>

        <a href="logout.php" style="float:right">logout <i class="fa-solid fa-right-from-bracket"></i></a>

        <a style="float:right;" >  Welcome <span><?php echo $_SESSION['admin_name'] ?></span> 
                <i  style=" margin-left: 5px;"class="fa-solid fa-user"></i>
            </a>

          
</div>
   
<div class="container">

   <div class="searchbox">

    <form action="" method= "GET">
        <div class="input-group mb-3">
            <input
                type="text"
                name="search"
                value="<?php if(isset($_GET['search'])){echo $_GET['search'];} ?>"
                class="form-control"
                placeholder="Search data">
                <button type="submit" class="butt btn-primary" >Search</button>
            </div>

      </form>
   </div>

   <div class="display">
      <table class= table table-bordered>
            <thead>
               <tr>
                  <th>ID</th>
                  <th>Name</th>
                  <th>Email</th>
                  <th>User Type</th>
                  <th>Action</th>
               </tr>

            </thead>
            <tbody>
               <?php

                  if(isset($_GET['search']))
                  {
                     $filtervalues = $_GET['search'];
                     $query = "SELECT * FROM user_form WHERE CONCAT(name) LIKE '%$filtervalues%'" ;
                     $query_run = mysqli_query($conn, $query);


                     if(mysqli_num_rows($query_run)>0)
                     {


                        foreach($query_run as $items)
                        {
                           ?>

                           <tr>
                                 <td> <?= $items['id'];?></td>
                                 <td> <?= $items['name'];?></td>
                                 <td> <?= $items['email'];?></td>
                                 <td> <?= $items['user_type'];?></td>
                                 
                                 <td> 
                                 <a href="student-edit.php?id=<?= $items['id'];?>" ><i class="fa-solid fa-pen-to-square"></i> <a>
                                 
                                 <form action="register_form.php" method = "POST">
                                    <button type= "submit" name = "delete_user" value="<?=$items['id'] ?> "><i class="fa-solid fa-trash-can"></i><a>
                                 </form>
                                    
                                 </td>
                           </tr>

                           <?php
                        }
                     }
                     else
                     {
                           ?>

                           <tr>
                                 <td coldspan= "4">No record Found</td>
                           </tr>

                           <?php
                     }
                  }

               ?>

            </tbody>
      </table>

   </div>



</body>
</html>