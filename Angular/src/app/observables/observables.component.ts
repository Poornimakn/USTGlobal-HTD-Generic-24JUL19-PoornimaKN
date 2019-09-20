import { Component, OnInit, OnDestroy } from '@angular/core';
import { interval, Subscriber, Subscription } from 'rxjs';

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit, OnDestroy {
  mySubscription: Subscription;
  constructor() { }

  ngOnInit() {

    this.mySubscription=interval(1000).subscribe(data=>{ //interval takes miliseconds 
      console.log(data);
    }, err=>{
    console.log(err);
    },()=>{
      console.log('complete');
    });
    }
  ngOnDestroy(){
    this.mySubscription.unsubscribe();
  }

}
