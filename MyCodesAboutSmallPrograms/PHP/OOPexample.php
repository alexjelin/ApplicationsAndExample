<?php
abstract class mammal
{
    private $rast;
    function walk($speed)
    {
        print "I walk with 50 km at hour!";
    }
    
    function __construct($rast1)
    {
        $this->rast=$rast1;
    }
    
    public function getRast()
    {
        return $this->rast;
    }
}

interface voices
{
    function talking();
}

class dog extends mammal implements voices
{
    private $pol;
    private $age;
    
    
    public function talking()
    {
        print "bau";
    }
    
     public function setpoL($newPol)
    {
        if(!($newPol==null || $newPol==''))
        {
        $this->pol=$newPol;
        }
        else
        {
            print "nemoje da se postavi pol";
        }
    }
    
    public function setAge($age1)
    {
        if(!($age1<0))
        {
        $this->age=$age1;
        }
        else
        {
            print "nemoje da se postavqt godini";
        }
    }
    
    
    function __construct($age,$pol)
    {
        $this->setAge($age);
        $this->setpoL($pol);
    }
    
    public function printParam()
    {
        print $this->age."        ";
        print $this->pol;
    }
    
}

class cat extends mammal implements voices
{
    private $kraka;
    
    public function setKraka($newKraka){
        if(!($newKraka<0))
        {
            $this->kraka=$newKraka;
        }
        else
        {
            print "<div>nemoje da sloja kraka!</div>";
        }
    }
    
    function __construct($rast1,$broikraka)
    {
        parent::__construct($rast1);
        $this->setKraka($broikraka);
    }
    
    public function printPar()
    {
        echo $this->__toString();
    }
    
       public function talking()
    {
        print "mqu";
    }
    
    public function __toString()
    {
        return $this->kraka.$this->getRast();
    }
}

$chochi=new dog(55,"majko");
$chochi->printParam();

$chochi22=new cat(168,4);
$chochi22->printPar()
?>