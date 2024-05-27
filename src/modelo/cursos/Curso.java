/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

package modelo.cursos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import modelo.usuarios.Alumno;
import modelo.usuarios.Docente;

/**
 * La clase Curso representa un curso dentro de la institución educativa.
 * Implementa Serializable para permitir la serialización de objetos Curso.
 */
public class Curso implements Serializable{
    
    private ArrayList<Alumno> alumnos; // Lista de alumnos inscritos en el curso
    private Docente docente; // Docente a cargo del curso
    private String estado; // Estado actual del curso
    private ArrayList<Curso> requisitos; // Lista de cursos requisitos para este curso
    private int topeAlumnos; // Límite máximo de alumnos que pueden inscribirse
    private final int id; // Identificador único del curso
    private static int contador = 1; // Contador para generar identificadores únicos
    private String descripcion; // Descripción del curso
    private static ArrayList<Integer> idsRegistrados = new ArrayList<>();
    /**
     * Constructor de la clase Curso.
     * @param docente Docente a cargo del curso
     * @param estado Estado actual del curso
     * @param topeAlumnos Límite máximo de alumnos para el curso
     * @param requisitos Lista de cursos requisitos para este curso
     */

     public Curso(Docente docente, String estado, int topeAlumnos, ArrayList<Curso> requisitos) {
        this.docente = docente;
        this.estado = estado;
        this.topeAlumnos = topeAlumnos;
        int nuevoID = generarIDUnico(); // Generar un ID único
        this.id = nuevoID;
        this.alumnos = new ArrayList<Alumno>();
        if (requisitos != null) {
            this.requisitos = requisitos;
        } else {
            this.requisitos = new ArrayList<>();
        }
    }
     
     public Curso(int id, Docente docente, String estado, int topeAlumnos, ArrayList<Curso> requisitos) {
    this.id = id;
    this.docente = docente;
    this.estado = estado;
    this.topeAlumnos = topeAlumnos;
    this.alumnos = new ArrayList<Alumno>();

    if (requisitos != null) {
        this.requisitos = requisitos;
    } else {
        this.requisitos = new ArrayList<>();
    }
}

    // Método para generar un ID único que no se haya registrado previamente
    private int generarIDUnico() {
        int nuevoID = contador++;
        while (idsRegistrados.contains(nuevoID)) {
            nuevoID = contador++;
        }
        idsRegistrados.add(nuevoID);
        return nuevoID;
    }
    /**
     * Método para comprobar si todas las notas del curso han sido asignadas a los alumnos.
     * @return true si todas las notas han sido asignadas, false si hay alumnos sin notas asignadas
     */
    public boolean comprobarNotas() {
    for (Alumno alumno : this.alumnos) {
        boolean encontrado = false;
        ArrayList<CursosFinalizados> cursosFinalizados = alumno.getCursosFinalizados();
        
        for (CursosFinalizados cursoFinalizado : cursosFinalizados) {
            if (cursoFinalizado.getCurso().getId() == this.id) {
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            return false; // Si un alumno no tiene el curso finalizado, retorna false
        }
    }
    return true; // Si todos los alumnos tienen el curso finalizado, retorna true
}
    /**
     * Método para agregar un alumno al curso.
     * @param alumno Alumno a inscribir en el curso
     */
    public void agregarAlumno(Alumno alumno)
    {
        this.alumnos.add(alumno);
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTopeAlumnos(int topeAlumnos) {
        this.topeAlumnos = topeAlumnos;
    }
    
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void vaciarAlumnos() {
        // Iteramos en reversa para evitar problemas con la eliminación de elementos
        for (int i = this.alumnos.size() - 1; i >= 0; i--) {
            this.alumnos.remove(i);
        }
    }  
    public Docente getDocente() {
        return docente;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(ArrayList<Curso> requisitos) {
       
        this.requisitos = requisitos;
        
    }

    

    public int getTopeAlumnos() {
        return topeAlumnos;
    }

    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "ClaseEjemplo{" +
                "alumnos=" + alumnos +
                ", docente=" + docente +
                ", estado='" + estado + '\'' +
                ", requisitos=" + requisitos +
                ", topeAlumnos=" + topeAlumnos +
                ", id=" + id +
                '}';
    }
        
}
