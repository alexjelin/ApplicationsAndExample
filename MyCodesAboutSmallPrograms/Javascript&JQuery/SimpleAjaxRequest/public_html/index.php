<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        $arrayWithCars = array("Marka" => $_POST["markaKola"],
            "Model" => $_POST["markaKola"],
            "Godina" => $_POST["godina"],
            "Obem" => $_POST["obemKola"],
            "MaksSkorost" => $_POST["maxSpeed"],
            "MaksSkorost" => $_POST["broiVratiKola"]);
         echo $arrayWithCars;
        ?>
       

    </body>
</html>
