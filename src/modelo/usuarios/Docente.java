/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

package modelo.usuarios;

import excepciones.CursoVacioException;
import java.util.ArrayList;
import modelo.cursos.Curso;
import modelo.cursos.CursosFinalizados;
import modelo.instituto.Instituto;
import modelo.instituto.Sancion;


/**
 * La clase Docente representa a un profesor que puede proponer y finalizar cursos.
 * como tambien asignar notas.
 * Extiende la clase Usuario y se implementa como Clonable.
 */
public class Docente extends Usuario implements Cloneable {

    private String nombre; // Nombre del docente
    private String apellido; // Apellido del docente
    private String dni; // DNI del docente
    protected final int id; // Identificador único del docente
    private static int contador = 1; // Contador para asignar identificadores únicos

    /**
       Constructor de la clase Docente.
     *
     * @param dni      El DNI del docente.
     * @param nombre   El nombre del docente.
     * @param apellido El apellido del docente.
     */
    public Docente(String dni, String nombre, String apellido) {
        super(dni); // Llama al constructor de Usuario pasando el DNI como nombre de usuario
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id = contador++;
    }

    /**
     * Habilita un curso si está finalizado.
     *
     * @param curso El curso a habilitar.
     */
    public void habilitarCurso(Curso curso) {
        if (curso.getEstado().equals("finalizado")) {
            curso.setEstado("habilitado");
            if(curso.getAlumnos().size() > 0)
            {
                curso.vaciarAlumnos();
            }
        }
    }
    
    
    /**
     * Propone un nuevo curso.
     *
     * @param requisitosPrevios Lista de cursos previos necesarios.
     * @param topeAlumnos       Límite de alumnos para el curso.
     * @param descripcion       Descripción del curso.
     * @return El nuevo curso propuesto.
     * @throws CloneNotSupportedException Si la clonación del docente falla.
     */
    public Curso proponerCurso(ArrayList<Curso> requisitosPrevios, int topeAlumnos, String descripcion, Instituto instituto) throws CloneNotSupportedException {
    // Obtener el último ID de los cursos en el instituto
    int ultimoId = obtenerUltimoIdCursos(instituto);

    // Incrementar el ID en 1 para el nuevo curso
    int nuevoId = ultimoId + 1;

    // Clonar el docente actual
    Docente docenteClonado = this.clone();

    // Crear el nuevo curso con el ID incrementado
    Curso nuevoCurso = new Curso(nuevoId, docenteClonado, "propuesto", topeAlumnos, requisitosPrevios);
    nuevoCurso.setDescripcion(descripcion);

    return nuevoCurso;
}
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    private int obtenerUltimoIdCursos(Instituto instituto) {
        int ultimoId = 0;

        // Recorrer los cursos en el instituto para encontrar el último ID
        for (Curso curso : instituto.getCursos()) {
            if (curso.getId() > ultimoId) {
                ultimoId = curso.getId();
            }
        }

        return ultimoId;
    }

    /**
     * Finaliza un curso.
     *
     * @param curso El curso a finalizar.
     * si no asigna todas las notas no puede finalizarlo
     * que es reponsabilidad del controlador.
     */
    public void finalizarCurso(Curso curso){
        
        if(!curso.getAlumnos().isEmpty())
        {
            curso.setEstado("finalizado");
        }
    }
    
        public void cerrarCurso(Curso curso) {
        curso.setEstado("cerrado");
    }
    /**
     * Asigna una nota a un alumno en un curso.
     *
     * @param alum   El alumno al que se le asigna la nota.
     * @param curso  El curso al que pertenece la nota.
     * @param estado El estado o nota asignada.
     */
    public void asignarNota(Alumno alum, Curso curso, String estado) {
        CursosFinalizados cf = new CursosFinalizados(curso, estado);
        alum.agregarCursoFinalizado(cf);
    }

    /**
     * Realiza una clonación superficial del objeto Docente.
     *
     * @return Una copia superficial del docente.
     */
    @Override
    public Docente clone() {
        try {
            return (Docente) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Esto no debería ocurrir, ya que Docente implementa Cloneable
        }
    }

    /**
     * Devuelve una representación en cadena del objeto Docente.
     *
     * @return Una cadena que representa al docente.
     */
    @Override
    public String toString() {
        return this.nombre +" "+ this.apellido;
    }

    // Getters para los atributos del docente

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getId() {
        return id;
    }
    
 
}
	
    
    

