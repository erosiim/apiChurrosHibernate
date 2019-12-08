/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author exkapp
 */
/*
*El nombre de la clase debe ser el mismo que está en la tabla de la base de datos
*Cada atributo debe llamarse igual que cada campo de la tabla a la que corresponda
*/
@Entity
@Table(name="churrero")
public class churrero {
    @Id
    @Column(name="id_churrero")
    private String id_churrero;
    @Column(name="nombre")
    private String nombre;
    @Column(name="edad")
    private String edad;

    public String getId_churrero() {
        return id_churrero;
    }

    public void setId_churrero(String id_churrero) {
        this.id_churrero = id_churrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}
