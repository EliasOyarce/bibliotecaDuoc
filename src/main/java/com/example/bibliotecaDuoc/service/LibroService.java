package com.example.bibliotecaDuoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaDuoc.model.libro;
import com.example.bibliotecaDuoc.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<libro> readAll() {
        return libroRepository.obtenerLibros();
    }
    public libro save(libro book) {
        return libroRepository.guardar(book);
    }
    public libro update(libro book) {
        return libroRepository.actualizar(book);
    }
    public void delete(libro book) {
        libroRepository.eliminar(book.getId());
    }
    public libro readbyId(int id) {
        return libroRepository.buscarxId(id);
    }
    public libro readbyIsbn(String isbn) {
        return libroRepository.buscarxIsbn(isbn);
    }

}
