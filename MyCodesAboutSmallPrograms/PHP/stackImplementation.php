<?php

class Stack
{
    private $array=null;
    
    public function __construct()
    {
        $this->array=array();
    }
    
    function addElement($element)
    {
        array_unshift($this->array,$element);
    }
    
    function removeElement()
    {
        array_shift($this->array);
    }
    
    function getElement()
    {
        return $this->array[0];
    }
    
    function getLastElement()
    {
        return $this->array[count($this->array)-1];
    }
    
    function __toString(){
        reset($this->array);
        while(list($key,$value)=each($this->array))
        {
            echo "->".$value."<br/>";
        }
    }
          
}

$stack=new Stack();
$stack->addElement(1);
$stack->addElement(2);
$stack->addElement(3);
$stack->addElement(4);
$stack->removeElement();
$stack->__toString();

?>