<!DOCTYPE html>
<html>
<head>
    <title>Chess</title>
</head>
<body bgcolor="grey">
    <table>
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

//sum of natural numbers
        $num=0;
        for ($i=1; $i <=10; $i++){
            $num += $i;

        }
        echo "total sum = ".$num;

        echo "<hr>";

//no of digits
$number = 12345;
$count=0;
while($number!=0){
    $number = (int)($number/10);
    $count++;

}
echo "total digit = ".$count;
        ?>