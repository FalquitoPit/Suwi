package example.org;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private String dni;

    public Usuario(String nombre, String apellido1, String apellido2, String fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }
}