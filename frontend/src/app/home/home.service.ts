import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { environment } from "../../enviroments/environment";
import { Credito } from "./credito";

const API = environment.ApiUrl

@Injectable({providedIn: 'root'})
export class HomeService{

    constructor(private http: HttpClient){}

    getByNumeroNfse(numeroNfse: string){
        return this.http.get<Credito[]>(`${API}/api/creditos/${numeroNfse}`)
    }

    getByNumeroCredito(numeroCredito: string){
        return this.http.get<Credito>(`${API}/api/creditos/credito/${numeroCredito}`)
    }

}