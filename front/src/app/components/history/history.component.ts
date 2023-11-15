import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { HistoriaService } from 'src/app/services/catalogo/historia.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.css']
})
export class HistoryComponent implements OnInit {

  constructor(private books: HistoriaService){}

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
