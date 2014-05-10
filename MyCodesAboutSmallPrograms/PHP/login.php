<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Вход за потребители в системата</title>
    <style>
        .hah {
            background: rgb(255,255,255); /* Old browsers */
            background: -moz-linear-gradient(top, rgb(255,255,255) 0%, rgb(246,246,246) 47%, rgb(237,237,237) 100%); /* FF3.6+ */
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgb(255,255,255)), color-stop(47%,rgb(246,246,246)), color-stop(100%,rgb(237,237,237))); /* Chrome,Safari4+ */
            background: -webkit-linear-gradient(top, rgb(255,255,255) 0%,rgb(246,246,246) 47%,rgb(237,237,237) 100%); /* Chrome10+,Safari5.1+ */
            background: -o-linear-gradient(top, rgb(255,255,255) 0%,rgb(246,246,246) 47%,rgb(237,237,237) 100%); /* Opera 11.10+ */
            background: -ms-linear-gradient(top, rgb(255,255,255) 0%,rgb(246,246,246) 47%,rgb(237,237,237) 100%); /* IE10+ */
            background: linear-gradient(to bottom, rgb(255,255,255) 0%,rgb(246,246,246) 47%,rgb(237,237,237) 100%); /* W3C */
            filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffffff', endColorstr='#ededed',GradientType=0 ); /* IE6-9 */
            color: black;
            height: 800px;
            font-family: "Comic Sans MS";
            font-size: 1.3em;
            text-shadow: 2px 2px 10px #000000;
        }

        #formForSubmit {
            width: 420px;
            height: 350px;
            border: 5px solid rgba(186, 239, 235, 0.67);
            border-radius: 800px;
            position: relative;
            top: 5%;
            left: 35%;
        }

            #formForSubmit:hover {
                width: 420px;
                height: 350px;
                border: 5px solid rgba(40, 94, 191, 0.96);
                border-radius: 800px;
                position: relative;
                top: 5%;
                left: 35%;
            }

        #userData {
            position: relative;
            top: 100px;
        }

        .activetextboxes:focus {
            background-color: #e8ebeb;
            color: black;
            font-family: Arial;
        }

        #btnLogin {
            background: rgb(242,246,248); /* Old browsers */
            background: -moz-linear-gradient(top, rgb(242,246,248) 0%, rgb(216,225,231) 50%, rgb(181,198,208) 51%, rgb(224,239,249) 100%); /* FF3.6+ */
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgb(242,246,248)), color-stop(50%,rgb(216,225,231)), color-stop(51%,rgb(181,198,208)), color-stop(100%,rgb(224,239,249))); /* Chrome,Safari4+ */
            background: -webkit-linear-gradient(top, rgb(242,246,248) 0%,rgb(216,225,231) 50%,rgb(181,198,208) 51%,rgb(224,239,249) 100%); /* Chrome10+,Safari5.1+ */
            background: -o-linear-gradient(top, rgb(242,246,248) 0%,rgb(216,225,231) 50%,rgb(181,198,208) 51%,rgb(224,239,249) 100%); /* Opera 11.10+ */
            background: -ms-linear-gradient(top, rgb(242,246,248) 0%,rgb(216,225,231) 50%,rgb(181,198,208) 51%,rgb(224,239,249) 100%); /* IE10+ */
            background: linear-gradient(to bottom, rgb(242,246,248) 0%,rgb(216,225,231) 50%,rgb(181,198,208) 51%,rgb(224,239,249) 100%); /* W3C */
            filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f2f6f8', endColorstr='#e0eff9',GradientType=0 ); /* IE6-9 */
            width: 220px;
            height: 60px;
            font-family: "Comic Sans MS";
            position:relative;
            top:18px;
            border-radius:50px;
        }

            #btnLogin:hover{
                background: rgb(203,96,179); /* Old browsers */
                background: -moz-linear-gradient(top, rgb(203,96,179) 0%, rgb(193,70,161) 50%, rgb(168,0,119) 51%, rgb(219,54,164) 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgb(203,96,179)), color-stop(50%,rgb(193,70,161)), color-stop(51%,rgb(168,0,119)), color-stop(100%,rgb(219,54,164))); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top, rgb(203,96,179) 0%,rgb(193,70,161) 50%,rgb(168,0,119) 51%,rgb(219,54,164) 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top, rgb(203,96,179) 0%,rgb(193,70,161) 50%,rgb(168,0,119) 51%,rgb(219,54,164) 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top, rgb(203,96,179) 0%,rgb(193,70,161) 50%,rgb(168,0,119) 51%,rgb(219,54,164) 100%); /* IE10+ */
                background: linear-gradient(to bottom, rgb(203,96,179) 0%,rgb(193,70,161) 50%,rgb(168,0,119) 51%,rgb(219,54,164) 100%); /* W3C */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#cb60b3', endColorstr='#db36a4',GradientType=0 ); /* IE6-9 */
                width: 220px;
                height: 60px;
                font-family: "Comic Sans MS";
                position: relative;
                top: 18px;
                border-radius:50px;
            }
    </style>
    <script src="jquery-1.10.2.min.js"></script>
    <script>
        function validateData() {
            var userName = document.getElementById("inputName");
            var passUser = document.getElementById("inputPass");
            var myform = document.getElementsByName("formForSubmit");

            if (userName.value == "" || passUser.value == "") {
                userName.style.backgroundColor = "red";
                passUser.style.backgroundColor = "red";
                alert("Въведете потрибителско име и парола!!!");
            }
            else {
                $('form').submit();
            }
        }
    </script>
</head>
<body>
    <div class="hah">
        <h3 align="center">Моля въведете потребителско име и парола:</h3>
        <form action="login.php" id="formForSubmit" method="post">
            <div align="center" id="userData">
                <div>Потребиелско име:</div>
                <input type="text" value="" id="inputName" name="user" class="activetextboxes" />
                <div>Парола:</div>
                <input type="text" value="" id="inputPass" class="activetextboxes" />
                <br />
                <input type="submit" value="Вход" id="btnLogin" onclick="validateData()"/>
                </div>
        </form>
    </div>
	<?php 
	session_name('login');
	session_start();
	if(!isset($_SESSION('user']))
	{
		if(!isset($_POST('user']))
		{
		echo "
		  <script src="jquery-1.10.2.min.js"></script>
		<script>
			function validateData() {
				var userName = document.getElementById("inputName");
				var passUser = document.getElementById("inputPass");
				var myform = document.getElementsByName("formForSubmit");

				if (userName.value == "" || passUser.value == "") {
					userName.style.backgroundColor = "red";
					passUser.style.backgroundColor = "red";
					alert("Въведете потрибителско име и парола!!!");
				}
				else {
					$('form').submit();
				}
			}
			</script>
			";
		}
		else
		{
		if($_POST['user']==="user") && ($_POST['pass']==="123")
			{
				
			}
		}
	}
	
	?>
</body>
</html>
