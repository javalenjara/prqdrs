/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqrdrs.service;

import edu.java.udem.prqrdrs.dao.PersonaRepository;
import edu.java.udem.prqrdrs.dto.PersonaDto;
import edu.java.udem.prqrdrs.entities.PersonaEntity;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javalenja
 */
@Service
//@Service le está diciendo al Spring (Dependency Container) que la clase PersonaServiceImpl
//va a necesitar una instancia de otra clase. En este caso sería de PersonaRepository y está clase
//se utilizará en el constructor, que está anotado con @Autowired
public class PersonaServiceImpl  implements PersonaService {
    
    PersonaRepository personaRepository;
    @Autowired
    //@Autowired le está diciendo al Spring que el constructor PersonaServiceImpl
    //va a necesitar una instancia de PersonaRepository para pasarlo por parámetro
    //y el Dependency Container debe inyectar esta dependencia. Debo encontrar una instancia
    //de PersonaRepository en el DI Container.
    
    public PersonaServiceImpl(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    
    private PersonaDto getDTO(PersonaEntity user) {
        ModelMapper modelMapper = new ModelMapper();
        PersonaDto dto = modelMapper.map(user, PersonaDto.class);
        return dto;
    }

    private PersonaEntity getEntity(PersonaDto user) {
        ModelMapper modelMapper = new ModelMapper();
        PersonaEntity entity = modelMapper.map(user, PersonaEntity.class);
        return entity;
    }

    @Override
    public PersonaDto addUser(PersonaDto user) {
        return this.getDTO(personaRepository.save(this.getEntity(user)));
    }

    @Override
    public void deleteUser(PersonaDto user) {
        personaRepository.delete(this.getEntity(user));
    }

    @Override
    public List<PersonaDto> getPersonas() {
        List<PersonaDto> list = new ArrayList<PersonaDto>();
        List<PersonaEntity> list2 = this.personaRepository.findAll();
        list2.stream().forEach(p -> list.add(this.getDTO(p)));
        return list;
    }

    @Override
    public PersonaDto getPersonaByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
