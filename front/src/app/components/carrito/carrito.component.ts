import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { CarritoService } from 'src/app/services/catalogo/carrito.service';

@Component({
  selector: 'app-carrito',
  templateUrl: './carrito.component.html',
  styleUrls: ['./carrito.component.css']
})
export class CarritoComponent implements OnInit{
  constructor(private books: CarritoService){}

  allBooks: Observable<any>;
  carrito: any;

  ngOnInit(): void {
    this.getBooks();
    this.getTotal();
   }

  getBooks(){
    this.allBooks=this.books.getAllBooks();
    console.log(this.allBooks);
  }
  getTotal(){
    this.books.getCarrito().subscribe((data: any)=> this.carrito=data);
    console.log(this.carrito);
  }
}
