
package proyectotransversal.entidades;

import java.time.LocalDate;

public class Alumno {
    
    private int idAlumno;
    private String apellido;
    private String nombre;
    private LocalDate fechaNaci;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNaci, boolean activo) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNaci = fechaNaci;
        this.activo = activo;
    }

    public Alumno(String apellido, String nombre, LocalDate fechaNaci, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNaci = fechaNaci;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
    
    
}


