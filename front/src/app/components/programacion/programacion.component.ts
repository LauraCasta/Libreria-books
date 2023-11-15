import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ProgramacionService } from 'src/app/services/catalogo/programacion.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-programacion',
  templateUrl: './programacion.component.html',
  styleUrls: ['./programacion.component.css']
})
export class ProgramacionComponent implements OnInit {

  constructor(private books: ProgramacionService){}

  allBooks: Observable<any>;

  ngOnInit(): void {
    this.getBooks();
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
  getBooks(){
    this.allBooks=this.books.getAllBooks();
    console.log(this.allBooks);
  }

}
