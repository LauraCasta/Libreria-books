import { NgForm} from '@angular/forms';
import { Component, getNgModuleById } from '@angular/core';
import Swal from 'sweetalert2';
import { AuthService } from 'src/app/services/auth/auth.service';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent {

  constructor(private auth: AuthService){

  }
  async guardar(datos: NgForm ){
    const datoUsuario = datos.value;
    if(datoUsuario.nombre == "" || datoUsuario.correo==""|| datoUsuario.password == "" ){
      Swal.fire({
        icon: 'error',
        title: 'Datos incompletos'});
    }else{
      const usuario = await this.auth.postUser(datos);
      if(usuario){
        Swal.fire({
          icon: 'success',
          title: 'Su registro se realizo con exito',
          showConfirmButton: false,
          timer: 1500
        });
      }else{
        Swal.fire({
          icon: 'error',
          title: 'El usuario ya exite'});
      }
    }
  }
}
