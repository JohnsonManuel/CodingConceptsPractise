<?php include('server.php') ?>

<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Registration</title>
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

      td input[type="submit"]{
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
    <form  action="registration.php" method="post">
      <table cellpadding="0" cellspacing="0">
        <tr>
          <td >
          <h1>Registration</h1>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <?php include('errors.php') ?>
          </td>
        </tr>
        <tr>
          <td>
            Username:
          </td>
          <td>
            <input type="text" name="username" value="" required />
          </td>
        </tr>
        <tr>
          <td>
            Email:
          </td>
          <td>
            <input type="email" name="email" value=""required />
          </td>
        </tr>
        <tr>
          <td>
            Password
          </td>
          <td>
            <input type="text" name="password" value="" required/>
          </td>
        </tr>
        <tr>
          <td colspan="2" style="text-align:center;">
            <input type="submit"  name="Submit" value="Submit">
          </td>
        </tr>
      </table>
      <p>Already an user? <a href="login.php">Login</a></p>
    </form>

  </body>
</html>
