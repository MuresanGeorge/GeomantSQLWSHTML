package com.example.demo.service;

import com.example.demo.dto.XDTO;
import com.example.demo.model.X;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface XService {


    List<X> getAllX();

    List<X> getX(Integer idxx);


}
