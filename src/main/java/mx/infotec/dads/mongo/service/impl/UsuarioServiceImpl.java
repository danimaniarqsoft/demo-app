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
package mx.infotec.dads.mongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.infotec.dads.mongo.domain.Usuario;
import mx.infotec.dads.mongo.repository.UsuarioRepository;
import mx.infotec.dads.mongo.service.UsuarioService;

/**
 * UsuarioServiceImpl
 * 
 * @author KUKULKAN
 * @kukulkanGenerated 2017-12-01T16:40:48Z
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    private final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);

    @Autowired
    private UsuarioRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Page<Usuario> findAll(Pageable pageable) {
        log.debug("Request to get all Usuario");
        return repository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(String id) {
        log.debug("Request to get Usuario : {}", id);
        return repository.findOne(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public boolean exists(String id) {
        return repository.exists(id);
    }

    @Override
    public void delete(String id) {
        log.debug("Request to delete Usuario : {}", id);
        repository.delete(id);
    }

    @Override
    public void deleteAll() {
        log.debug("Request to delete All Usuario");
        repository.deleteAll();
    }
    
    @Override
    @Transactional(readOnly = true)
    public Page<Usuario> search(String query, Pageable pageable) {
        log.debug("Request to search for a page of Usuario ");
        return repository.findAll(pageable);
    }
}
