<?php
	mb_internal_encoding('UTF-8');
	writeRegFile();
	$code1=$_POST['code1'];
	$code2=$_POST['code2'];
		if($_POST)
		{
			$email=validateData($_POST["email"]);
			
			if(mb_strlen($_POST["pass"])>8){
			$password=validateData($_POST["pass"]);
			$password=sha1($password.$username);
			}
			else{
			echo '<html><script>
			alert("Imate nekorektno vavedena parola!);
			window.location.href = "http://localhost:8080/log%20system/welcome.html";
			</script>
			</html>';
			}

		writeInDB($username,$password,$email);
		
		}
	
		else
		{
			echo "Nevalidni kodove za potvyrjenie";
		}
		
		
function get_client_ip() {
	error_reporting(0);
     $ipaddress = '';
     if ($_SERVER['HTTP_CLIENT_IP'])
         $ipaddress = $_SERVER['HTTP_CLIENT_IP'];
     else if($_SERVER['HTTP_X_FORWARDED_FOR'])
         $ipaddress = $_SERVER['HTTP_X_FORWARDED_FOR'];
     else if($_SERVER['HTTP_X_FORWARDED'])
         $ipaddress = $_SERVER['HTTP_X_FORWARDED'];
     else if($_SERVER['HTTP_FORWARDED_FOR'])
         $ipaddress = $_SERVER['HTTP_FORWARDED_FOR'];
     else if($_SERVER['HTTP_FORWARDED'])
         $ipaddress = $_SERVER['HTTP_FORWARDED'];
     else if($_SERVER['REMOTE_ADDR'])
         $ipaddress = $_SERVER['REMOTE_ADDR'];
     else
         $ipaddress = 'UNKNOWN';

     return $ipaddress; 
}

function validateData($value){
	if(!empty($value)) 
	{
	return $value=convertInputValue($value);
	}
	else
	{
	return $value="Nevalidna Stoinost!V momenta vasheto pole e prazno!";
	}
}
function convertInputValue($value)
{
	$value=htmlspecialchars($value);
	$value=stripcslashes($value);
	$value=trim($value);
	return $value;
}

function writeInDB($username,$pas,$email)
{
	$host="localhost" ;//by default;
	$user="root" ;// by default;
	$pass="" ;// emppty password field;
	$db="users1";
	$query="'$username', '$pas'";
	$con = mysqli_connect($host,$user);
	 
	 if(!$con)
	 {
		echo "GRYMNAH!";
	 }
	 else
	 {
		mysqli_select_db($con,"users1");
		$query=mysqli_query($con,'SELECT email,password FROM USERS WHERE email=''$username'' AND pas=''$pas''');
		if($query)
		{
			echo "aaaaaa";
		}
		else
		{
			echo '<html><script>
				if (confirm("Imate greshni parola ili email!Molq probvaite pak!"))
				{
				 window.location.href = "http://localhost:8080/log%20system/welcome.html";

				}
				else
				{
				alert("Cancel it !");
				window.open("", "_self", "");
                 window.close();
				}
			</script></html>';
		}
	 }
	 
	 mysqli_close($con);
}

function writeRegFile(){
$userip=get_client_ip();
$result='User with ip adress '.$userip.' was try login in the system at '.date(d-m-y).' !'."\n";
$file1=fopen("logLogfile.txt","a");
if(fwrite($file1,$result))
{
//-------
}
else
{
//-------
}
fclose($file1);
}
?>