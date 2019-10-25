package com.example.demo.service;

import com.example.demo.dto.XDTO;
import com.example.demo.model.X;
import com.example.demo.repository.XRepository;
import com.example.demo.repository.XRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XServiceImpl implements XService {

    @Autowired
    public XRepository xRepository;


    @Override
    public List<X> getAllX() {
        return xRepository.findAll();
    }

    @Override
    public List<X> getX(Integer idxx) {
        return xRepository.getX(idxx);
    }
}
