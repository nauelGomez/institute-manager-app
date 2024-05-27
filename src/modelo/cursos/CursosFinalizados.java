package modelo.cursos;

import java.io.Serializable;
/**
 * La clase CursosFinalizados representa un curso que ha sido finalizado.
 * Implementa Serializable para permitir la serialización de objetos CursosFinalizados.
 */
public class CursosFinalizados implements Serializable {

    private Curso curso; // Curso finalizado
    private String estado; // Estado del curso finalizado

    /**
     * Constructor de la clase CursosFinalizados.
     * @param curso El curso finalizado
     * @param estado Estado del curso finalizado
     */
    public CursosFinalizados(Curso curso, String estado) {
        this.curso = curso;
        this.estado = estado;
    }

    /**
     * Obtiene el curso finalizado.
     * @return El curso finalizado
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Obtiene el estado del curso finalizado.
     * @return El estado del curso finalizado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el curso finalizado.
     * @param curso El curso a establecer como finalizado
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
