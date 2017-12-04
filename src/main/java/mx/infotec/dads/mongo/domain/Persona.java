/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2017 KUKULKAN
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.infotec.dads.mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Objects;
/**
 * The Persona
 * 
 * @author KUKULKAN
 *
 */
@Document(collection = "PERSONA")
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la llave primaria id
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Id
    private String id;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PERSONA
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("nombre")
    private String nombre;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PERSONA
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("primerApellido")
    private String primerApellido;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PERSONA
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("segundoApellido")
    private String segundoApellido;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PERSONA
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("edad")
    private Integer edad;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PERSONA
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("correo")
    private String correo;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PERSONA
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("telefono")
    private String telefono;
	
    /**
     * Este constructor fue generado automáticamente por KUKULKAN
     * 
     */
    public Persona() {

    }
    
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la llave primaria PERSONA.id
     *
     * @return el valor de id
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getId() {
        return id;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la llave primaria. PERSONA.id
     *
     * @return el valor de area_conocimiento.id
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PERSONA.nombre
     *
     * @return el valor de nombre
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PERSONA.nombre
     *
     * @return el valor de Nombre
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PERSONA.primerApellido
     *
     * @return el valor de primerApellido
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PERSONA.primerApellido
     *
     * @return el valor de PrimerApellido
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PERSONA.segundoApellido
     *
     * @return el valor de segundoApellido
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PERSONA.segundoApellido
     *
     * @return el valor de SegundoApellido
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PERSONA.edad
     *
     * @return el valor de edad
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PERSONA.edad
     *
     * @return el valor de Edad
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PERSONA.correo
     *
     * @return el valor de correo
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PERSONA.correo
     *
     * @return el valor de Correo
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PERSONA.telefono
     *
     * @return el valor de telefono
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PERSONA.telefono
     *
     * @return el valor de Telefono
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Persona entity = (Persona) o;
        if (entity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
    
    /**
     * Este método fue generado automaticamente por KUKULKAN
     *
     * @return el valor de representado por la entidad Persona
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nombre=").append(nombre);
        sb.append(", primerApellido=").append(primerApellido);
        sb.append(", segundoApellido=").append(segundoApellido);
        sb.append(", edad=").append(edad);
        sb.append(", correo=").append(correo);
        sb.append(", telefono=").append(telefono);
        sb.append("]");
        return sb.toString();
    }
}
