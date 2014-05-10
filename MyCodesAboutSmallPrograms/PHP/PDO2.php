<?php
 try{
            $host="localhost";
            $dbname="mailUsers";
            $user="root";

            $connection=new PDO("mysql:host=$host;dbname=$dbname",$user);
            $connection->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION); 
                $query1=$connection->prepare("insert into mailusers (name,town,tel,message) values(?,?,?,?)");
                                            $name="alex";
                $city="varna";
                $tel="0889654";
                $message="message";
                
                //quate is function eququalent of mysqli_escape_string;
                $connection->quote($name);
                $connection->quote($city);
                $connection->quote($tel);
                $connection->quote($message);
                
                $query1->bindParam(1,$name);
                $query1->bindParam(2,$city);
                $query1->bindParam(3,$tel); 
                $query1->bindParam(4,$message); 

                             $query1->execute();
                 $affectetrows=$query1->rowCount();
                 $result="";
                if($affectetrows>0)
                {
                    $result="zapisyt e uspeshen!";
                }
                
                echo $result;
                
    }
    catch(PDOException $e) {
            echo $e->getMessage();
        }
        ?>