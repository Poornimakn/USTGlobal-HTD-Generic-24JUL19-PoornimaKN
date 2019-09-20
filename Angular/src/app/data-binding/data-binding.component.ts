import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent  {
  redColor=true;
  name='Dinga';
  textClasses='bg-success text-white';
  imgURL='https://cdn.pixabay.com/photo/2019/07/23/08/42/nature-4356963_960_720.jpg';

  constructor() {
    setTimeout(()=>{
    this.redColor=false;
    },5000);
  }
}
