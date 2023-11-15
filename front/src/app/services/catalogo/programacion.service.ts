import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ProgramacionService {
  urlApi =`/api/Libreria/mostrarListLibros`;

  constructor(
    private http: HttpClient
    ) { }

    getAllBooks(): Observable<any>{
      return this.http.get<any>(this.urlApi).pipe(map((data:any)=>data))
    }


}
