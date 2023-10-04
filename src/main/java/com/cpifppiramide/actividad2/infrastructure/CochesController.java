package com.cpifppiramide.actividad2.infrastructure;

import com.cpifppiramide.actividad2.application.CochesUseCases;
import com.cpifppiramide.actividad2.domain.Coche;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CochesController {

    private CochesUseCases cochesUseCases;

    public CochesController(){

    }

    @GetMapping("/")
    public String getAll(){
        return "coches";
    }

    @GetMapping("/nuevo")
    public String formNuevo(){
        return "nuevo";
    }

    @PostMapping("/nuevo")
    public String saveNuevo(Coche coche){
        return "redirect:/";
    }

}
