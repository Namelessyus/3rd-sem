<?php
//even no
$a=3;
if($a%2==0)
{
    echo("$a is even");
}
else{
    echo("$a is odd");
}

echo "<br>";

//voter
$age=12;
if($age>=10)
{
    echo("you are eligible for voting");
}
else{
    echo("you are not eligible for voting");
}

echo "<br>";

//switch
$color ="red";
switch ($color){
    case "red":
    echo("color is red");
    break;
    case "blue":
        echo("color is red");  
    break;
    case "green":
        echo("color is green");
        default;
        echo("your color is sth else");


}
    ?>