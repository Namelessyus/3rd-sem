<?php
include 'connect.php';
session_start();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="POST">
        Name:
        <input type="text" name="Name" id="">
        <br>
        Password:
        <input type="Password" name="Password" id="">
        <br>
        <input type="submit" name="Submit" id="">

        <?php
if(isset($_POST['Submit']))
{$Name=$_POST['Name'];
$Password=$_POST['Password'];
$sql="select * from dav where Name='$Name' and Password='$Password' limit 1";
$result=mysqli_query($conn,$sql);
$num=mysqli_num_rows($result);
if($num==1)
{
    $_SESSION['Profile']=$Name;
    header('location:welcome.php');
}
else{
    echo "error";
}
}
?>
    </form>
    
</body>
</html>
