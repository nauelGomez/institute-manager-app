/*
*To change this license header, choose License Headers in Project Properties.
*To change this template file, choose Tools | Templates
*and open the template in the editor.
*/

//package modelo.test;
//
//import excepciones.UsuarioBloqueadoException;
//import excepciones.UsuarioExistenteException;
//import java.io.*;
//import java.util.ArrayList;
//import modelo.cursos.Curso;
//import modelo.cursos.CursosFinalizados;
//import modelo.instituto.Instituto;
//import modelo.usuarios.Admin;
//import modelo.usuarios.Alumno;
//import modelo.usuarios.Docente;
//
//public class prueba {
//
//    public static void main(String[] args) {
//        
//        
//        ArrayList<Curso> cursos = new ArrayList<>();
//        ArrayList<Docente> listaDocentes = new ArrayList<>();
//        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
//        
//        Instituto miInstituto = new Instituto("Mi Instituto", cursos, listaDocentes, listaAlumnos);
//        
//        Docente docente = new Docente("123345","sadasd","apellido");
//        Docente docente2 = new Docente("556767","qwert","apellido2");
//        Docente docente3 = new Docente("797898","zxcvb","apellido3");
//        
//        
//        Admin admin = new Admin("admin","123",miInstituto);
//        
//        
//        //Agregamos docentes
//        
//        try
//        {
//            admin.registrarDocente(docente);
//            admin.registrarDocente(docente2);
//            admin.registrarDocente(docente3);
//        }
//        catch(UsuarioExistenteException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        
//        System.out.println(admin.getInstituto().getDocentes());
//        
//        
//        
//        Alumno alum = new Alumno("123123","aaaa","bbbb");
//        Alumno alum2 = new Alumno("58678678","aaaa","bbbb");
//        Alumno alum3 = new Alumno("152352","aaaa","bbbb");
//    
//        //Agregamos docentes
//        
//        try
//        {
//            admin.registrarAlumno(alum);
//            admin.registrarAlumno(alum2);
//            admin.registrarAlumno(alum3);
//        }
//        catch(UsuarioExistenteException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        
//        System.out.println(admin.getInstituto().getAlumnos());
//        
//        
//        //bloqueamos docente con dni 152352
//        
//        ArrayList<Docente> docentes = admin.getInstituto().getDocentes();
//        ArrayList<Alumno> alumnos = admin.getInstituto().getAlumnos();
//        
//        
//        for(Docente doc : docentes)
//        {
//            if(doc.getDni().equals("152352"))
//            {
//                try
//                {
//                    admin.bloquearUsuario(doc);
//                    System.out.println("El usuario" + doc + " se bloqueó correctamente");
//                }
//                catch(UsuarioBloqueadoException e)
//                {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
        



            // Crear instancias de las clases para realizar pruebas
//        Instituto instituto = new Instituto("NombreInstituto", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
//        Admin admin = new Admin("admin", "password", instituto);
//        Docente docente = new Docente("123", "John", "Doe");
//        Alumno alumno = new Alumno("456", "Alice", "Smith");
//        Curso curso = new Curso(docente, "propuesto", 30, new String[]{"requisito1", "requisito2"});
//        CursosFinalizados cursoFinalizado = new CursosFinalizados(curso, "aprobado");
//
//        try {
//            // Realizar pruebas con las clases y métodos
//            admin.registrarDocente(docente);
//            admin.registrarAlumno(alumno);
//            admin.bloquearUsuario(alumno); // Ejemplo de bloqueo de usuario
//            admin.sancionarUsuario(docente); // Ejemplo de sancionar usuario
//            docente.finalizarCurso(curso); // Ejemplo de cancelar curso
//
//            // Mostrar información para verificar funcionalidad
//            System.out.println("Alumnos bloqueados: " + instituto.obtenerAlumnosBloqueados());
//            System.out.println("Curso finalizado: " + cursoFinalizado.getCurso().getEstado());
//
//            // Agregar más pruebas según las funcionalidades que quieras probar
//        } catch (UsuarioExistenteException | UsuarioBloqueadoException e) {
//            e.printStackTrace();
//        }
//        
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("datos_serializados.dat"))) {
//            outputStream.writeObject(instituto);
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }
//        
//    }
//     
// }