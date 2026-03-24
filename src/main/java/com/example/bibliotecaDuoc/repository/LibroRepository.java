package com.example.bibliotecaDuoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaDuoc.model.libro;

@Repository
public class LibroRepository {
    
    private List<libro> listaLibros = new ArrayList<>();

    public List<libro> obtenerLibros() {
        return listaLibros;
    }
}
