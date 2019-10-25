package com.example.demo.controller;

import com.example.demo.dto.XDTO;
import com.example.demo.model.X;
import com.example.demo.service.XService;
import com.example.demo.service.XServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/geomant")
public class XController {

    @Autowired
    public XServiceImpl xService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start () {
        return "test spring";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<X> getAll(){
        return xService.getAllX();
    }

//    @RequestMapping(value = "/getXById/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
//    public List<X> getX(@PathVariable Integer id){
//        return xService.getX(id);
//    }

    @RequestMapping(value = "/getXById", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
    public List<X> getX(@RequestParam(value = "id", required = false) Integer id){
        return xService.getX(id);
    //http://localhost:8080/geomant/getXById/?id=3 id param name, 3 param value
}

}
