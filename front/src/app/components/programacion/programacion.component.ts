import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ProgramacionService } from 'src/app/services/catalogo/programacion.service';

@Component({
  selector: 'app-programacion',
  templateUrl: './programacion.component.html',
  styleUrls: ['./programacion.component.css']
})
export class ProgramacionComponent implements OnInit {

  constructor(private books: ProgramacionService){}

  allBooks: any;

  ngOnInit(): void {
    this.getBooks();
   }

  getBooks(){
    this.books.getAllBooks().subscribe((response)=> this.allBooks=response);
    console.log(this.allBooks);
  }

}
