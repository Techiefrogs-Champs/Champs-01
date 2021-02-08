<?php
// define variables and set to empty values
$name = $email = $gender = $phone = $designation = $areaofinterest = "";
$skills = array("value");
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (empty($_POST["name"])) {
        $nameErr = "Name is required";
    } else {
        $name = test_input($_POST["name"]);
        // check if name only contains letters and whitespace
        if (!preg_match("/^[a-zA-Z-' ]*$/",$name)) {
            $nameErr = "Only letters and white space allowed";
        }
    }

    if (empty($_POST["gender"])) {
        $genderErr = "Gender is required";
    } else {
        $gender = test_input($_POST["gender"]);
      }
      
    if (empty($_POST["email"])) {
        $emailErr = "Email is required";
    } else {
        $email = test_input($_POST["email"]);
        // check if e-mail address is well-formed
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "Invalid email format";
        }
      }
        
    if (empty($_POST["phone"])) {
        $phoneErr = "Mobile Number is required";
    } 
    else {
        $phone = test_input($_POST["phone"]);
        if (!preg_match("/^[0-9]*$/", $phone,)) {
            $phoneErr = "Invalid Number";
        }
    }

    if (empty($_POST["designation"])) {
        $designationErr = "Designation is required";
    } else {
        $designation = test_input($_POST["designation"]);
        }

    
    foreach($_POST['skills'] as $key => $value) {
    if(empty($value))
    echo "empty"; 
    else {
    $skills = test_input($_POST["skills"]);
    } }

    if (empty($_POST["areaofinterest"])) {
        $areaofinterest = "";
    } else {
        $areaofinterest = test_input($_POST["areaofinterest"]);
        }  
}

function test_input($data) {
  if(is_array($data)){
    return array_map('test_input',$data);
  }
    
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>

<?php
if (!empty($name) || !empty($gender) || !empty($email) || !empty($phone) || !empty($designation) 
|| !empty($skills) || !empty($areaofinterest)) {
    echo "<h2>Your Input:</h2>";
    echo "Employee Name:" .$name; 
    echo "<br>";
    echo "Employee Gender:" .$gender; 
    echo "<br>";
    echo "Employee E-mail:" .$email; 
    echo "<br>";
    echo "Employee Phone:" .$phone; 
    echo "<br>";
    echo "Employee Designation:" .$designation;
    echo "<br>";
    echo "Employee Skills:";
    foreach($skills as $value) {
        echo $value.","; 
    }
    echo "<br>";
    echo "Area of Interests:" .$areaofinterest;
}
else {
    echo "All field are required";
    die();
   }
?>
