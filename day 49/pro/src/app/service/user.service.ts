import { Injectable, Inject } from '@angular/core';
import { from, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';
import { USERS } from '../models/user-mock';
import { ThrowStmt } from '@angular/compiler';
import { inject } from '@angular/core/testing';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl = 'http://localhost:8002/user/';
  users = USERS;
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
    return this.httpclient.put<User>(this.httpUrl, user);
  }
  getUserById(id: number): Observable<User> {
    return this.httpclient.get<User>(this.httpUrl + id);
  }
  serActivation(obj){
    return this.httpclient.put(`http://localhost:8002/useractivate`,obj);
  }
}