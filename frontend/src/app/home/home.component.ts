import { Component, OnDestroy, OnInit } from "@angular/core";
import { HomeService } from "./home.service";
import { SearchService } from "../core/header/header.service";
import { Subject, takeUntil } from "rxjs";
import { Credito } from "./credito";


@Component({
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit, OnDestroy{

    creditos: Credito[] = []
    private destroy$ = new Subject<void>();

    constructor(
        private homeService: HomeService,
        private searchService: SearchService
    ){}

    ngOnInit(): void {

        this.searchService.valueForm$
        .pipe(takeUntil(this.destroy$))
        .subscribe(
            values => {
                values.selectNumber == 'numeroNfse' ?
                this.getByNumeroNfse(values.filterNumber)
                : this.getByNumeroCredito(values.filterNumber)
            }
        )

    }

    getByNumeroNfse(number: string){
        this.homeService.getByNumeroNfse(number)
            .pipe(takeUntil(this.destroy$))
            .subscribe(creditos => {this.creditos = creditos})
    }

    getByNumeroCredito(number: string){
        this.homeService.getByNumeroCredito(number)
            .pipe(takeUntil(this.destroy$))
            .subscribe(credito => {this.creditos = [credito]})
    }

    ngOnDestroy(): void {
        this.destroy$.next();
        this.destroy$.complete();
    }

}