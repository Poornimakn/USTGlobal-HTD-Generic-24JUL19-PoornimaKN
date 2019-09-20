import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-recipiedetails',
  templateUrl: './recipiedetails.component.html',
  styleUrls: ['./recipiedetails.component.css']
})
export class RecipiedetailsComponent implements OnInit {
  @Input() recipieDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
