import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})

export class ComicsService {
  publicKey = "0c4ac05ed6b12da442a0b192fa6574d2";
  hash = "d95d6f1bbe2f4c62dffa961f92db080e";
  urlApi =`http://gateway.marvel.com/v1/public/comics?ts=1&apikey=${this.publicKey}&hash=${this.hash}`;

  constructor(
    private http: HttpClient
    ) { }

    getAllComics(): Observable<any>{
      return this.http.get<any>(this.urlApi)
      .pipe(map((data: any) => data.data.results))
    }

}
