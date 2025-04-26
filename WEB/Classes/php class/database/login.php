 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        a{
            text-decoration: none;
            color:black;
        }
    </style>
</head>
<body>
    <form action="" method="POST">
Email:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="Email" id="" required>
<br>
<br>
Password:
<input type="password" name="Password" id="" required>
<br>
<br>
<input type="Submit" name="Submit" id="" value="Signup">
<button>
    <a href="loginn.php">Login</a>
</button>
<?php
include 'connect.php';
if(isset($_POST['Submit']))
{
$Email=$_POST['Email'];
$Password=md5($_POST['Password']);
$checkquery="Select Email from sat where Email='$Email'";
$result=mysqli_query($conn,$checkquery);
$num=mysqli_num_rows($result);
if($num>0)
{
    echo "Email is already exist";
}
else{
    $sql="insert into sat values ('$Email','$Password')";
    $result=mysqli_query($conn,$sql);
    if($result)
    {
        echo "signup succesfully";
    }
    else{
        echo "error in signup";
    }}

}

?>
    </form>
</body>
</html>


Login.php

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="" method="POST">
Email:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="Email" id="" required>
<br>
<br>
Password:
<input type="password" name="Password" id="" required>
<br>
<br>
<input type="Submit" name="Submit" id="" value="login">
<?php
include 'connect.php';
if(isset($_POST['Submit'])){
$Email=$_POST['Email'];
$Password=$_POST['Password'];
$sql="Select * from Sat where Email='$Email' and Password='$Password' limit 1";
$result=mysqli_query($conn,$sql);
if($row=mysqli_fetch_assoc($result))
{
    echo "welcome $Email ";
}
else{
    echo "login failed";
}}


?>
</>
</body>
</html>