<!DOCTYPE html>
<html>
<head>
    <title>form php</title>
</head>
<body>
    <form action="" method="POST" enctype="multipart/form-data">
        Name:
        <input type="text" name="Name" id="">
        <br>

        Email:
        <input type="text" name="Email" id="">
        <br>

        Phone:
        <input type="text" name="Phone" id="">
        <br>

        Address:
        <select name="Address" id="">
            <Option value="Kathmandu">Kathmandu</Option>
            <Option value="Pokhara">Pokhara</Option>
            <Option value="Chitwan">Chitwan</Option>
            <Option value="Dang">Dang</Option>
        </select>
        <br>

        Gender:
        <input type="radio" name="Gender" id="" value="Male">Male
        <input type="radio" name="Gender" id="" value="Female">Female
        <input type="radio" name="Gender" id="" value="Other">Other
        <br>

        <!-- [] - this is array because we select multiple options-->
        Hobby:
        <input type="checkbox" name="Hobby[]" id="" value="Singing">Singing
        <input type="checkbox" name="Hobby[]" id="" value="Dancing">Dancing
        <input type="checkbox" name="Hobby[]" id="" value="Drawing">Drawing
        <input type="checkbox" name="Hobby[]" id="" value="Swimming">Swimming
        <br>

        <input type="file" name="Image" id="">
        <br>

        <input type="file" name="CV" id="">
        <br>

        <input type="submit" name="Submit" id="">
    </form>

    <br>

    <?php
    if(isset($_POST['Submit']))
    {
        $Name=$_POST['Name'];
        $Email=$_POST['Email'];
        $Phone=$_POST['Phone'];
        $Address=$_POST['Address'];
        $Gender=$_POST['Gender'];
        $Hobby=$_POST['Hobby'];
        
        $pic=$_FILES['Image']['name'];
        $temp=$_FILES['Image']['tmp_name'];
        $folder='image/'.$pic;

        $cv=$_FILES['CV']['name'];
        $temp1=$_FILES['CV']['tmp_name'];
        $folder1='image/'.$cv;

        move_uploaded_file($temp,$folder);
        move_uploaded_file($temp1,$folder1);




        echo "Your informations are";
        echo "<hr>";
        echo "Name: $Name";
        echo "<br>";
        echo "Email: $Email";
        echo "<br>";
        echo "Phone: $Phone";
        echo "<br>";
        echo "Address: $Address";
        echo "<br>";
        echo "Gender: $Gender";
        echo "<br>";
        echo "Hobby:";
        foreach($Hobby as $value)
        echo $value.", ";
        echo "<br>";
        echo"<img src='$folder' height='100px' width='100px'>";
        echo "<br>";
        echo"<a href='$folder1'>CV</a>";

        }
    ?>
</body>
</html>