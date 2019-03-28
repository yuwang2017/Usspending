package com.test.mongo.sevis.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongo.sevis.domain.SevisPerson;


/**
 * REST controller for getting the audit events.
 */
@RestController
@RequestMapping("/sevis")
public class SevisResource {

	/**
     * GET /audits : get a page of AuditEvents.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of AuditEvents in body
     */
    @GetMapping("/listPersons")
    @ResponseBody
    public List<SevisPerson> getAll() {
       List<SevisPerson> persons = new ArrayList<>();
       
       SevisPerson person1 = new SevisPerson("Joe", "Doe", 26, "Detriot", "F1", "8/15/2018");
       SevisPerson person2 = new SevisPerson("Jane", "Doe", 24, "Washington DC", "F1", "8/17/2017");
       SevisPerson person3 = new SevisPerson("John", "Ken", 30, "New York", "B2", "9/15/2018");
       
       persons.add(person1);
       persons.add(person2);
       persons.add(person3);
       
       return persons;
    }
}
