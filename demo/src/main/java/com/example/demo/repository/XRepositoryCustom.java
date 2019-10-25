package com.example.demo.repository;

import com.example.demo.model.X;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface XRepositoryCustom {

    List<X> getX(Integer idxx);
}
