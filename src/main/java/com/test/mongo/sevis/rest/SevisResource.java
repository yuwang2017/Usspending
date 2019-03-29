package com.test.mongo.sevis.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongo.sevis.domain.SevisPerson;
import com.test.mongo.sevis.service.SevisPersonService;


/**
 * REST controller for getting the audit events.
 */
@RestController
@RequestMapping("/sevis")
public class SevisResource {
	
	@Autowired
	SevisPersonService sevisPersonService;

	/**
     * GET /audits : get a page of AuditEvents.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of AuditEvents in body
     */
    @GetMapping("/listPersons")
    @ResponseBody
    public List<SevisPerson> getAll() {
    	  
       if(sevisPersonService.findPersonById("1") == null) {
    	    SevisPerson person1 = new SevisPerson("1", "Joe", "Doe", 26, "Detriot", "F1", "8/15/2018");
    	    SevisPerson person2 = new SevisPerson("2", "Jane", "Doe", 24, "Washington DC", "F1", "8/17/2017");
    	    SevisPerson person3 = new SevisPerson("3", "John", "Ken", 30, "New York", "B2", "9/15/2018");
    	    sevisPersonService.saveSevisPerson(person1);
    	    sevisPersonService.saveSevisPerson(person2);
    	    sevisPersonService.saveSevisPerson(person3);
       }
       /*
       List<SevisPerson> persons = new ArrayList<>();
 
       SevisPerson person1 = new SevisPerson("1", "Joe", "Doe", 26, "Detriot", "F1", "8/15/2018");
       SevisPerson person2 = new SevisPerson("2", "Jane", "Doe", 24, "Washington DC", "F1", "8/17/2017");
       SevisPerson person3 = new SevisPerson("3", "John", "Ken", 30, "New York", "B2", "9/15/2018");
       
       persons.add(person1);
       persons.add(person2);
       persons.add(person3);
       */
       
       return sevisPersonService.findAll();
    }
}
