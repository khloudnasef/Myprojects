<?php

@include 'config.php';


?>

<!DOCTYPE html>
<html lang="en">
    <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/929a86cd76.js" crossorigin="anonymous"></script>
        <title>Edit Users</title>

        <!-- custom css file link -->
        <link rel="stylesheet" href="style.css">

    </head>
    <body>


    <div class="form-container">

        <?php

        if(isset($_GET['id']))
        {
            $name_id = mysqli_real_escape_string($conn, $_GET['id']);
            $query = "SELECT * FROM user_form WHERE id='$name_id'";

            $query_run = mysqli_query($conn, $query);

            if(mysqli_num_rows($query_run) > 0)
            {
                $user = mysqli_fetch_array($query_run);
                ?>

                <form action="update.php" method="post">


                    <input type="hidden" name = "name_id" value="<?=$name_id?>">
                    <h2>Edit Users</h2>

                    <lable>Edit Name <lable>
                    <input type="text" name="name" value="<?=$user['name'];  ?>" placeholder="enter new name">

                    <lable>Edit Email <lable>
                    <input type="email" name="email" value="<?=$user['email'];  ?>"  placeholder="enter new email">

                    <select name="user_type" value= "<?=$user['user_type'];  ?>">
                    <option value="user">user</option>
                    <option value="admin">admin</option>
                
                    </select>

                    <input type="submit" name="Update" value="Update" class="form-btn">
                    
                </form>
                <?php
            }
            else
            {
                echo "<h4> No Such Id Found";
            }
        }

        ?>

    </div>

</body>
</html>