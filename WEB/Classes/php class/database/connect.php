<!--
$host = "localhost";
$user = "root";
$pass = "";
$conn = mysqli_connect($host, $user, $pass);
if($conn)
{
    echo "database is connected";
}
else{
    echo "database is not connected";
}
$sql="CREATE DATABASE simclass";
$result=mysqli_query
?>



$host = "localhost";
$user = "root";
$pass = "";
$conn = mysqli_connect($host, $user, $pass);
if($conn)
{
    echo die ('database is not connected');
}
-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>connect</title>
</head>
<body>
    <?php
        $host="localhost";
        $username="root";
        $password="";
        $db="bca";
        $conn = mysqli_connect($host,$username,$password,$db);
        if(!$conn){
            echo die("<h1>database is not connected: ".mysqli_connect_error()."</h1><hr>");
        }
    ?>
</body>
</html>

