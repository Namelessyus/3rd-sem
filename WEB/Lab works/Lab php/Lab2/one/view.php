<!DOCTYPE html>
<html>
<body>
    <?php
        include 'connect.php';

$sql = "SELECT * FROM user_info";
	$result = mysqli_query($conn,$sql);
	$num=mysqli_num_rows($result);
	if($num>0){
        echo "<table border=1>";
        while($row=mysqli_fetch_assoc($result)){
            echo "<tr>";
			echo "<td>".$row['Name']."</td>";
			echo "<td>".$row['Email']."</td>";
			echo "<td>".$row['Phone']."</td>";
			echo "<td>".$row['Gender']."</td>";

			echo "</tr>";
		}
        echo "</table>";
	}
    ?>
    </body>
</html>
