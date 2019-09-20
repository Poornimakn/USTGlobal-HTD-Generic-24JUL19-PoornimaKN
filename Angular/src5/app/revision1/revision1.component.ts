import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-revision1',
  templateUrl: './revision1.component.html',
  styleUrls: ['./revision1.component.css']
})
export class Revision1Component implements OnInit {

  index=1;
  name="Lotus";
  image='https://cdn.pixabay.com/photo/2018/10/30/16/06/water-lily-3784022__340.jpg';
  imagename="Flower";
  color="Red";
  isApplicable=true;
  number=2;
  fname="Poorni";
  img="";
  send(value)
  {
    console.log(value);
  }

  sendData()
  {
    alert("Data sent SuccessFully");
  }
  
  constructor() { 
    setTimeout(() => {
     this.isApplicable=false;
    },4000);

  }
  ngOnInit() 
  {

  }

}

