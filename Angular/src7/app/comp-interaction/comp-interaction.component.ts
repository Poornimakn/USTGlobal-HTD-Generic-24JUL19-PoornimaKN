import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-comp-interaction',
  templateUrl: './comp-interaction.component.html',
  styleUrls: ['./comp-interaction.component.css']
})
export class CompInteractionComponent implements OnInit {

  @Input() public parentdata="";
  @Output() event= new EventEmitter();

  sendData(data)
  {
    this.event.emit(data);
  }
  ngOnInit() {
  }

}