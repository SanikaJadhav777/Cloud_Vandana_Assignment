function resetForm()
{
    document.getElementById('name').value="";
    document.getElementById('email').value="";
    document.getElementById('use1').checked=false;
    document.getElementById('use2').checked=false;
    document.getElementById('suggest1').checked=false;
    document.getElementById('suggest2').checked=false;
    document.getElementById('satisfied').checked=false;
    document.getElementById('undecided').checked=false;
    document.getElementById('unsatisfied').checked=false;
    document.getElementById('comment').value="";
}

function submitForm()
{
    let name= document.getElementById('name').value;
    let email= document.getElementById('email').value;

    if (name == "" || email == "") 
    {
        alert("Please Enter Information in All the fields");
        return false;
    }
    else
    {
        var validNameRegex = /^([a-zA-Z ]){2,30}$/;
        var validEmailRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
        if (validNameRegex.test(name) && validEmailRegex.test(email)) 
        {
            /*alert("Valid email address!");
            document.form1.text1.focus();
            return true;*/
            
            var checked_use = document.querySelector('input[name = "use"]:checked');
            //var checked_suggestion = document.getElementsByName('use').checked;
            //var checked_use = document.getElementsByName('use').checked;

            var checked_suggestion = document.querySelector('input[name = "suggest"]:checked');
            var checked_satisfaction = document.querySelector('input[name = "satisfaction"]:checked');
            if(checked_use != null && checked_suggestion !=null && checked_satisfaction != null )
            {  
                //alert("valid");
                comments = document.getElementById('comment').value;
                if(comments != "")
                {
                    alert(" Please Check Your Details \n" + 
                      "\n Customer Name: " + name +
                      "\n Email: " + email +
                      "\n Is this first time You are using our products & service? " + checked_use.value + 
                      "\n Would you suggest to your friend and colleague? " + checked_suggestion.value +
                      "\n How satisfied are you with our company overall? " + checked_satisfaction.value +
                      "\n Suggestions (if any): " + comments); 
                      resetForm();
                }
                else
                {
                    alert(" Please Check Your Details \n" + 
                      "\n Customer Name: " + name +
                      "\n Email: " + email +
                      "\n Is this first time You are using our products & service? " + checked_use.value + 
                      "\n Would you suggest to your friend and colleague? " + checked_suggestion.value +
                      "\n How satisfied are you with our company overall? " + checked_satisfaction.value +
                      "\n Suggestions (if any): No Suggestions"); 
                      resetForm();
                }
                
            } 
            else 
            {
                alert('Nothing checked'); 
            }
        } 
        else
        {
            alert("Please fill all the required fields !");
        }
    }
    
}