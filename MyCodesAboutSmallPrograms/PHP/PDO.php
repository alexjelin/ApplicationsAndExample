<?php
try{
$host="localhost";
$dbname="vendors";
$user="root";

$connection=new PDO("mysql:host=$host;dbname=$dbname",$user);
$connection->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
$st=$connection->prepare("SELECT * FROM vendors");
$st->setFetchMode(PDO::FETCH_ASSOC);
$st->execute();
while($row=$st->fetch())
    {
        echo $row['name']." : ".$row['surname']." : ".$row['year']." : "."<br/>";
    }
    
$st2=$connection->query("INSERT INTO vendors (name,surname,year) values('Ivan','Seergeevich',188)");
$st2->execute();
$affect_rows=$st2->rowCount();
if($affect_rows>0){
    {
        echo "zapisyt  e uspeshen";
    }
}

$statment=$connection->prepare("INSERT INTO vendors (name,surname,year) VALUES(?,?,?)");
$statment->bindParam(1,$name2);
$statment->bindParam(2,$surname);
$statment->bindParam(3,$year);

$name2="molqq";
$surname="Ivanov";
$year="1985";

$statment->execute();

$con=$connection->query("insert into vendors(name,surname,year) values(:name2,:surname,:year)");
$con->bindParam(":name2",$name2);
$con->bindParam(":surname",$surname);
$con->bindParam(":year",$year);

$name2="alex";
$surname="Ivanov";
$year="1993";

$con->exec();


}
catch(PDOException $e) {
    echo $e->getMessage();
}
?>