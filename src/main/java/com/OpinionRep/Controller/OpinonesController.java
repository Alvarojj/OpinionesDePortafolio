package com.OpinionRep.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.OpinionRep.Models.OpinionesModel;
import com.OpinionRep.Services.OpinionesService;

@RestController
public class OpinonesController {
    @Autowired
    OpinionesService service;
    @PostMapping()
    public OpinionesModel guardarOpinon(@RequestBody OpinionesModel modelo){
        return service.guardarOpinion(modelo);
    }


    @GetMapping()
    public String devuelveMensaje(){
        return "HOLA MUNDO";
    }
}
