
<?php
include 'connect.php';
session_start();
$user=  $_SESSION['Profile'];
if($user==true){
}
else{
    echo "need to login";
    header('location:login.php');
}
$sql="select * from dav where Name='$user'";
$result=mysqli_query($conn,$sql);
$row=mysqli_fetch_assoc($result);

echo "welcome". $row['Name'];

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <br>
    <img src="<?php   echo $row['Picture'];?>" alt="" height="100px" width="100px">
    <button>
        <a href="logout.php">logout</a>
    </button>
</body>
</html>
