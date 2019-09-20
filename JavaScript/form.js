function validateForm()
{
    let formData=document.forms[0];
    console.log(formData.uname.value);
    let username=formData.uname.value;
    let passwrd=formData.pwd.value;
    if(username.length>4 && passwrd.length>7){
        console.log('Success');
        formData.uname.style.border='none';
        formData.pwd.style.border='none';
        formData.loginsubmit.disabled=false;
    }
    else
    {
        formData.uname.style.border='2px solid red';
        formData.pwd.style.border='2px solid red';
        formData.loginsubmit.disabled=true;
    }
}