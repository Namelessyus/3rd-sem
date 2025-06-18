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
Echo and print are more or less the same. They are both used to output data to the screen.
The differences are small: echo has no return value while print has a return value of 1 
so it can be used in expressions. echo can take multiple parameters (although such usage is rare) 
while print can take one argument. echo is marginally faster than print.
";
echo "<hr>";
?>


<?php
echo"
8. How does PHP support looping? Explain with an example. <br>
looping is used to execute a block of code repeatedly as long as a specified condition is true. 
PHP supports several types of loops, just like in C or Java.
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
<!DOCTYPE html>
<html>
<head>
    <title>Greet User</title>
</head>
<body>

<h2>Enter your name:</h2>
<form method="post">
    <input type="text" name="username">
    <input type="submit" value="Submit">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['username'];
    echo "Hello " . htmlspecialchars($name);
}
?>

</body>
</html>

11. Create simple 2-text fields which asks user for 2 different numbers if the user provides 2
numbers it will display sum, difference, multiplication, division, modulus and power X n
<!DOCTYPE html>
<html>
<head>
    <title>Math Operations</title>
</head>
<body>

<h2>Enter Two Numbers</h2>
<form method="post">
    Number 1: <input type="number" name="num1" required><br><br>
    Number 2: <input type="number" name="num2" required><br><br>
    <input type="submit" value="Calculate">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $a = $_POST['num1'];
    $b = $_POST['num2'];

    echo "<h3>Results:</h3>";
    echo "Sum: " . ($a + $b) . "<br>";
    echo "Difference: " . ($a - $b) . "<br>";
    echo "Multiplication: " . ($a * $b) . "<br>";

    if ($b != 0) {
        echo "Division: " . ($a / $b) . "<br>";
        echo "Modulus: " . ($a % $b) . "<br>";
    } else {
        echo "Division: Cannot divide by zero<br>";
        echo "Modulus: Cannot find modulus with zero<br>";
    }

    echo "Power (a<sup>b</sup>): " . pow($a, $b);
}
?>

</body>
</html>


12. Create a simple form that asks the user for their name when you enter your name it says
Welcome “Your name”;

<!DOCTYPE html>
<html>
<head>
    <title>Welcome User</title>
</head>
<body>

<h2>Enter Your Name</h2>
<form method="post">
    Name: <input type="text" name="username" required>
    <input type="submit" value="Submit">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = htmlspecialchars($_POST['username']);
    echo "Welcome \"$name\"";
}
?>

</body>
</html>


13. Create the following form and when you enter the form it will display your Personal
info, username, and faculty as below. write server-side scripting for that.
<!DOCTYPE html>
<html>
<head>
    <title>Personal Information Form</title>
</head>
<body>

<h2>Personal Information Form</h2>
<form method="post">
    Full Name: <input type="text" name="fullname" required><br><br>
    Username: <input type="text" name="username" required><br><br>
    Faculty:
    <select name="faculty" required>
        <option value="BCA">BCA</option>
        <option value="BBA">BBA</option>
        <option value="BIT">BIT</option>
        <option value="BBS">BBS</option>
    </select><br><br>
    <input type="submit" value="Submit">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $fullname = htmlspecialchars($_POST['fullname']);
    $username = htmlspecialchars($_POST['username']);
    $faculty = htmlspecialchars($_POST['faculty']);

    echo "<h3>Your Details:</h3>";
    echo "Personal Info: $fullname<br>";
    echo "Username: $username<br>";
    echo "Faculty: $faculty";
}
?>

</body>
</html>
