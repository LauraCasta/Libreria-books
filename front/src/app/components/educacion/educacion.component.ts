import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ComicsService } from 'src/app/services/catalogo/comics.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  constructor(private comics: ComicsService){}

  allComics: Observable<any>;

  ngOnInit(): void {
    this.getComics();
   }

  getComics(){
    this.allComics = this.comics.getAllComics();
    console.log(this.allComics);
  }

}
