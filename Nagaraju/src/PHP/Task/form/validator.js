// Defining a function to display error message
function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}

// Defining a function to validate form 
function validateForm() {
    // Retrieving the values of form elements 
    var name = document.contactForm.name.value;
    var email = document.contactForm.email.value;
    var phone = document.contactForm.phone.value;
    var designation = document.contactForm.designation.value;
    var gender = document.contactForm.gender.value;
    var areaofinterest = document.contactForm.areaofinterest.value;
    var str ="";

   var skills = [];
    var checkboxes = document.getElementsByName("skills[]");
    for(var i=0; i < checkboxes.length; i++) {
        if(checkboxes[i].checked) {
            // Populate Skills array with selected values
            skills.push(checkboxes[i].value);
        }
    }
    
	// Defining error variables with a default value
    var nameErr = emailErr = phoneErr = designationErr = genderErr = skillErr = areaofinterest = true;
    
    // Validate name
    if(name == "") {
        printError("nameErr", "Please enter your name");
    } else {
        var regex = /^[a-zA-Z\s]+$/;                
        if(regex.test(name) === false) {
            printError("nameErr", "Please enter a valid name");
        } else {
            printError("nameErr", str);
            nameErr = false;
        }
    }
    
    // Validate email address
    if(email == "") {
        printError("emailErr", "Please enter your email address");
    } else {
        // Regular expression for basic email validation
        var regex = /^\S+@\S+\.\S+$/;
        if(regex.test(email) === false) {
            printError("emailErr", "Please enter a valid email address");
        } else{
            printError("emailErr", "");
            emailErr = false;
        }
    }
    
    // Validate mobile number
    if(phone == "") {
        printError("phoneErr", "Please enter your mobile number");
    } else {
        var regex = /^[1-9]\d{9}$/;
        if(regex.test(phone) === false) {
            printError("phoneErr", "Please enter a valid 10 digit mobile number");
        } else{
            printError("phoneErr", "");
            phoneErr = false;
        }
    }
    
    // Validate Designation
    if(designation == "Select") {
        printError("designationErr", "Please select your Designation");
    } else {
        printError("designationErr", "");
        designationErr = false;
    }
    
    // Validate gender
    if(gender == "") {
        printError("genderErr", "Please select your gender");
    } else {
        printError("genderErr", "");
        genderErr = false;
    }

    if(skills.length == "") {
        printError("skillErr", "Please select atleast one skill");
    } else{
        printError("skillErr","");
        skillErr = false;
    }

    
    // Prevent the form from being submitted if there are any errors
    if((nameErr || emailErr || phoneErr || designationErr || genderErr || skillErr || areaofinterestErr) == true) {
       return false;
    } else {
        // Creating a string from input data for preview
        var dataPreview = "You've entered the following details: \n" +
                          "Full Name: " + name + "\n" +
                          "Gender: " + gender + "\n";+
                          "Email Address: " + email + "\n" +
                          "Mobile Number: " + phone + "\n" +
                          "Designation: " + designation + "\n" +
                          "Area Of Interest: " + areaofinterest + "\n";
        if(skills.length) {
            dataPreview += "Skills: " + skills.join(", ");
        }
        // Display input data in a dialog box before submitting the form
        alert(dataPreview); 
    } 
}