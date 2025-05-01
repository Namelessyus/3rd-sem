

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="POST" enctype="multipart/form-data">

Name:
<input type="text" name="Name" id="">
Email:
<input type="email" name="Email" id="">
<br>
Gender:
<br>
<input type="radio" name="Gender" id="" value="Male">Male
<input type="radio" name="Gender" id="" value="female">female
<br>
Hobby:
<br>
<input type="checkbox" name="Hobby[]" id="" value="Singing">Singing
<input type="checkbox" name="Hobby[]" id="" value="Dancing">Dancing
<input type="checkbox" name="Hobby[]" id="" value="Cricket">Cricket
<br>
Address:
<select name="Address" id="">
    <option value="kathmandu">kathmandu</option>
    <option value="Pokhara">Pokhara</option>
    <option value="Chitwan">Chitwan</option>
</select>
Dob:
<input type="date" name="Dob" id="">
<br>
Picture:
<input type="file" name="Image" id="">
<br>
Cv:
<input type="file" name="Cv" id="">
<br>
<br>
<input type="submit" name="Submit" id="">
<button>
    <a href="view.php"> view records</a>
</button>


    <?php
    include 'connect.php';
    if(isset($_POST['Submit'])){
    $Name=$_POST['Name'];
    $Email=$_POST['Email'];
    $Gender=$_POST['Gender'];
    $Hob=$_POST['Hobby'];
    $Hobby=implode(',',$Hob);
    $Address=$_POST['Address'];
    $Dob=$_POST['Dob'];
    $Pic=$_FILES['Image']['name'];
    $temp1=$_FILES['Image']['tmp_name'];
    $folder1='Pic/'.$Pic;
    move_uploaded_file($temp1,$folder1);
    $Cv=$_FILES['Cv']['name'];
    $temp2=$_FILES['Cv']['tmp_name'];
    $folder2='Cv/'.$Cv;
    move_uploaded_file($temp2,$folder2);
    $sql="Insert into student(Name,Email,Gender,Hobby,Address,Dob,Picture,Cv)
    Values('$Name','$Email','$Gender','$Hobby','$Address','$Dob','$folder1','$folder2')";
    $result=mysqli_query($conn,$sql);
    if($result){
        echo"records were inserted successfully";
    }else{
        echo"error in inserting records";
    }
}
    

    ?>
    </form>
</body>
</html>