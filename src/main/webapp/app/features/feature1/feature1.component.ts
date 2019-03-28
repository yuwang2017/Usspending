import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { JhiParseLinks } from 'ng-jhipster';
import { ITEMS_PER_PAGE } from '../../shared';

import { SevisPerson } from './feature1.model';
import { Feature1Service } from './feature1.service';

@Component({
  selector: 'jhi-feature1',
  templateUrl: './feature1.component.html'
})
export class Feature1Component implements OnInit {

    persons : SevisPerson[]
   
    constructor(    
        private feature1Service: Feature1Service,
        private parseLinks: JhiParseLinks
    ) {
      
    }
  
    ngOnInit() {
        this.feature1Service.query({page: 1}).subscribe((res) => {
          this.persons = res.body;      
        });
    }
}
