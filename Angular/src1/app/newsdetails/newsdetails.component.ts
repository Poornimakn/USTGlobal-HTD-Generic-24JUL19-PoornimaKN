import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-newsdetails',
  templateUrl: './newsdetails.component.html',
  styleUrls: ['./newsdetails.component.css']
})
export class NewsdetailsComponent implements OnInit {
  @Input() newsDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
