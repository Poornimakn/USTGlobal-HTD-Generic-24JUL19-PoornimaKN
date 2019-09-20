import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router} from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  Users:any[];
  constructor(private firebase:FirebaseService,private router:Router) { 
    this.getData();
  }

  ngOnInit() {
  }
 getData(){
   this.firebase.getData().subscribe(data=>{
     this.Users=data;
   },err=>{
     console.log(err);
   } ,() => {
    console.log("Data got Successfully");
  })
   }
 }
