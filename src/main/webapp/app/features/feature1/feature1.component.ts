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

    persons: SevisPerson[];
    selectedPerson: SevisPerson;
    editMode: boolean;

    constructor(
      private feature1Service: Feature1Service,
      private parseLinks: JhiParseLinks
    ) {}

    ngOnInit() {
        this.feature1Service.query({page: 1}).subscribe((res) => {
          this.persons = res.body;
        });
        this.editMode = false;
    }

    editPerson( id ) {
      for ( let i = 0; i < this.persons.length; i++) {
          if ( this.persons[i].id === id ) {
            this.selectedPerson = this.persons[i];
            break;
          }
      }
      this.editMode = true;
    }

    deletePerson( id ) {
      for ( let i = 0; i < this.persons.length; i++) {
        if ( this.persons[i].id === id ) {
          this.persons.splice(i, 1); ;
          break;
        }
    }
      this.editMode = false;
    }

    savePerson( ) {
      this.editMode = false;
      if( this.selectedPerson.id === "") {
        this.selectedPerson.id = "" + this.persons.length;
        this.persons.push(this.selectedPerson);
      }
    }
    cancelSavePerson( ) {
      this.editMode = false;
    }

    addPerson( ) {
      this.selectedPerson = new SevisPerson( "", "",  "",  0, "", "", "" );
      this.editMode = true;
    }

}
