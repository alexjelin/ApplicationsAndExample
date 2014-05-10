<?php
$someVar1="Ko?Ne";
if(isset($someVar))
{
    echo "$someVar";
}
else
{
    echo "i dont know for these variable!!";
    echo "<br/>";
}

class Car
{
    private $year;
    
    public function __construct($year)
    {
        $this->year=$year;
    }
    
    public function __toString()
    {
        echo "godinata na proizvodstvo e : ".$this->year;
    }
}

$someCar=new Car(1555);
$someCar->__toString();

class Mercedes extends Car
{
    private $model;
    
    function __construct($model,$year1)
    {
        parent::__construct($year1);
        $this->model=$model;
    }
}

unset($someVar1);
if(isset($someVar1))
{
    echo "shett!";
}
else
{
    echo "<br/>destroied!";
}

$cars1=array(1,2,3,4);

while(list($key,$value)=each($cars1))
{
    echo $key.$value;
}

define("CONSTT",555);
echo CONSTT;
?>
