import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class ProgramacionService {
  urlApi =`api/v1/get/?category=libros_programacion&callback=?`;

  constructor(
    private http: HttpClient
    ) { }

    getAllBooks(){
      return this.http.get<any[]>(this.urlApi)
    }


}
