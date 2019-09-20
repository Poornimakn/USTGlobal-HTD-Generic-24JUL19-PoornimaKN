import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-mobilesdetails',
  templateUrl: './mobilesdetails.component.html',
  styleUrls: ['./mobilesdetails.component.css']
})
export class MobilesdetailsComponent implements OnInit {
  @Input() mobileDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
