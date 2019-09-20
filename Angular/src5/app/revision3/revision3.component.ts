import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-revision3',
  templateUrl: './revision3.component.html',
  styleUrls: ['./revision3.component.css']
})
export class Revision3Component implements OnInit {

  @Input() data="";
  @Output() event= new EventEmitter();
  constructor() { }
  send(childdata)
  {
    this.event.emit(childdata);
  }

  ngOnInit() {
  }

}
