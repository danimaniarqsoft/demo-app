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
 * The Direccion
 * 
 * @author KUKULKAN
 *
 */
@Document(collection = "DIRECCION")
public class Direccion implements Serializable {
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
     * Este campo corresponde a la tabla DIRECCION
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("nombre")
    private String nombre;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla DIRECCION
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("avenida")
    private String avenida;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla DIRECCION
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("numInt")
    private Integer numInt;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla DIRECCION
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("numExt")
    private Integer numExt;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla DIRECCION
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("codigoPostal")
    private Integer codigoPostal;
	
    /**
     * Este constructor fue generado automáticamente por KUKULKAN
     * 
     */
    public Direccion() {

    }
    
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la llave primaria DIRECCION.id
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
     * Este método SETTER fue generado para la llave primaria. DIRECCION.id
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
     * Este método GETTER fue generado para la propiedad DIRECCION.nombre
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
     * Este método SETTER fue generado para la propiedad. DIRECCION.nombre
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
     * Este método GETTER fue generado para la propiedad DIRECCION.avenida
     *
     * @return el valor de avenida
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getAvenida() {
        return avenida;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. DIRECCION.avenida
     *
     * @return el valor de Avenida
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad DIRECCION.numInt
     *
     * @return el valor de numInt
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public Integer getNumInt() {
        return numInt;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. DIRECCION.numInt
     *
     * @return el valor de NumInt
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setNumInt(Integer numInt) {
        this.numInt = numInt;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad DIRECCION.numExt
     *
     * @return el valor de numExt
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public Integer getNumExt() {
        return numExt;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. DIRECCION.numExt
     *
     * @return el valor de NumExt
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setNumExt(Integer numExt) {
        this.numExt = numExt;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad DIRECCION.codigoPostal
     *
     * @return el valor de codigoPostal
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. DIRECCION.codigoPostal
     *
     * @return el valor de CodigoPostal
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Direccion entity = (Direccion) o;
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
     * @return el valor de representado por la entidad Direccion
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
        sb.append(", avenida=").append(avenida);
        sb.append(", numInt=").append(numInt);
        sb.append(", numExt=").append(numExt);
        sb.append(", codigoPostal=").append(codigoPostal);
        sb.append("]");
        return sb.toString();
    }
}
