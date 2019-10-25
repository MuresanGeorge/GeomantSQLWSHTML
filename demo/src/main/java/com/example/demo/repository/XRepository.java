package com.example.demo.repository;

import com.example.demo.model.X;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XRepository  extends JpaRepository<X, Integer>, XRepositoryCustom {

//    @Procedure(name = "storedProcedure")
//    List<X> getX(@Param("idxx") Integer idxx);

}
