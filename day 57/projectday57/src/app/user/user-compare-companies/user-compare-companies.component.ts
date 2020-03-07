import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-user-compare-companies',
  templateUrl: './user-compare-companies.component.html',
  styleUrls: ['./user-compare-companies.component.css']
})
export class UserCompareCompaniesComponent implements OnInit {
  compareSector: FormGroup;
  
  constructor(private formBulder: FormBuilder) { }
  ngOnInit() {
    this.compareSector = this.formBulder.group({
      selectSector1: [''],
      selectSector2: ['']
    });
  }
  compareCompanies(){
    console.log(this.compareSector.value);
    alert(this.compareSector.value);
  }
}
