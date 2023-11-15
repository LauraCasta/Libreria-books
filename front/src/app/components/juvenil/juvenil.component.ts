import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ComicsService } from 'src/app/services/catalogo/comics.service';

@Component({
  selector: 'app-juvenil',
  templateUrl: './juvenil.component.html',
  styleUrls: ['./juvenil.component.css']
})
export class JuvenilComponent implements OnInit {

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
