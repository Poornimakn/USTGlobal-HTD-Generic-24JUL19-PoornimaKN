import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-revision2',
  templateUrl: './revision2.component.html',
  styleUrls: ['./revision2.component.css']
})
export class Revision2Component implements OnInit {

  name="";
  email="";
  color="";

  constructor() 
  { 
   
  }
  send(color)
  {
    if(this.color="red")
    {
      this.color="green";
    }
  }    
  

  ngOnInit() {

  }

}
