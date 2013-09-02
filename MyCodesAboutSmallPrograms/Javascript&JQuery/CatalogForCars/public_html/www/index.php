<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Page</title>
        <style>
            #backButton
            {
                position: absolute;
                top:9px;
                right:502px;    
                height: 80px;
                width: 200px;

            }
            #backButton:hover
            {
                background: rgb(254,252,234); /* Old browsers */
                background: -moz-linear-gradient(top,  rgba(254,252,234,1) 0%, rgba(241,218,54,1) 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(254,252,234,1)), color-stop(100%,rgba(241,218,54,1))); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top,  rgba(254,252,234,1) 0%,rgba(241,218,54,1) 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top,  rgba(254,252,234,1) 0%,rgba(241,218,54,1) 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top,  rgba(254,252,234,1) 0%,rgba(241,218,54,1) 100%); /* IE10+ */
                background: linear-gradient(to bottom,  rgba(254,252,234,1) 0%,rgba(241,218,54,1) 100%); /* W3C */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fefcea', endColorstr='#f1da36',GradientType=0 ); /* IE6-9 */
                border:3px solid  skyblue;
            }
            #backButton:active
            {
                background: rgb(252,234,187); /* Old browsers */
                background: -moz-linear-gradient(top,  rgba(252,234,187,1) 0%, rgba(252,205,77,1) 50%, rgba(248,181,0,1) 51%, rgba(251,223,147,1) 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(252,234,187,1)), color-stop(50%,rgba(252,205,77,1)), color-stop(51%,rgba(248,181,0,1)), color-stop(100%,rgba(251,223,147,1))); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top,  rgba(252,234,187,1) 0%,rgba(252,205,77,1) 50%,rgba(248,181,0,1) 51%,rgba(251,223,147,1) 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top,  rgba(252,234,187,1) 0%,rgba(252,205,77,1) 50%,rgba(248,181,0,1) 51%,rgba(251,223,147,1) 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top,  rgba(252,234,187,1) 0%,rgba(252,205,77,1) 50%,rgba(248,181,0,1) 51%,rgba(251,223,147,1) 100%); /* IE10+ */
                background: linear-gradient(to bottom,  rgba(252,234,187,1) 0%,rgba(252,205,77,1) 50%,rgba(248,181,0,1) 51%,rgba(251,223,147,1) 100%); /* W3C */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fceabb', endColorstr='#fbdf93',GradientType=0 ); /* IE6-9 */
                border:3px solid skyblue;
            }
        </style>
    </head>
    <body>
        <?php
        /*  $arrayWithCars = array("Marka" => $_POST["markaKola"],
          "Model" => $_POST["model"],
          "Godina" => $_POST["godina"],
          "Obem" => $_POST["obemKola"],
          "MaksSkorost" => $_POST["maxSpeed"],
          "BroiVrati" => $_POST["broiVratiKola"]);
          echo print_r($arrayWithCars);
         */

        /* Create connection-tyk moje trqbva da se popalnqt danni za servara na MySqL,potribitelsko ime,parola i imeto na syzdadenata baza danni na tozi server;
          v momenta vryzkata kym baza danni e zadadena kym lokalen host s potribitel root bez parola!
         * Vrazkata se pravi kym syzdadena baza danni s ime "tablicaskoli"i pri neinoto nenalichie
         * nqma da moje da bydat syzdadeni nikakvi zapisi!
         * */
        $con = mysqli_connect("localhost", "root", "", "tablicaskoli");
        if (mysqli_connect_errno($con)) {
            echo "Failed to connect to MySQL: " . mysqli_connect_error();
        }
        // syzdavame tablica s 5 poleta sprqmo nashe nujdi
        $sql = "CREATE TABLE CarList2
  (
  MARKA VARCHAR(128),
  MODEL varchar(255),
  GODINA INT,
  OBEMNAdVIGATEL INT,
  MAXSPEED INT,
  BROIVRATI varchar(128)
  );";
        /* Pri premahvane na komentarite moje da proverite dali tablicata e sazdadena uspeshno ili ne;
         *  if (mysqli_query($con,$sql))
          {
          echo "Table  created successfully";
          }
          else
          {
          echo "Error creating database: " . mysqli_error($con);
          }
         */

        $sql = "INSERT INTO CarList2 (marka,model,godina,obemNaDvigatel,maxSpeed,broivrati)
        VALUES
        ('$_POST[markaKola]', '$_POST[model]', '$_POST[godina]', '$_POST[obemKola],', '$_POST[maxSpeed]','$_POST[broiVratiKola]')";

        if (!mysqli_query($con, $sql)) {
            die('Error: ' . mysqli_error($con));
        } else {
            echo "<h2>The record is add in the table now!Thank you!</h2>";
        }
        ?>
        <input type="button" value="Back to application" id="backButton" onclick="backToApp()"/>
        <script>
            function backToApp()
            {
                window.open("index1.html");
            }
        </script>
    </body>
</html>
