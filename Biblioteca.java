package example.org;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Categoria {
    AVENTURAS,
    CIENCIA_FICCION,
    ROMANTICA,
    HISTORIA,
    ARTE
}


class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (!libro.isPrestado() && libro.getEdadRecomendada() <= calcularEdad(usuario.getFechaNacimiento())) {
            libro.setPrestado(true);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + usuario.getNombre());
        } else {
            System.out.println("El libro no está disponible para préstamo");
        }
    }

    private int calcularEdad(String fechaNacimiento) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void devolverLibro(Libro libro) {
        libro.setPrestado(false);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido"); }

	public void guardarEstadoEnArchivo(String string) {
		// TODO Auto-generated method stub
		
	}}