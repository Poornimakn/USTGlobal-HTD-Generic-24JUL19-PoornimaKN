import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  public interpolation="Interpolation";
  public property="Property";
  public hasError=true;
  public isDisabled=true;
  public class="text-special";
  public color="yellow";
  public name="Poorni"
  public message="";

  public class1={
    "text-success":!this.hasError,
    "text-danger":this.hasError,
    "text-special":this.hasError
  }
  public style1={
    color:"purple",
    fontStyle:"italic"
  }

  sendData()
  {
    alert("Data Sent Successfully");
  }
  send(event)
  {
    alert(event);
    alert(event.type);
  }
  log(value)
  {
    console.log(value);
  }
  bind()
  {
    alert("Event Binding");
  }

  constructor() { }

  ngOnInit() {
  }

}
