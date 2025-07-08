import { Component, OnInit } from "@angular/core";
import { SearchService } from "./header.service";
import { FormBuilder, FormGroup } from "@angular/forms";


@Component({
    selector: 'app-header',
    templateUrl: './header.component.html'
})
export class HeaderComponent implements OnInit{

    textNumber: string = ''
    filtroForm!: FormGroup

    constructor(
        private searchService: SearchService,
        private formBuilder: FormBuilder
    ){}

    ngOnInit(): void {
        this.filtroForm = this.formBuilder.group({
            selectNumber: ['numeroNfse'],
            filterNumber: ['']
        });
    }

    selectNumber(form: FormGroup){
        this.searchService.searchNumber(form.value)
    }

}