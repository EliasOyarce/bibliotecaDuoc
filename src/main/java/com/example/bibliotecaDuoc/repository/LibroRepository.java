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

    public libro buscarxId(int id) {
        for (libro lbro : listaLibros) {
            if(lbro.getId()==id) {
                return lbro;
            }
        }
        return null;
    }

    public libro buscarxIsbn(String isbn) {
        for (libro lbro : listaLibros) {
            if(lbro.getIsbn().equals(isbn)) {
                return lbro;
            }
        }
        return null;
    }

    public libro guardar(libro book) {
        listaLibros.add(book);
        return book;
    }

    public libro actualizar(libro book) {
        libro libroBuscado = buscarxId(book.getId());
        if (libroBuscado != null) {
            libroBuscado.setAutor(book.getAutor());
            libroBuscado.setIsbn(book.getIsbn());
            libroBuscado.setFechaPublicacionb(book.getFechaPublicacionb());
            libroBuscado.setTitulo(book.getTitulo());
            libroBuscado.setEditorial(book.getEditorial());
            return libroBuscado;
        }
        return null;
    }

    public void eliminar(int id) {
        listaLibros.removeIf(book->book.getId()==id);
    }


}
