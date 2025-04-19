<?php

$greeting="Hello";
echo $greeting;
echo "<br>";

$name="Anushma";
echo $name;
echo "<br>";

$age=19;
echo $age;
echo "<br>";

echo "My name is $name";
echo "<h1>".$greeting."</h1>"
?>

<!DOCTYPE html>
<html>
<head>
    <title>Php</title>
</head>
<body>
    <table border="2">
        <td>
            <?php
            $name="Anushma";
            echo $name;
            echo "<br>";
            ?>
            </td>
            <td>
            <?php
            $age=19;
            echo $age;
            echo "<br>";
            ?>
        </td>
    </table>
</body>
</html>

<?php
//integer
$a=5;
$b=10;
echo $a;
echo "<br>";


//float


//string
$d="hello";
var_dump($d);
$e="hello";
echo "<br>";
var_dump($e);
echo "<br>";
//boolean

var_dump ($f);
echo "<br>";

var_dump ($g);
echo "<br>";

var_dump ($h);

//array
$i=array(1,2,3,4,5,"hello",true,1.1);
$j=["ran","shyam","hari"];
echo"<br>";
var_dump($i);
echo"<br>";

var_dump($j);

?>