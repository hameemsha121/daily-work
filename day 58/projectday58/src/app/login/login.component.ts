import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import { UserService } from '../service/user.service';
import { User } from '../models/user';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:FormGroup;
   users:User[];
   currentUser:User;
  constructor(private formBuilder:FormBuilder,private router:Router,private homeService:UserService, private auth:AuthService) { }
  
  ngOnInit() {
    this.loginForm=this.formBuilder.group({
        name: ['',Validators.required],
        password: ['',Validators.required],
    });

    this.homeService.getAllUser().subscribe(u => {
      this.users=u;
    })
  }

//  isValid(){
//      let userName=this.loginForm.controls.name.value;
//   let password=this.loginForm.controls.password.value;

//      if(this.login(userName,password)){
//       if(this.homeService.isActivated(this.currentUser)){
//         localStorage.removeItem('userId');
//         localStorage.setItem('userId',this.currentUser.id.toString());
//      this.router.navigate(['/user-home']);
//        }else{
//          alert("Please activate your account to login")
//        }
//      }else{
//        alert("Invalid Username or Password");
//        this.loginForm.reset();
//      }
//    }
 

//   login(userName:string,password:string){
//       for(let user of this.users ){
//         if((userName===user.username) && (password===user.password)){
//              this.currentUser=user;
//           return true;
//         }
//       }
//       return false;
//   }

isValid(){

  let username=this.loginForm.get("name").value;
  let password=this.loginForm.get("password").value;
  const result=this.auth.authenticate(username,password);
  console.log('working');
  this.router.navigate(['/user-home']);



}


  // onSubmit(){
  //   console.log(this.loginForm.value);
    
     
  // }
  
  
}
