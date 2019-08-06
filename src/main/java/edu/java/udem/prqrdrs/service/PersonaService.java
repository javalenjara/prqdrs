/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqrdrs.service;

import edu.java.udem.prqrdrs.dto.PersonaDto;
import java.util.List;

/**
 *
 * @author javalenja
 */
public interface PersonaService {
    public PersonaDto addUser(PersonaDto user);
    public void deleteUser(PersonaDto user);
    public List<PersonaDto> getPersonas();
    public PersonaDto getPersonaByLogin(String login);
}
