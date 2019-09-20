import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
indianNews:any[] = [];
  constructor(private http:HttpClient) {
    http.get<any>('https://api.github.com/users')
    .subscribe(resData =>{
      this.indianNews =resData;
      //console.log(this.indianNews);
    })
   }

  ngOnInit() {

  }


}
