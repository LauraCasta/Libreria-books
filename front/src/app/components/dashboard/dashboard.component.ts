import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth/auth.service';
import { Usuario } from 'src/app/services/interfaces/user.interface';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(private datosUsuario: AuthService){

  }

  ngOnInit(): void {

  }

  datos:Usuario = this.datosUsuario.datosUsuario;

}
