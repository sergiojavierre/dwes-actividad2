package com.cpifppiramide.actividad2.infrastructure.data;

import com.cpifppiramide.actividad2.domain.Coche;
import com.cpifppiramide.actividad2.domain.CochesRepository;

import java.util.ArrayList;
import java.util.List;

public class CochesRepositoryRAM implements CochesRepository {

    private List<Coche> coches;

    public CochesRepositoryRAM(){
        this.coches = new ArrayList<>();
    }

    @Override
    public List<Coche> getAll() {
        return this.coches;
    }

    @Override
    public void save(Coche coche) {
        this.coches.add(coche);
    }
}
