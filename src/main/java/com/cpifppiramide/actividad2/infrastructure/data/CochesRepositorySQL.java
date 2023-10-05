package com.cpifppiramide.actividad2.infrastructure.data;

import com.cpifppiramide.actividad2.domain.Coche;
import com.cpifppiramide.actividad2.domain.CochesRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CochesRepositorySQL implements CochesRepository {


    public CochesRepositorySQL(){

    }

    @Override
    public List<Coche> getAll() {
        List<Coche> coches = new ArrayList<>();

        try {
            Statement statement = DBConnection.getInstance().createStatement();
            ResultSet rs = statement.executeQuery("select * from coches");
            while (rs.next()){
                Coche coche = new Coche(
                        rs.getString("matricula"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("km")
                        );
                coches.add(coche);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return coches;
    }

    @Override
    public void save(Coche coche) {
        try {
            PreparedStatement statement =
                    DBConnection.getInstance().prepareStatement("insert into coches (matricula, marca, modelo, km) values " +
                            "(?,?,?,?)");
            statement.setString(1,coche.getMatricula());
            statement.setString(2,coche.getMarca());
            statement.setString(3,coche.getModelo());
            statement.setInt(4,coche.getKm());
            statement.execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
