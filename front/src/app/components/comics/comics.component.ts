import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth/auth.service';
import { Usuario } from 'src/app/services/interfaces/user.interface';

@Component({
  selector: 'app-comics',
  templateUrl: './comics.component.html',
  styleUrls: ['./comics.component.css']
})
export class ComicsComponent implements OnInit {

  constructor(private datosUsuario: AuthService){

  }

  ngOnInit(): void {

  }

  datoComic:Usuario = this.datosUsuario.datosUsuario;

}
