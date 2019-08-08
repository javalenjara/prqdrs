/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqrdrs.entities;

/**
 *
 * @author javalenja
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Anotación de JPA que indica que esta clase va a ser una entidad de la BD. Mapea con una tabla de BD
@Table(name = "users") //Indica el nombre de la tabla con la que se va a relacionar esta entidad. Es opcional, si no se coloca la tabla se llama como la clase.
@Data //Ayuda con los get y set para no escribirlos. Autogenera el encapsulamiento de los parámetros.
@Builder //Implementa el patrón Builder Factory
@NoArgsConstructor //Implementa constructor vacío.
@AllArgsConstructor(access = AccessLevel.PRIVATE) //Implementa constructor con parámetros (todos). Y
public class PersonaEntity {
    @Id //Indica que este atributo va a ser el PK. Si PK es compuesta se debe crear una clase con todos los componentes de la PK y en el entity invocarlo como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Autogenera el ID. En el strategy se indica cómo se genera el ID, numérico, cadena, etc. Spring lo genera automáticamente.
    private Long id;
    @Column(name = "login") //Indica que este atributo va a mapear con una columna de la tabla. "name" indica cuál es el nombre de la tabla con la que mapea.
    //Igual que con table, si no se indica el nombre; se asume que la columa se llama como el atributo.
    private String login;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
}
