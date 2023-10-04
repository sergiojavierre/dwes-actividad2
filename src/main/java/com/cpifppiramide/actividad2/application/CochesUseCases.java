package com.cpifppiramide.actividad2.application;

import com.cpifppiramide.actividad2.domain.Coche;
import com.cpifppiramide.actividad2.domain.CochesRepository;

import java.util.List;

public class CochesUseCases {

    private CochesRepository cochesRepository;

    public CochesUseCases(CochesRepository cochesRepository){
        this.cochesRepository = cochesRepository;
    }

    public List<Coche> getAll(){
        return this.cochesRepository.getAll();
    }

    public void save(Coche coche){
        this.cochesRepository.save(coche);
    }

    public Coche findByMatricula(String matricula){
        List<Coche> coches = this.cochesRepository.getAll();
        for(Coche actual: coches){
            if(actual.getMatricula().equals(matricula)){
                return actual;
            }
        }
        return null;
    }
}
