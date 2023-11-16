import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class CarritoService {
  urlApi =`/api/Libreria/mostrarItems`;
  urlApiCarrito=`/api/Libreria/mostrarCarrito/1`;
  urlApiItems= "";

  constructor(
    private http: HttpClient
    ) { }

    getAllBooks(): Observable<any>{
      return this.http.get<any>(this.urlApi).pipe(map((data:any)=>data))
    }
    getCarrito(){
      return this.http.get(this.urlApiCarrito)
    }
    addlibro(libro : number ){
      this.urlApiItems = `/api/Libreria/agregarLibro/${libro}`;
      return this.http.post<number>(this.urlApiItems,libro);
    }

}
