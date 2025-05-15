<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p>Multiplication table</p>
    <table border='1'>
        <?php
            $mul = 5;
            $till = 10;
            for($i=1;$i<=$till;$i++){
                echo "<tr>";
                    echo "<td>";
                        echo "$mul * $i = ".($mul*$i);
                    echo "</td>";
                echo "</tr>";
            }

        ?>
    </table>

    <hr>

</body>
</html>


<?php
echo"All kinds of math function.";
echo"<br>";
$a =2;
$b =3;
echo"sum=".($a+$b);
echo"<br>";
echo"difference=".($a-$b);
echo"<br>";
echo"product=".$a*$b;
echo"<br>";
echo"modulus=".$a%$b;
echo"<br>";
echo"post increment=".$a++;
echo"<br>";
echo"pre increment=".$a--;
echo"<br>";
echo"power=".$a**$b;
echo"<br>";
?>
