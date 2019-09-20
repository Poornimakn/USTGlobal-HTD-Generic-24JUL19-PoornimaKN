function validate()
{
   let emp = document.forms['empform'];
   let empPwd = emp.pass.value;
   let empCpwd = emp.cpass.value;
   if(empPwd ==='' && empCpwd ==='')
   {
       return false;
   }
   else if(empPwd===empCpwd)
   {
       alert('Success');
       return true;
   }
   else
   {
       alert('Password Not Matching');
       return false;
   }
}