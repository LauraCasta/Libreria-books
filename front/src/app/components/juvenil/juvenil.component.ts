import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { CarritoService } from 'src/app/services/catalogo/carrito.service';
import { JuvenilService } from 'src/app/services/catalogo/juvenil.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-juvenil',
  templateUrl: './juvenil.component.html',
  styleUrls: ['./juvenil.component.css']
})
export class JuvenilComponent implements OnInit {

  constructor(private books: JuvenilService, private carrito: CarritoService){}

  allBooks: Observable<any>;

  ngOnInit(): void {
    this.getBooks();
   }

  getBooks(){
    this.allBooks=this.books.getAllBooks();
    console.log(this.allBooks);
  }
  addCarro(id: number){
    Swal.fire({
      title: "Desea agregarlo al carrito",
      showDenyButton: true,
      confirmButtonText: "Agregar",
      denyButtonText: `Cancelar`
    }).then((result) => {
      /* Read more about isConfirmed, isDenied below */
      if (result.isConfirmed) {
        this.addCarro(id);
        Swal.fire("Agregado!", "", "success");
      }
    })}
}
