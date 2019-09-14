<?php
session_start();
// if(isset($_SESSION['username'])){
//
//   $_SESSION['msg']="You must login to view this page";
//   header("location: login.php");
// }
if(isset($_GET['logout'])){
  session_destroy();
  unset($_SESSION['username']);
    header("location: login.php");
}
 ?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home page</title>
    <link rel="icon" href="https://www.pngarts.com/files/3/Letter-P-PNG-Download-Image.png">
    <style>
    html{
      font-size: 20px;
    }
      body{
        background-image:linear-gradient(rgba(0, 0, 0, 0.5),rgba(0, 0, 0, 0.5)), url(https://i.imgur.com/emSvYMy.gif);
        background-size: 100vw 100vh;
        background-repeat: no-repeat;
        font-family: sans-serif;
        color: white;
      }
      .container{
        position: absolute;
        top:50%;
        left:50%;
        transform: translate(-50%,-50%);
        text-align: center;
      }
      button{
        background: red;
        border: none;
        color: white;
        padding: 5px 10px;
        border-radius: 15px;
      }
      button a{
        color: white;
        text-decoration: none;
      }
      h1{
        text-decoration: underline;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Welcome to the homepage</h1>
      <?php
      if(isset($_SESSION['success'])): ?>

      <h3>
        <?php
        echo $_SESSION['success'];
        unset($_SESSION['success']);
         ?>
      </h3>
    <?php endif  ?>

    <?php if(isset($_SESSION['username'])): ?>

      <h3> Welcome  <strong><?php echo $_SESSION['username']; ?></strong> </h3>

      <button><a href="index.php?logout='1'">Logout</a></button>
    <?php endif ?>

    </div>

  </body>
</html>
