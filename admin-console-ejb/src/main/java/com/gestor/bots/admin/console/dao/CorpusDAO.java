/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.dao;

import com.gestor.bots.admin.console.model.Corpus;
import com.persist.common.dao.DefaultGenericDAOImple;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author GA
 */
@LocalBean
@Stateless
public class CorpusDAO extends DefaultGenericDAOImple<Corpus, Integer>{
     
    public CorpusDAO() {
        super(Corpus.class);
    } 
}
