/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.sampleprj.dao.PersistenceException;
import edu.eci.pdsw.sampleprj.dao.TipoItemDAO;
import edu.eci.pdsw.sampleprj.dao.mybatis.mappers.TipoItemMapper;
import edu.eci.pdsw.samples.entities.TipoItem;
import java.util.List;

/**
 *
 * @author user
 */
public class MyBATISTipoItemDAO implements TipoItemDAO{
    @Inject
    private TipoItemMapper tipoItemMapper;
	
    @Override
    public TipoItem load(int id) throws PersistenceException {
        return tipoItemMapper.consultarTipoItem(id); 
    }

    @Override
    public List<TipoItem> consultarTiposItems() {
        return tipoItemMapper.consultarTiposItems();
    }
}
