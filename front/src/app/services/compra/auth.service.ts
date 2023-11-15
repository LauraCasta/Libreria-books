import { Injectable } from '@angular/core';
import { DbService } from '../db/db.service';
import { NgForm } from '@angular/forms';
import { descryp, encrypt } from 'src/app/util/util-encrypt';
import { Usuario } from '../interfaces/user.interface';
import Swal from 'sweetalert2';

@Injectable({
  providedIn: 'root'
})

export class AuthService {

  constructor(
    private db: DbService
    ) { }

    datosUsuario: Usuario = {
      nombre: '',
      correo: '',
      password: '',
      sesion: false
    }

  async postUser(datos: NgForm){
    const $datos = await this.db.table('usuarios').where('correo').equals(datos.value.correo).toArray();
    if($datos.length){
      return false;
    }else{
      datos.value.password = encrypt(JSON.stringify(datos.value.password));
      this.db.table('usuarios').add({...datos.value, sesion:false});
      return true;
    }

  }

  async getLogin(datos: NgForm){
    const $datos = await this.db.table('usuarios').where('correo').equals(datos.value.correo).toArray();

    if(!$datos.length){
      Swal.fire({icon: 'error',
      title: 'Usuario no existe'});
      return false;
    }else{
      const user = $datos[0]
      if(datos.value.password === descryp(user.password)){
        try{
          await this.db.table('usuarios').update(user.id,{sesion:true});
          this.datosUsuario = user;
          this.datosUsuario.sesion= true;
          return true;
        }catch(error){
          console.log(error);
          return false;
        }
      }else{
        Swal.fire({icon: 'error',
        title: 'Usuario o contraseña invalidos'});
        return false;
      }
    }
  }

  async cerrarSesion(){
    try{
      await this.db.table('usuarios').update(this.datosUsuario.id,{sesion:false});
      this.datosUsuario = this.datosUsuario;
      this.datosUsuario.sesion= false;
      return true;
    }catch(error){
      console.log(error);
      return false;
    }
  }

  estaAutenticado(){
    return this.datosUsuario.sesion;
  }

}
