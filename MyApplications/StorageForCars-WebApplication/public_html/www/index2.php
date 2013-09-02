
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
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
        $markaSearch = $_POST["markaKolaSearchPanel"];
        $modelSearch = $_POST["modelSeatchPanel"];
        $otGodinaNaProizvodstvo = $_POST["otGodinaNaProizvodstvo"];
        $doGodinaSearch = $_POST["doGodinaNaProizvodstvo"];
        $otMaxObemSearch = $_POST["oTObemDvigatel"];
        $doMaxObemSearch = $_POST["dOObemDvigatel"];
        $otmaxSpeedSearch = $_POST["oTmaxSpeed"];
        $domaxSpeedSearch = $_POST["dOmaxSpeed"];
        $broivratiSearch = $_POST["broiVratiSearchPanel"];

        $con = mysqli_connect("localhost", "root", "", "tablicaskoli");
        if (mysqli_connect_errno($con)) {
            echo "Failed to connect to MySQL: " . mysqli_connect_error();
        }

        $result = mysql_real_escape_string($markaSearch);
        $result1 = mysql_real_escape_string($modelSearch);
        $result2 = mysql_real_escape_string($otGodinaNaProizvodstvo);
        $result3 = mysql_real_escape_string($doGodinaSearch);
        $result4 = mysql_real_escape_string($otMaxObemSearch);
        $result5 = mysql_real_escape_string($doMaxObemSearch);
        $result7 = mysql_real_escape_string($otmaxSpeedSearch);
        $result8 = mysql_real_escape_string($domaxSpeedSearch);
        $result9 = mysql_real_escape_string($broivratiSearch);
        // syzdavane na masiv,chiito danni shte se vyrnat ot baza danni sortirani chrez opredeleni kriterii
        $result_set = mysqli_query($con, "SELECT * FROM CarList2 WHERE MARKA LIKE '$result%' AND MODEL LIKE '$result1%' AND (GODINA BETWEEN '$result2' AND '$result3')
AND (OBEMNAdVIGATEL BETWEEN '$result4' AND '$result5')
AND (MAXSPEED BETWEEN '$result7' AND '$result8')
AND BROIVRATI LIKE '$result9%'
");
// ot tyk moje da vidite kolko sa namerinite rezultati v masiva "$result_set" po zadadenite kriterii;
        //printf("Select returned %d rows.\n", mysqli_num_rows($result_set));
        echo "<br>";
        echo "<h2>Results:</h2>";
        while ($row = mysqli_fetch_array($result_set)) {
            echo "Brand :" . $row['MARKA'];
            echo "<br>";
            echo "MODEL:" . $row['MODEL'];
            echo "<br>";
            echo "Year : " . $row['GODINA'];
            echo "<br>";
            echo "Volume:" . $row['OBEMNAdVIGATEL'];
            echo "<br>";
            echo "Max speed " . $row['MAXSPEED'];
            echo "<br>";
            echo "Count of doors " . $row['BROIVRATI'];
            echo "<br>";
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