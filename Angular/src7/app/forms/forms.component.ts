import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {

  users=[];
  constructor() { }
  
  post(form:NgForm)
  {
    console.log(form.value);
    this.users.push(form.value);
    form.reset();
    console.log(this.users);
  }

  ngOnInit() {
  }

}
