/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqrdrs.controller;

import edu.java.udem.prqrdrs.dto.PersonaDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 8028609
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    PersonaDto addPersona() {
        return new PersonaDto();
    }
}
