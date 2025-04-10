<?php

//for loop
for ($i = 0; $i < 10; $i++) {
    echo "Chicken". "banana" . "<br>";
}

echo "<hr>";

//multiplication of 5
$a=5;
for ($i = 1; $i < 10; $i++) 
{
echo "$a*$i = " .$a*$i. "<br>";
}

echo "<hr>";

//multiplication table
$a=5;
echo"<table border='1'>";
for ($i = 1; $i < 10; $i++) 
{
    echo "<tr>";
echo "<td>"." $a*$i "."</td>";
echo"<td>" ." $a*$i "."</td>";
echo "</tr>";
}
?>
