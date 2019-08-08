/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqrdrs.dto;

/**
 *
 * @author javalenja
 */
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //anotación de lombok para crear los métodos getters, setters, equals, hash, y toString; basado en los atributos.
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonaDto {

    private Long id;
    private String login;
    private String email;
    private String password;
    private String name;
    private String apellido;
}