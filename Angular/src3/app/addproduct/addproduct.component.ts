import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import {FirebaseService} from '../firebase.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private firebase: FirebaseService,private router:Router) { }
  //firebase is just a var it sholud be private this is called injecting
  postUser(form: NgForm){
      this.firebase.postData(form.value).subscribe((data)=>{
        console.log(data);
        // this.firebase.getData();
        form.reset();
      },err=>{
        console.log(err);
      })
  }


  ngOnInit() {
  }

}
