import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  json:any[] = [];
  constructor(private http:HttpClient) {
    http.get<any>('https://jsonplaceholder.typicode.com/posts')
    .subscribe(resData =>{
      this.json =resData;
      //console.log(this.indianNews);
    })
   }

  ngOnInit() {
    
  }

}
