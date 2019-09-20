import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';
// import { User } from './user';


@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
  url:string='https://product-672df.firebaseio.com/';


  constructor(private http: HttpClient) { }

postData(data){
  return this.http.post(`${this.url}/users.json`,data);
  //users is collection name.json
}

getData() {
  return this.http.get(`${this.url}/users.json`).pipe(map(data=>{
    let newArray:any[]=[];
    for(let key in data){
      newArray.push({...data[key],id:key});
    }
    return newArray;
  }))
}
 
}

