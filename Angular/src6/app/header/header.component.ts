import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

users:any[]=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://api.github.com/users')
    .subscribe(resData =>{
      this.users =resData;
      
    })
   }
   deleteData(data)
   {
     let index= this.users.indexOf(data);
      this.users.splice(index,1); 
   }

  ngOnInit() 
  {

  }

}
