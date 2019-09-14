<?php include('server.php') ?>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="icon" href="https://www.pngarts.com/files/3/Letter-P-PNG-Download-Image.png">
    <style media="screen">
      form{
        position: absolute;
        top: 50%;
        left:50%;
        transform: translate(-50%,-50%);
        border: 1px solid black;
        padding: 30px;
      }
      td{
        padding-bottom: 20px;
        font-size: 20px;
      }
      td input{
        outline: none;
      }

      td input[type="submit"],button{
        background: blue;
        color: white;
        border-radius: 10px;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
      }
    </style>
  </head>
  <body>
    <form  action="login.php" method="post">
      <?php include('errors.php') ?>
      <table cellpadding="0" cellspacing="0">
        <tr>
          <td >
          <h1>Login</h1>
          </td>
        </tr>
        <tr>
          <td>
            Username:
          </td>
          <td>
            <input type="text" name="login-username" value="" required/>
          </td>
        </tr>
        <tr>
          <td>
            Password
          </td>
          <td>
            <input type="text" name="login-password" value="" required/>
          </td>
        </tr>
        <tr>
          <td colspan="2" style="text-align:center;">
            <button type="submit" name="login_user">Login</button>
          </td>
        </tr>
      </table>
      <p>New user ? <a href="registration.php">Register</a></p>
    </form>

  </body>
</html>
