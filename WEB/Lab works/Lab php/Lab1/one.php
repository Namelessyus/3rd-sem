<p>1. Write a PHP program to print your name.</p>
<?php
$name="My name is Anushma";
echo $name;
echo "<hr>";
?>

<p>2. Write a PHP to perform addition, subtraction, multiplication division, and modulus.</p>
<?php
$a =2;
$b =3;
echo"sum = ".($a+$b);
echo"<br>";
echo"difference = ".($a-$b);
echo"<br>";
echo"product = ".$a*$b;
echo"<br>";
echo"division = ".$a/$b;
echo"<br>";
echo"modulus = ".$a%$b;
echo "<hr>";
?>

<p>3. Write a PHP program to print the date.</p>
<?php
echo date("d-m-Y");
echo "<hr>";
?>

<p>4. Write a program to create a Chess board in PHP using for loop.</p>
<!DOCTYPE html>
<html>
<head>
    <title>Chess</title>
</head>
    <table bgcolor="grey">
        <?php
        for($r=1;$r<=8;$r++)
        {
            echo "<tr>";
            for ($c=1; $c<=8; $c++)
            {
                $total=$r+$c;
                if($total%2==0)
                {
                    echo"<td height='30px' width='30px' bgcolor='black'></td>";
                }
                else
                {
                    echo"<td height='30px' width='30px' bgcolor='white'></td>";
                }
            }
            echo "<tr>";

        }
        echo "</table>";
        echo "<hr>";
        ?>

<p>5. Create a script to construct the following pattern, using nested for loop. Go to the editor</p>
<?php

for ($i = 1; $i <= 5; $i++){
    for ($j = 1; $j <= $i; $j++){
    echo "*";
}
    echo "<br>";
}
    
 
echo "<hr>";
echo "*";
echo"<br>";
echo "**";
echo"<br>";
echo "***";
echo"<br>";
echo "****";
echo"<br>";
echo "*****";
echo"<hr>";
?>

<p>6. Explain the math function used in PHP.</p>
<?php
echo"Max";
echo"<br>";
echo"options: 2,4,6,8,10 ";
echo"<br>";
echo(max(2,4,6,8,10) . "<br>");
echo"options: 22,44,66,88,100 ";
echo"<br>";
echo(max(22,44,66,88,100) . "<br>");

echo"<br>";
echo"Min";
echo"<br>";
echo"options: 1,3,5,7,9 ";
echo"<br>";
echo(min(1,3,5,7,9). "<br>");
echo"options: 11,22,33,44,55 ";
echo"<br>";
echo(min(11,22,33,44,55));
echo"<hr>";
?>

<?php
echo"
    7. What is the difference between echo() and print() print_r. <br>
echo and print are more or less the same. They are both used to output data to the screen.
The differences are small: echo has no return value while print has a return value of 1 so it can be used in expressions. echo can take multiple parameters (although such usage is rare) while print can take one argument. echo is marginally faster than print.
";
echo "<hr>";
?>

<?php
echo"
8. How does PHP support looping? Explain with an example. <br>
looping is used to execute a block of code repeatedly as long as a specified condition is true. PHP supports several types of loops, just like in C or Java.
";

echo"<br>";
echo "For loop";
echo"<br>";
for ($i = 1; $i <= 5; $i++) {
    echo "$i <br>";
}

echo"<br>";
echo "While loop";
echo"<br>";
$i = 1;
while ($i <= 5) {
    echo "$i <br>";
    $i++;
}

echo"<br>";
echo "Do while loop";
echo"<br>";
$i = 1;
do {
    echo "$i <br>";
    $i++;
} while ($i <= 5);


echo"<br>";
echo "foreach loop";
echo"<br>";
$colors = array("Red", "Green", "Blue");
foreach ($colors as $color) {
    echo "$color <br>";
}

echo "<hr>";
?>

<p>9. Write an o/p for the following such that if you enter your name, it prints Hello Your
name.</p>
<?php
?>