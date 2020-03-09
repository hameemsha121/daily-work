import { Injectable, Inject } from '@angular/core';
import { from, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';

import { ThrowStmt } from '@angular/compiler';
import { inject } from '@angular/core/testing';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl = 'http://localhost:8000/user/';
  code:number;
  user:User;
  constructor(private httpclient: HttpClient, private userService: UserService) { }

  getAllUser(): Observable<User[]> {
    return this.httpclient.get<User[]>(this.httpUrl);
  }
  saveUser(user: User): Observable<User> {
    return this.httpclient.post<User>(this.httpUrl, user);
  }

  deleteUser(id: number): Observable<User> {
    return this.httpclient.delete<User>(this.httpUrl + id);
  }

  updateUserInfo(user: User): Observable<User> {
    return this.httpclient.put<User>(this.httpUrl+user.id, user);
  }
  getUserById(id: number): Observable<User> {
    return this.httpclient.get<User>(this.httpUrl + id);
  }
  serActivation(obj){
    return this.httpclient.put(`http://localhost:8000/useractivate`,obj);
  }

  LoggedIn(){
    let user_id=localStorage.getItem('userId');
    if(user_id==null)
    return false;
    else  
    return true;
  }

  getUserByCode(code:number):Observable<User>{
    return this.httpclient.get<User>(this.httpUrl+"useractivate/"+code);
  }

  isActivated(user:User){
    if(user.active==="yes"){
      return true;
    }
    else
    {
      alert("not activated")
    }
  }

  }
