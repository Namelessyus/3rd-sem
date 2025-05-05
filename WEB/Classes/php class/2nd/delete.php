<?php
include 'connect.php';
$Id=$_GET['Id'];
$sql="select * from student where Id = '$Id'";
$result=mysqli_query($conn,$sql);
$row=mysqli_fetch_assoc($result);
$del="delete from student where Id = '$Id'";
$res=mysqli_query($conn,$del);
if($res)
{
    ?>
    <script>
        alert("Do you really want to delete?");
        alert("Deleted sucessfully");
        window.location.href='view.php';
    </script>
<?php
}
else{
    echo "error";
}


?>

