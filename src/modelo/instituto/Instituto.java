/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

package modelo.instituto;

import java.util.ArrayList;
import modelo.cursos.Curso;
import modelo.usuarios.Alumno;
import modelo.usuarios.Docente;
import java.io.Serializable;

/**
 * La clase Instituto representa una institución educativa que gestiona cursos, docentes y alumnos.
 * Implementa Serializable para permitir la serialización de objetos Instituto.
 */
public class Instituto implements Serializable {
    
    private String nombre; // Nombre del instituto
    private ArrayList<Curso> cursos; // Lista de cursos ofrecidos por el instituto
    private ArrayList<Docente> docentes; // Lista de docentes asociados al instituto
    private ArrayList<Alumno> alumnos; // Lista de alumnos matriculados en el instituto

    /**
     * Constructor de la clase Instituto.
     * @param nombre Nombre del instituto
     * @param cursos Lista de cursos del instituto
     * @param docentes Lista de docentes del instituto
     * @param alumnos Lista de alumnos del instituto
     */
    public Instituto(String nombre, ArrayList<Curso> cursos, ArrayList<Docente> docentes, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.cursos = cursos;
        this.docentes = docentes;
        this.alumnos = alumnos;
    }
    
    /**
     * Constructor de la clase Instituto que recibe solo el nombre.
     * Inicializa las listas de cursos, docentes y alumnos como listas vacías.
     * @param nombre Nombre del instituto
     */
    public Instituto(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.docentes = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }
   

    /**
     * Método para obtener la lista de alumnos bloqueados en el instituto.
     * @return ArrayList de alumnos bloqueados
     */

    public ArrayList<Alumno> obtenerAlumnosBloqueados() {
        ArrayList<Alumno> alumnosBloqueados = new ArrayList<>();

        for (Alumno alumno : alumnos) {
            if (alumno.getSancion() != null) {
                alumnosBloqueados.add(alumno);
            }
        }

        return alumnosBloqueados;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

   
    public ArrayList<Docente> getDocentes() {
        return docentes;
    }
      /**
     * Método para agregar un nuevo docente al instituto.
     * @param dni DNI del docente
     * @param nombre Nombre del docente
     * @param apellido Apellido del docente
     */
    public void agregarDocente(String dni, String nombre, String apellido) {
        
        this.docentes.add(new Docente(dni,nombre,apellido));
    }
    

    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(String dni, String nombre, String apellido) {
        this.alumnos.add(new Alumno(dni,nombre,apellido));
    }
    
    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
    /**
     * Método para eliminar un alumno del instituto.
     * @param alumno Docente a eliminar
     */
    public void eliminarAlumno(Alumno alumno) {
        this.alumnos.remove(alumno);
    }
    /**
     * Método para eliminar un docente del instituto.
     * @param docente Docente a eliminar
     */
    public void eliminarDocente(Docente docente) {
        this.docentes.remove(docente);
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }
    public void mostrarCursos()
    {
        for(Curso curso : cursos){
        System.out.println(curso.toString());
        }
    }
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    

    @Override
    public String toString() {
        return "Instituto{" + "nombre=" + nombre + ", cursos=" + cursos + ", docentes=" + docentes + ", alumnos=" + alumnos + '}';
    }


}

