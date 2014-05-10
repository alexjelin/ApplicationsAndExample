<?php
$name="Alexandar";
echo $name;

$lenght1=strlen($name);
echo "<br/>The lenght of $name is $lenght1 !";
$positionOfSomeString=strpos($name,"xan");
echo "<br/>".$positionOfSomeString."<br/>";

if(strcmp($name,"u")==-1)
{
    echo "example4<br/>";
}
else{
    print "example3<br/>";
}

echo strtoupper($name);

$exampeOfExpode="example1";

$array=explode(" ",$exampeOfExpode);
reset($array);

while(list($key,$value)=each($array))
{
    echo $key."-".$value;
}

$string1=implode(" ",$array);
echo "<br/>".$string1;

$array1=array(1,2,3,4,5,6);

var_dump($array1);
asort($array1);
arsort($array1);
var_dump($array1);
ksort($array1);
var_dump($array1)


?>