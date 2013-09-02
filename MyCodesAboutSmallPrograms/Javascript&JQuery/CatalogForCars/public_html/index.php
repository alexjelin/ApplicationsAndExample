<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>

        <?php
        $arrayWithCars = array("Marka" => $_POST["markaKola"],
            "Model" => $_POST["model"],
            "Godina" => $_POST["godina"],
            "Obem" => $_POST["obemKola"],
            "MaksSkorost" => $_POST["maxSpeed"],
            "BroiVrati" => $_POST["broiVratiKola"]);
        echo print_r($arrayWithCars);

        $con = mysqli_connect("localhost,"root","","tablicaskoli");
            
if (mysqli_connect_errno($con))
  {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  }
  $sql="INSERT INTO Koli (marka, model, godina, obemNaDvigatel, maxSpeed)
        VALUES
        ('$_POST[markaKola]', '$_POST[model]', '$_POST[godina]', '$_POST[obemKola],', '$_POST[maxSpeed]')";

if (!mysqli_query($con,$sql))
  {
  die('Error: ' . mysqli_error($con));
  }
echo "1 record added";
        ?>

    </body>
</html>
