import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidator } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  get fname(){
    return this.registerForm.get('fname');
  }
  get lname(){
    return this.registerForm.get('lname');
  }
  get email(){
    return this.registerForm.get('email');
  }
  get phno(){
    return this.registerForm.get('phno');
  }

  registerForm=new FormGroup({
    fname :new FormControl('',[Validators.minLength(4),
                            Validators.required]),
    lname :new FormControl('',[Validators.minLength(4),
                              Validators.required]),
    email :new FormControl('',[Validators.email,Validators.minLength(5),Validators.required,CustomValidator.noSpace ]),
    phno  :new FormControl('',[Validators.minLength(10),Validators.required])
  })

  ngOnInit() {
  }
printForm(form){
  console.log(form);
}
}
