<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
    <style>
        a{
            text-decoration: none;
            color:red;
        }
    </style>
</head>
<body>
    <form action="" method="POST">

    Name:
    <input type="text" name="Name" id="required">
    <br>
    Email:
    <input type="email" name="Email" id="required">
    <br>
    Phone:
    <input type="number" name="Tel" id="required">
    <br>
    Gender:
    <input type="radio" name="Gender" id="" value="Male">Male 
    <input type="radio" name="Gender" id="" value="Female">Female 
    <input type="radio" name="Gender" id="" value="Other">Other
    <br>
    Address
    <select name="Address" id="required">
    <option value="Kathmandu">Kathmandu</option>
    <option value="Lalitpur">Lalitpur</option>
    <option value="Bhaktapur">Bhaktapur</option>
    <option value="Kumaripati">Kumaripati</option>
    </select>



    <br>
    <input type="Submit" name="Submit" id="">

    <button>
        <a href="view.php">View records</a>
    </button>

    </form>

    <?php
    include 'connect.php';
    if(isset($_POST['Submit']))
        {
        $Name=$_POST['Name'];
        $Email=$_POST['Email'];
        $Phone=$_POST['Tel'];
        $Gender=$_POST['Gender'];
        $Address=$_POST['Address'];
        $sql = "INSERT INTO student (Name, Email, Phone, Gender, Address) VALUES ('$Name', '$Email', '$Phone', '$Gender', '$Address')";
        $result=mysqli_query($conn,$sql);
        if($result)
        {
            echo "records were inserted sucessfully";
        }else{
            echo"there is an error on inserting";
        }
        }
        ?>
</body>
</html>