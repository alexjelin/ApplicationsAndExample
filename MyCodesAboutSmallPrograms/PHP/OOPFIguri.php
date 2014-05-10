<?php
class Figura{
    private $width;
    private $height;
    private $color;
    private $text;
    
    public function __construct($width,$height,$color,$textDescription)
    {
        $this->setWidth($width);
        $this->setHeight($height);
        $this->setColor($color);
        $this->setText1($textDescription);
        
    }
    #getterari i settari...   
     public function setText1($textOfFigure)
    {
        if($textOfFigure!=="")
        {
            $this->text=$textOfFigure;
        }
        else
        {
            echo "Nevalidno vaveden text na figurata!";
        }
    }
    
    function getText()
    {
        return $this->text;
    }
    
    
    function setColor($color)
    {
        if($color!=="")
        {
            $this->color=$color;
        }
        else
        {
            echo "Nevalidno vaveden cvqt!!";
        }
    }
    
    function getColor()
    {
        return $this->color;
    }
    
    function setWidth($widthOfUser)
    {
        if($widthOfUser>=0)
        {
            $this->width=$widthOfUser;
        }
        else
        {
            echo "Nevalidna shirina";
        }
    }
    
    function getWidth()
    {
        return $this->width;
    }
    
    function setHeight($HeightOfUser)
    {
        if($HeightOfUser>=0)
        {
            $this->height=$HeightOfUser;
        }
        else
        {
            echo "Nevalidna visochina!";
        }
    }
    
    function getHeight()
    {
        return $this->height;
    }
    
    function __toString()
    {
        $stringOfObject="Shirina:".$this->width."Visochina:".$this->height."Cvqt :".$this->color."Opisanie".$this->text."<br/>";
        return $stringOfObject;
    }
}
$figura=new Figura(222,356,"blue","Az sym sinq figura");
echo $figura->__toString();

class Rectangle extends Figura implements fig
{
    private $size;
    
    function printAnything()
    {
        echo "pravoaganik";
    }
    
     function setSize($size)
    {
        if($size>0)
        {
            $this->size=$size;
        }
        else
        {
            echo "nevalidna shirina!";
        }
    }
    
     function getSize()
    {
        return $this->size;
    }
    
    public  function __construct($width,$height,$color,$textDescription,$size)
    {
    Figura::__construct($width,$height,$color,$textDescription);
        $this->setSize($size);
    }
    
    function __toString()
    {
        $str=parent::__toString().$this->getSize()."<< pravoagalnik!";
        return $str;
    }
    
    function calcuateArea()
    {
        $area=$this->getHeight()*$this->getWidth();
        return $area;
    }
    
    function calculatePerimetyr()
   {
        return $this->getHeight()*2+$this->getWidth()*2;
   }
   
   function printAreaAndPer()
   {
    echo "<br/>Liceto na pravoagalnika e:".$this->calcuateArea()." sm a obikolkata e:".$this->calculatePerimetyr()." sm!";
   }
    
}

$rect=new Rectangle(123,222,"red","az sum pravoagalnik i to cherven",5);
echo $rect->__toString();
$rect->printAreaAndPer();
$rect->printAnything();

interface fig
{
    function printAnything();
}
?>