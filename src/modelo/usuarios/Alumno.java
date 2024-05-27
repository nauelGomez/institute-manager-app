/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

package modelo.usuarios;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.cursos.Curso;
import modelo.cursos.CursosFinalizados;
import modelo.instituto.Sancion;

/**
 * La clase Alumno representa a un usuario que es un estudiante.
 * Hereda de la clase Usuario e incluye métodos y atributos específicos para un alumno.
 */
public class Alumno extends Usuario{

    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Curso> cursosActivos;
    private ArrayList<CursosFinalizados> cursosFinalizados;
    protected final int id;
    private static int contador = 1;
    
    /**
     * Constructor de la clase Alumno.
     * @param dni DNI del alumno
     * @param nombre Nombre del alumno
     * @param apellido Apellido del alumno
     */
    public Alumno(String dni, String nombre, String apellido) {
        super(dni);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cursosActivos = new ArrayList<>(); // Inicialización del ArrayList cursosActivos
        this.cursosFinalizados = new ArrayList<>(); // Inicialización del ArrayList cursosFinalizados
        this.id = contador++;
    }
   
  /**
     * Método para inscribir al alumno en un curso.
     * @param curso Curso al que se inscribirá el alumno
     */
    public void inscripcionCurso(Curso curso){
    	this.cursosActivos.add(curso);
    	curso.agregarAlumno(this);
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public ArrayList<Curso> getCursos() {
		return cursosActivos;
	}
    public ArrayList<CursosFinalizados> getCursosFinalizados() {
		return cursosFinalizados;
	}
    public void setCursos(ArrayList<Curso> cursos) {
		this.cursosActivos = cursos;
	}
    public void setCursosFinalizados(ArrayList<CursosFinalizados> cursosFinalizados) {
		this.cursosFinalizados = cursosFinalizados;
	}
    
    public void agregarCurso(Curso curso)
    {
        this.cursosActivos.add(curso);
    }
    
    public void agregarCursoFinalizado(CursosFinalizados cursoFinalizado) {
        Iterator<Curso> iterator = this.cursosActivos.iterator();
        while (iterator.hasNext()) {
            Curso curso = iterator.next();
            if (cursoFinalizado.getCurso().equals(curso)) {
                iterator.remove();
            }
        }
        this.cursosFinalizados.add(cursoFinalizado);
    }
    
    public void actualizarEstadoCurso(Curso curso, String nuevoEstado) {
    // Iterar sobre los cursosActivos del alumno
    for (CursosFinalizados cursoAlumno : cursosFinalizados) {
        // Verificar si el curso coincide con el curso proporcionado
        if (cursoAlumno.getCurso().equals(curso)) {
            // Actualizar el estado del curso
            cursoAlumno.setEstado(nuevoEstado);
            break; // Romper el bucle una vez que se haya actualizado el estado
        }
    }
}

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "\n" +'}';
    }

    public int getId() {
        return id;
    }

    
    

}
