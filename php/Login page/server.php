<?php

session_start();
// initializing variables
$errors = array();
$username = "";
$email="";
$password = "";

//connect to db

$db = mysqli_connect('localhost','root','','practise') or die("Could not connect to database");

//Registering the user
if (isset($_POST['username'])) {
$username = mysqli_real_escape_string($db, $_POST["username"]);
}
if (isset($_POST['email'])) {
$email = mysqli_real_escape_string($db, $_POST["email"]);
}
if (isset($_POST['password'])) {
$password = mysqli_real_escape_string($db, $_POST["password"]);
}
//
if(empty($username)){array_push($errors,"Username is required");}
if(empty($email)){array_push($errors,"email is required");}
if(empty($password)){array_push($errors,"password is required");}


//check db if username already exists

$user_check_query="SELECT * FROM user_details WHERE username ='$username' or email ='$email' LIMIT 1";
$result = mysqli_query($db,$user_check_query);

$user = mysqli_fetch_assoc($result);

if($user){
  if($user['username'] === $username){array_push($errors,"Username already exists");}
  if($user['email'] === $password){array_push($errors,"Eamil already exists ");}
}

if(count($errors)==0){
  $query = "INSERT INTO user_details (username,email,password) VALUES ('$username','$email','$password')";
  mysqli_query($db,$query);

  $_SESSION['username'] =$username;
  $_SESSION['success'] = "Login from REGISTREATION form succesfully";
  header('location: index.php');
}

//LOGIN PAGE LOGIC
$login_errors =array();
if(isset($_POST['login_user'])){

  $username = mysqli_real_escape_string($db,$_POST['login-username']);
  $password = mysqli_real_escape_string($db,$_POST['login-password']);

  if(empty($username)){
    array_push($login_errors,"Login username is required");
  }
  if(empty($password)){
    array_push($login_errors,"Login password user is required");
  }
  if(count($login_errors) == 0){

    $query = "SELECT * FROM user_details WHERE username='$username' AND password='$password'";
    $results = mysqli_query($db,$query);
    if(mysqli_num_rows($results)){
      $_SESSION['username']=$username;
      $_SESSION['success']="Login through login page succesful";
      header('location: index.php');
    }
    else{
      array_push($login_errors,"Login wrong please enter correct details");
    }
  }else{
    array_push($login_errors,"error still exist");
  }
}
 ?>
