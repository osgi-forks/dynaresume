/*****************************************************************************
 * Copyright (c) 2009
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com>
 *     Jawher Moussa <jawher.moussa@gmail.com>
 *     Nicolas Inchauspe <nicolas.inchauspe@gmail.com>
 *     Pascal Leclercq <pascal.leclercq@gmail.com>
 *******************************************************************************/
package org.generic.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Pascal
 * @see http://www.bejug.org/confluenceBeJUG/display/BeJUG/Generic+DAO+example
 * @param <T>
 * @param <PK>
 */
public interface  GenericRepository <T, ID extends Serializable> {
    //~ Methods ----------------------------------------------------------------

    /**
     * Get the Class of the entity.
     *
     * @return the class
     */
    Class<T> getEntityClass();

    /**
     * Find an entity by its primary key
     *
     * @param id the primary key
     * @return the entity
     */
    T findById(final ID id);

    /**
     * Load all entities.
     *
     * @return the list of entities
     */
    List<T> findAll();

//    /**
//     * Find entities based on an example.
//     *
//     * @param exampleInstance the example
//     * @return the list of entities
//     */
//    List<T> findByExample(final T exampleInstance);

    /**
     * Find using a named query.
     *
     * @param queryName the name of the query
     * @param params the query parameters
     *
     * @return the list of entities
     */
    List<T> findByNamedQuery(
        final String queryName,
        Object... params
    );

    /**
     * Find using a named query.
     *
     * @param queryName the name of the query
     * @param params the query parameters
     *
     * @return the list of entities
     */
    List<T> findByNamedQueryAndNamedParams(
        final String queryName,
        final Map<String, ?extends Object> params
    );
    
    
    public   List<T> findByQuery(String query,String name,Object value);
    
    
    public List<T> findByQuery(String query,final Map<String,  Object> params);
    
    
//    /**
//     * Count all entities.
//     *
//     * @return the number of entities
//     */
//    int countAll();
//
//    /**
//     * Count entities based on an example.
//     *
//     * @param exampleInstance the search criteria
//     * @return the number of entities
//     */
//    int countByExample(final T exampleInstance);

    
    /**
     * save an entity. This can be either a INSERT or UPDATE in the database.
     * 
     * @param entity the entity to save
     * 
     * @return the saved entity
     */
    T save(final T entity);

    /**
     * delete an entity from the database.
     * 
     * @param entity the entity to delete
     */
    void delete(final T entity);
}
