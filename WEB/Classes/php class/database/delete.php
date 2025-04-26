<?php
include 'connect.php';
$sql = "delete from student where name ='hari'";
$result=mysqli_query($conn, $sql);
if($result)
{
    echo "Records were deleteded sucessfully";
}
else{
    echo "Records were not deleteded" .mysquli_error($conn);
}
?>