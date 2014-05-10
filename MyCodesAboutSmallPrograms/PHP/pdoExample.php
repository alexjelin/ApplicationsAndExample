<?php
$name='';
$surname='';
$year='';

if(!(empty($_POST['vendor']))
)
{
    if(!(empty($_POST['nameOfUser'])))
    {
        $name=$_POST['nameOfUser'];
        $name=validateInputData($name);
        echo "<br/> $name";
    }
    
    if(!(empty($_POST['surnameOfUser'])))
    {
        $surname=$_POST['surnameOfUser'];
        $surname=validateInputData($surname);
        echo "<br/> $surname";
    }
    
    if(!(empty($_POST['yearOfUser'])))
    {
        $year=$_POST['yearOfUser'];
        $year=validateInputData($year);
        echo "<br/> $year";        
    }
    
    writerInMySql($name,$surname,$year);

    
}
else
{
echo "nqma prateni danni!";
}

function validateInputData($data)
{
    htmlspecialchars($data);
    stripcslashes($data);
    trim($data);
    return $data;
}

function writerInMySql($data1,$data2,$data3)
{
    try{
    $host="localhost";
    $dbname="vendors";
    $user="root";
    $connection=new PDO("mysql:host=$host;dbname=$dbname",$user);
    $query1=$connection->prepare("insert into vendors (name,surname,year) values(?,?,?)");
    $query1->bindParam(1,$data1);
    $query1->bindParam(2,$data2);
    $query1->bindParam(3,$data3);
    $data1=$data1;
    $data2=$data2;
    $data3=$data3;
    $query1->execute();
    $affectetrows=$query1->rowCount();
    
        if($affectetrows>0)
        {
            echo "zapisyt e uspeshen!";
        }
        
            $query2=$connection->prepare("SELECT * FROM vendors");
            $query2->setFetchMode(PDO::FETCH_ASSOC);
            
            while($row=$query2->fetch())
            {
                echo $row['name'];
            }
    }
    
    catch(PDOException $e) {
        echo $e->getMessage();
    }
    
}
?>