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
@Table(name="churros")
public class churros {
    @Id
    @Column(name="id_churro")
    private String id_churro;
    @Column(name="tipo")
    private String tipo;
    @Column(name="precio")
    private String precio;

    public String getId_churro() {
        return id_churro;
    }

    public void setId_churro(String id_churro) {
        this.id_churro = id_churro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
