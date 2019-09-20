import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-http',
  templateUrl: './http.component.html',
  styleUrls: ['./http.component.css']
})
export class HttpComponent implements OnInit {

  api:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://api.github.com/users')
    .subscribe(resdata =>{
      this.api=resdata;
    })
   }
   delete(data)
   {
     let index=this.api.indexOf(data);
     this.api.splice(index,1);
   }
  ngOnInit() {
  }

}
