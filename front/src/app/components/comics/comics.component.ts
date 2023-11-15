import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ComicsService } from 'src/app/services/catalogo/comics.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-comics',
  templateUrl: './comics.component.html',
  styleUrls: ['./comics.component.css']
})
export class ComicsComponent implements OnInit {

  constructor(private comics: ComicsService){}

  allComics: Observable<any>;

  ngOnInit(): void {
    this.getComics();
   }

  getComics(){
    this.allComics = this.comics.getAllComics();
    console.log(this.allComics);
  }
  addCarro(){
    Swal.fire({
      title: "Desea agregarlo al carrito",
      showDenyButton: true,
      confirmButtonText: "Agregar",
      denyButtonText: `Cancelar`
    }).then((result) => {
      /* Read more about isConfirmed, isDenied below */
      if (result.isConfirmed) {
        Swal.fire("Agregado!", "", "success");
      }
    })}
}
