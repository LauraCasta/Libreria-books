import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Detalle } from '../interfaces/detalle.interface';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class DetalleService {
    urlApi =`/api/Libreria/mostrarDetalle/1`;
    urlApiItems=`/api/Libreria/mostrarItems`;

    constructor(
      private http: HttpClient
      ) { }

      getAllDetalle(){
        console.log(this.http.get<any>(this.urlApi))
        return this.http.get<Detalle>(this.urlApi)
      }
      getItems(): Observable<any>{
        return this.http.get<any>(this.urlApiItems).pipe(map((data:any)=>data))
      }


}
