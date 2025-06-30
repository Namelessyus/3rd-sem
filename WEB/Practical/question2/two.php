<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="POST" enctype="multipart/form-data">
        Name: <input type="text" name="Name" required>
        Email: <input type="email" name="Email" required>
        Photo: <input type="file" name="Picture" required>
        <input type="submit" name="Submit">
    </form>
    <?php
    $host="localhost";
    $user="root";
    $password="";
    $db="Dav";
    $conn=mysqli_connect($host,$user,$password,$db);
    if(!$conn)
    {
        die("Connection not established".mysqli_connect_error);
    }

    if(isset($_POST['Submit']))
    {
        $Name=$_POST['Name'];
        $Email=$_POST['Email'];
        $Picture=$_FILES['Picture']['name'];
        $Temp=$_FILES['Picture']['tmp_name'];
        $Pic='pic/'.$Picture;
        move_uploaded_file($Temp,$Pic);
        $sql="INSERT INTO exam (Name,Email,Picture) VALUES('$Name','$Email','$Pic')";
        $result=mysqli_query($conn,$sql);
        if($result)
        {
            echo "Inserted into the database successfully";
        }
    }

    ?>
</body>
</html>

<!DOCTYPE html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <?php echo "$Name"; ?>!</h2>
    <img src="<?php echo '$Picture'?>" alt="Picture" width="200">
</body>
</html>

<?php
session_start(); 
$host = "localhost";
$user = "root";
$password = "";
$db = "Dav";
$conn = mysqli_connect($host, $user, $password, $db);

if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}
if (!isset($_SESSION['Email'])) {
    header("Location: index.php");
    exit();
}
$Email = $_SESSION['Email'];
$sql = "SELECT * FROM exam WHERE Email = '$Email'";
$result = mysqli_query($conn, $sql);
if ($row = mysqli_fetch_assoc($result)) {
    $Name = $row['Name'];
    $Picture = $row['Picture'];
}
?>