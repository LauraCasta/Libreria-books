import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth/auth.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})

export class HeaderComponent implements OnInit{


  constructor(protected authService: AuthService, private router: Router){

  }


  ngOnInit(): void {

  }

  async cerrarSesion(){
    const sesion = await this.authService.cerrarSesion();
    if(sesion){
      this.router.navigate(['/login']);
      Swal.fire('Se cerro con exito la cuenta');
    }
  }


}
