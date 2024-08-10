import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Panne } from '../Model/Panne';

@Injectable({
  providedIn: 'root'
})
export class PanneService {

  private BaseUrl = "http://localhost:8080/api/v1/pannes";
  constructor( private httpclient : HttpClient) { }

  getPannelist() : Observable<Panne[]>{
    return this.httpclient.get<Panne[]>(`${this.BaseUrl}`);
  }
}
