package com.cpifppiramide.actividad2.domain;

import java.util.List;

public interface CochesRepository {

    public List<Coche> getAll();
    public void save(Coche coche);

}
