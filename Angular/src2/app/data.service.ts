import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  apiurl='https://api.github.com/users';

  constructor(private_http: HttpClient) { }

  getUsers(){
    
  }
}
