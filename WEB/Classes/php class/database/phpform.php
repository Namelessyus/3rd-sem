<!DOCTYPE html>
<html>
<head>
    <title>Form php</title>
</head>
<style>
    a {
        text-decoration: none;
        color: black;
    }
</style>

<body>
    <form action="" method="POST">
        Email:
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="email" name="Email" id="required">
        <br><br>
        Password:
        <input type="password" name="Password" id="required">
        <br><br>
        <input type="submit" name="Submit" id="" value="Signup">
        <button>
            <a href="login.php">Login</a>
        </button>
            
        <?php
        include 'connect.php';
        if(isset($_POST['Submit'])){
        $Email=$_POST['Email'];
        $Password=md5($_POST['Password']);
        
        $checkquery="Select Email from sat where Email='$Email'";
        $result=mysqli_query($conn, $checkquery);
        $num=mysqli_num_rows($result);
        if($num>0){
            echo "Email already exists ";
        }else{
            $sql="insert into sat(Email,Password) values ('$Email','$Password')";
            $result=mysqli_query($conn, $sql);
            if($result){
                echo "signup successfully";
            }else{
                echo "error in signup";
            }
            }   
        }
        ?>

    </form>
</body>
</html>