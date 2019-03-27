import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { JhiParseLinks } from 'ng-jhipster';
import { ITEMS_PER_PAGE } from '../../shared';

@Component({
  selector: 'jhi-feature1',
  templateUrl: './feature1.component.html'
})
export class Feature1Component implements OnInit {
   
    constructor(
       
        private parseLinks: JhiParseLinks
    ) {
      
    }
  
    ngOnInit() {
     
    }
}
