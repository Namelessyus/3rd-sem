<?php
include 'connect.php';
$sql = "update student set marks= 70 where name ='hari'";
$result=mysqli_query($conn, $sql);
if($result)
{
    echo "Records were updated sucessfully";
}
else{
    echo "Records were not updated" .mysquli_error($conn);
}
?>