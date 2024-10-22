package com.mycompany.luiggiestacionamento.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("pu_lpoo_estacionamento");
        entity = factory.createEntityManager();
    }
    
    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }
    
    @Override
    public void fecharConexao() {
        entity.close();
    }
    
    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
    }
    
    @Override
    public void remover(Object o) throws Exception {
        
    }
    
    public EntityManager getEntityManager() {
        if (entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();
        }
        return entity;
    }
    
}
