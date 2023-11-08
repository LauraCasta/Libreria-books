import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth/auth.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  constructor(private auth: AuthService,
    private router: Router
    ){    }

  async inicioSesion(datos : NgForm){
    const usuario = await this.auth.getLogin(datos);
    if(usuario){
      Swal.fire('Bienvenido al dashboard');
      this.router.navigate(['/dashboard']);
    }
  }

  ngOnInit(): void {
  }
}
