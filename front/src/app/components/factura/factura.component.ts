import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { DetalleService } from 'src/app/services/compra/detalle.service';
import { Detalle } from 'src/app/services/interfaces/detalle.interface';

@Component({
  selector: 'app-factura',
  templateUrl: './factura.component.html',
  styleUrls: ['./factura.component.css']
})
export class FacturaComponent implements OnInit{
  constructor(private detalle: DetalleService){}

  allDetalle: Detalle;
  allBooks: Observable<any>;

  ngOnInit(): void {
    this.getDetalle();
    this.getBooks();
  }

  getBooks(){
    this.allBooks=this.detalle.getItems();
    console.log(this.allBooks);
  }
  getDetalle(){
    this.detalle.getAllDetalle().subscribe((data)=> this.allDetalle=data);
  }
}
