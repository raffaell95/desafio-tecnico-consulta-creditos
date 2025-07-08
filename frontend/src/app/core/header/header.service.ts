import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { FormFields } from './formFields';

@Injectable({
  providedIn: 'root'
})
export class SearchService {

  private filter = new Subject<FormFields>();

  valueForm$ = this.filter.asObservable();

  searchNumber(valuesForm: FormFields) {
    this.filter.next(valuesForm);
  }
}