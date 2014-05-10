<?php
$fname;
$lname;
$telefon;
$email;

if(isset($_GET["reg"]))
{
    echo "dannite sa polucheni uspeshno!";
   $fname=test_input($_GET["fname"]);
   $lname=test_input($_GET["lname"]);
   $telefon=test_input($_GET["telefon"]);
   $email=test_input($_GET["email"]);
}
else
{
    echo "nevalna tranzakciq";
}


function test_input($data)
{
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>
<html>
    <body>
        <div>Pyrvoto vi ime e: <?php echo $fname?></div>
        <div>Vtroto vi ime e: <?php echo $lname?></div>
        <div>Telefonat vi ime e: <?php echo $telefon?></div>
        <div>Emailat vi ime e: <?php echo $email?></div>
    </body>
</html>