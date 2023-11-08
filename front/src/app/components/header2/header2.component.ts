import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth/auth.service';

@Component({
  selector: 'app-header2',
  templateUrl: './header2.component.html',
  styleUrls: ['./header2.component.css']
})

export class Header2Component implements OnInit{


  constructor(protected authService: AuthService, private router: Router){

  }


  ngOnInit(): void {

  }


}
