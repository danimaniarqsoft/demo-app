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
 * The Producto
 * 
 * @author KUKULKAN
 *
 */
@Document(collection = "PRODUCTO")
public class Producto implements Serializable {
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
     * Este campo corresponde a la tabla PRODUCTO
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("nombre")
    private String nombre;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PRODUCTO
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("imagen")
    private byte[] imagen;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PRODUCTO
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("imagenContentType")
    private String imagenContentType;
	
    /**
     * Este campo fue generado automaticamente por KUKULKAN 
     * Este campo corresponde a la tabla PRODUCTO
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    @Field("descripcion")
    private String descripcion;
	
    /**
     * Este constructor fue generado automáticamente por KUKULKAN
     * 
     */
    public Producto() {

    }
    
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la llave primaria PRODUCTO.id
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
     * Este método SETTER fue generado para la llave primaria. PRODUCTO.id
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
     * Este método GETTER fue generado para la propiedad PRODUCTO.nombre
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
     * Este método SETTER fue generado para la propiedad. PRODUCTO.nombre
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
     * Este método GETTER fue generado para la propiedad PRODUCTO.imagen
     *
     * @return el valor de imagen
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PRODUCTO.imagen
     *
     * @return el valor de Imagen
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PRODUCTO.imagenContentType
     *
     * @return el valor de imagenContentType
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getImagenContentType() {
        return imagenContentType;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PRODUCTO.imagenContentType
     *
     * @return el valor de ImagenContentType
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setImagenContentType(String imagenContentType) {
        this.imagenContentType = imagenContentType;
    }
    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método GETTER fue generado para la propiedad PRODUCTO.descripcion
     *
     * @return el valor de descripcion
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Este método fue generado automaticamente por KUKULKAN 
     * Este método SETTER fue generado para la propiedad. PRODUCTO.descripcion
     *
     * @return el valor de Descripcion
     *
     * @kukulkanGenerated 2017-12-01T17:36:50Z
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Producto entity = (Producto) o;
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
     * @return el valor de representado por la entidad Producto
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
        sb.append(", imagen=").append(imagen);
        sb.append(", imagenContentType=").append(imagenContentType);
        sb.append(", descripcion=").append(descripcion);
        sb.append("]");
        return sb.toString();
    }
}
