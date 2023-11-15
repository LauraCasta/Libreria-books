import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { EducacionService } from 'src/app/services/catalogo/educacion.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  constructor(private books: EducacionService){}

  allBooks: Observable<any>;

  ngOnInit(): void {
    this.getBooks();
   }

  getBooks(){
    this.allBooks=this.books.getAllBooks();
    console.log(this.allBooks);
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
