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
package mx.infotec.dads.mongo.web.rest;

import java.util.List;
import java.util.Optional;

import com.codahale.metrics.annotation.Timed;
import io.swagger.annotations.ApiParam;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import mx.infotec.dads.mongo.web.rest.util.HeaderUtil;
import mx.infotec.dads.mongo.web.rest.util.PaginationUtil;

import mx.infotec.dads.mongo.domain.Producto;
import mx.infotec.dads.mongo.service.ProductoService;
/**
 * 
 * @author KUKULKAN
 * @kukulkanGenerated 2017-12-01T17:36:50Z
 */

@RestController
@RequestMapping("/api")
public class ProductoResource {

    private static final Logger log = LoggerFactory.getLogger(ProductoResource.class);
    
    private static final String ENTITY_NAME = "producto";

    @Autowired
    private ProductoService service;
    
    /**
     * GET  /productos : recupera todos los productos.
     *
     * @param pageable información de paginación
     * @return El objeto ResponseEntity con estado de 200 (OK) y la lista de productos en el cuerpo del mensaje
     */
    @GetMapping("/productos")
    @Timed
    public ResponseEntity<List<Producto>> getAllProducto(@ApiParam Pageable pageable) {
        log.debug("REST request to get a page of Producto");
        Page<Producto> page = service.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/productos");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /productos/:id : recupera por "id" de Producto.
     *
     * @param id el id del Producto que se desea recuperar
     * @return El objeto ResponseEntity con el estado de 200 (OK) y dentro del cuerpo del mensaje el Producto, o con estado de 404 (Not Found)
     */
    @GetMapping("/productos/{id}")
    @Timed
    public ResponseEntity<Producto> getProducto(@PathVariable String id) {
        log.debug("REST request to get Producto : {}", id);
        Producto producto = service.findById(id);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(producto));
    }

    /**
     * POST  /productos : Create a new usuario.
     *
     * @param producto el producto que se desea crear
     * @return El objeto ResponseEntity con estado 201 (Created) y en el cuerpo un nuevo producto, o con estado 400 (Bad Request) si el usuario ya tiene un ID
     * @throws URISyntaxException Si la sintaxis de la URI no es correcta
     */
    @PostMapping("/productos")
    @Timed
    public ResponseEntity<Producto> createProducto(@Valid @RequestBody Producto producto) throws URISyntaxException {
        log.debug("REST request to save Producto : {}", producto);
        if (producto.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new producto cannot already have an ID")).body(null);
        }
        Producto result = service.save(producto);
        return ResponseEntity.created(new URI("/api/productos/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }
    
    /**
     * PUT  /productos : Actualiza un Producto existente.
     *
     * @param producto el producto que se desea actualizar
     * @return el objeto ResponseEntity con estado de 200 (OK) y en el cuerpo de la respuesta el Producto actualizado,
     * o con estatus de 400 (Bad Request) si el producto no es valido,
     * o con estatus de 500 (Internal Server Error) si el producto no se puede actualizar
     * @throws URISyntaxException si la sintaxis de la URI no es correcta
     */
    @PutMapping("/productos")
    @Timed
    public ResponseEntity<Producto> updateProducto(@Valid @RequestBody Producto producto) throws URISyntaxException {
        log.debug("REST request to update Producto : {}", producto);
        if (producto.getId() == null) {
            return createProducto(producto);
        }
        Producto result = service.save(producto);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, producto.getId().toString()))
            .body(result);
    }


    /**
     * DELETE  /productos/:id : borrar el Producto con "id".
     *
     * @param id el id del Producto que se desea borrar
     * @return el objeto ResponseEntity con estatus 200 (OK)
     */
    @DeleteMapping("/productos/{id}")
    @Timed
    public ResponseEntity<Void> deleteProducto(@PathVariable String id) {
        log.debug("REST request to delete Producto : {}", id);
        service.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    /**
     * SEARCH  /_search/productos?query=:query : buscar por el producto correspondiente
     * to the query.
     *
     * @param query el query para el producto que se desea buscar
     * @param pageable información de la paginación
     * @return el resultado de la busqueda
     */
    @GetMapping("/_search/productos")
    @Timed
    public ResponseEntity<List<Producto>> searchProducto(@RequestParam String query, @ApiParam Pageable pageable) {
        log.debug("REST request to search for a page of Producto for query {}", query);
        Page<Producto> page = service.search(query, pageable);
        HttpHeaders headers = PaginationUtil.generateSearchPaginationHttpHeaders(query, page, "/api/_search/productos");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }
    
}