<?php

class NullHandleException extends Exception {
    function __construct($message)
    {
        parent::__construct($message);
    }
}

class ArrayOfBoundEx extends Exception {
    function __construct($messageer)
    {
        parent::__construct($messageer);
    }
}

class ageException extends Exception{
    function __construct($messageError)
    {
        parent::__construct($messageError);
    }
}

class cat{
    private $ageOfCat;
    
    public function setAge($age)
    {
        if(!($age<0))
        {
            $this->ageOfCat=$age;
        }
        else
        {
            throw  new ageException("vazrasta ne e nared pich!");
        }
    }
    
    public function getAge()
    {
        return $this->ageOfCat;
    }
    
    public function __construct($age)
    {
        $this->setAge($age);
    }
    
    public function __toString()
    {
        return "Godinite na koteto vi e : ".$this->getAge()." !"; 
    }
}

$merryCat=new cat(55);
echo $merryCat->__toString();
if(($merryCat instanceof cat))
{
  echo "tova e kotka!";
}
else
{
    echo "ne e kotka!";
}


class car
{
    private $model;
    private $year;
    private $country;
    
    public function __set($name,$property)
    {
        
    }
    
    public function setModel($newModel)
    {
        if(!($newModel==''))
        {
            $this->model=$newModel;
        }
        else
        {
            echo "<div>nemoje da se sloji model!</div>";
        }
    }
    
    public function setYear($newYear)
    {
        if(!($newYear<0))
        {
            $this->year=$newYear;
        }
        else
        {
            echo "<div>nemoje da se sloji godina  na brichkata!</div>";
        }
    }
    
    public function setCounrty($newContry)
    {
        if(!($newContry==''))
        {
            $this->country=$newContry;
        }
        else
        {
            echo "<div>nemoje da se sloji DARJAVA!</div>";
        }
    }
    
    public function __get($name)
    {
        return $this->name;
    }
    
    public function __construct($model,$year,$contry)
    {
        $this->setModel($model);
        $this->setYear($year);
        $this->setCounrty($contry);
    }
    
    public function __toString()
    {
        return "String: ".$this->model." ".$this->year." ".$this->country."  !";
    }
}

$newCar=new car("BMV",1999,"Germany");
echo $newCar->__toString();
?>