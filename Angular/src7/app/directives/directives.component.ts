import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {

  orange=false;
  public name=false;
  color="yellow";
  public array=['cat','dog','cow']
  constructor() { }

  ngOnInit() {
  }

}
