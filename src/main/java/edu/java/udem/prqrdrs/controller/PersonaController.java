/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqrdrs.controller;

import edu.java.udem.prqrdrs.dto.PersonaDto;
import edu.java.udem.prqrdrs.service.PersonaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
public class PersonaController {
    
    PersonaService personaService = null;

    @Autowired
    PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    PersonaDto addPersona(@RequestBody PersonaDto personaDto) {
        return personaService.addUser(personaDto);
    }
    /*
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    void deletePersona(@RequestBody PersonaDto personaDto){
        personaService.deleteUser(personaDto);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    PersonaDto getPersona (@RequestBody String login) {
        return personaService.getPersonaByLogin(login);
    }
    */
    /*@ApiOperation(
            value = "Retorna la lista de personas",
            response = String.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Restorna la lista de personas en JSON")})
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<PersonaDto> findAll() {
        return personaService.getPersonas();
    }*/
}