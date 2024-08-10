import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Equipement } from '../Model/Equipements';

@Injectable({
  providedIn: 'root'
})
export class EquipementService {

  private BaseUrl = "http://localhost:8080/api/v1/auth/admin/equipement";
  constructor(private httpCLient : HttpClient) { }

  getEquipements() : Observable<Equipement[]> {
    return this.httpCLient.get<Equipement[]>(`${this.BaseUrl}/all`);
  }
}