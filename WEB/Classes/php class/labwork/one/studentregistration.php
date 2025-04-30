<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
    <style>
        .Submit{
            text-decoration: none;
            color:white;
            font-weight: bold;        
            background:navy;
            border-radius:5px;
            width:"100%";
        }
        
        table {
    margin: 50px auto;     
    border: 1px solid black; 
    border-collapse: collapse; 
}

        .secondrow{
            display:flex;
            justify-items:baseline;
            flex-direction: row;
            justify-content: space-between;
        }

        .thirdrow{
            display:flex;
            justify-items:baseline;
            flex-direction: row;
            justify-content: space-between;
        }

    

    </style>
</head>
<body>

<table cellpadding="10px"> 

<td>
    <form action="" method="POST">

    Full Name: <br>
    <input type="text" name="Name" id="required">
    <br>
    Email Address: <br>
    <input type="email" name="Email" id="required">
    <br>


    <div class="secondrow">
        <div class="left">
    Date of Birth <br>
    <input type="date" name="Date" id="required">
    </div>

 <div class="right">
    Dorties Bio: <br>
    <input type="checkbox" name="Bio" id="" value="">Reading 
    <input type="checkbox" name="Bio" id="" value="">Sports  
    <br>
    <input type="checkbox" name="Bio" id="" value="">Coding
    <input type="checkbox" name="Bio" id="" value="">Music
    </div>
    </div>


    Hobbies: <br>
    <div class="thirdrow">
    <div class="lft">
    <input type="checkbox" name="Hobbies" id="" value="">Reading <br>
    <input type="checkbox" name="Hobbies" id="" value="">Sports <br>
    <input type="checkbox" name="Hobbies" id="" value="">Coding 
    </div>
    <div class="rit">
    <input type="checkbox" name="Hobbies" id="" value="">Sports <br>
    <input type="checkbox" name="Hobbies" id="" value="">Music
    </div>
    </div>

<br>
Upload Photo <br>
<input type="file" name="Photo" id="">
<br>

    Short Bio: <br>
<textarea name="Textarea" id=""></textarea>
    <br>
    <input type="checkbox" name="" id="required" value="">I agree to the terms and conditions

    <br>

    <input Class="Submit" type="Submit" name="Submit" id="">
    </td>
    </form>
    </table>

    <?php
    include 'connect.php';
    if(isset($_POST['Submit']))
        {
        $Name=$_POST['Name'];
        $Email=$_POST['Email'];
        $Date=$_POST['Date'];
        $Bio=$_POST['Bio'];
        $Hobbies=$_POST['Hobbies'];
        $Photo=$_POST['Photo'];
        $Textarea=$_POST['Textarea'];


        $sql = "INSERT INTO student (Name, Email, Date, Bio, Hobbies, Photo, Textarea) VALUES ('$Name', '$Email', '$Date', '$Bio', '$Hobbies' '$Photo' '$Textarea,)";
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