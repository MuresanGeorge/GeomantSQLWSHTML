package com.example.demo.repository;

import com.example.demo.model.X;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public class XRepositoryImpl implements XRepositoryCustom{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<X> getX(Integer idxx) {
        StoredProcedureQuery getX = this.entityManager.createNamedStoredProcedureQuery("storedProcedure");
        getX.setParameter("idxx", idxx);
        getX.execute();
        return getX.getResultList();
    }
}
