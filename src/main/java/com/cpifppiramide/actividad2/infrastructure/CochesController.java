package com.cpifppiramide.actividad2.infrastructure;

import com.cpifppiramide.actividad2.application.CochesUseCases;
import com.cpifppiramide.actividad2.domain.Coche;
import com.cpifppiramide.actividad2.domain.CochesRepository;
import com.cpifppiramide.actividad2.infrastructure.data.CochesRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CochesController {

    private CochesUseCases cochesUseCases;

    public CochesController(){
        this.cochesUseCases = new CochesUseCases(new CochesRepositoryRAM());
    }

    @GetMapping("/")
    public String getAll(Model model){
        List<Coche> coches = this.cochesUseCases.getAll();
        model.addAttribute("coches", coches);
        return "coches";
    }

    @GetMapping("/nuevo")
    public String formNuevo(){
        return "nuevo";
    }

    @PostMapping("/nuevo")
    public String saveNuevo(Coche coche){
        this.cochesUseCases.save(coche);
        return "redirect:/";
    }

}
