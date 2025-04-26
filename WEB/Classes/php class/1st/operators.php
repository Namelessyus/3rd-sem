<?php
//artiemetic operators
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
echo"<hr>";

//
$c=5;
$d=6;
echo "<br>";

$c+=$d;
echo "<br>";
echo $c;

$c**=$d;
echo "<br>";
echo $c;

echo"<hr>";

//comparison operator
$e=30;
$f='30';
if($e==$f)
{
    echo "hye";
}
else{
    echo "bye";
}

echo "<br>";

$g=1;
$h='true';
if($g==$h)
{
    echo "hye";
}
else{
    echo "bye";
}

echo "<br>";

$i=1;
$j='true';
if($i!==$j)
{
    echo "hye";
}
else{
    echo "bye";
}

echo "<br>";

$k=10;
$l=20;
if($k==$l)
{
    echo "hye";
}
else{
    echo "bye";
}

echo "<br>";

$m=20;
$n=10;
if($m==$n)
{
    echo "hye";
}
else{
    echo "bye";
}


echo "<br>";

$o=10;
$p=20;
if($o<=>$p)
{
    echo "hye";
}
else{
    echo "bye";
}

echo "<hr>";


//logical operator
$marks=50;
if($marks>=90 && $marks<100)
{
    echo "A+";
}
else if($marks>=80 && $marks<90)
{
    echo "B+";
}
else if($marks>=70 && $marks<80)
{
    echo "C+";
}

echo "<hr>";

if($a==50 || $a>60)
{
    echo "hi";
}else
{
    echo "bye";
}




?>