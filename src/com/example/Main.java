package com.example;

public class Main {

    public static void main(String[] args) {
        //REGISTRAMOS UN USUARIO CORRECTAMENTE
        Usuarios usuarios = new Usuarios();
        if(usuarios.registrar("mail@mail.com", "Contrasena", "Jose Fernandez"))
            System.out.println("Registrado correctamente");
        else
            System.out.println("Correo electrónico repetido.");

        //REGISTRAMOS OTRO CON EL CORREO ELECTRÓNICO REPETIDO
        if(usuarios.registrar("mail@mail.com", "Contrasena", "Jose Fernandez"))
            System.out.println("Registrado correctamente");
        else
            System.out.println("Correo electrónico repetido.");

        //CREAMOS DOS ALUMNOS REGISTRADOS POR EL MISMO USUARIO
        Alumno alumno = new Alumno("usuario1@mail.com", "Antonio Garcia", "Barcelona",
                "España", "685965874", "Remoto", true, "foto.jpg", "cv.pdf",
                usuarios.usuarios.get(0));

        Alumno alumno2 = new Alumno("usuario2@mail.com", "Javier Martinez", "Madrid",
                "España", "632541569", "Presencial", false, "foto.jpg", "cv.pdf",
                usuarios.usuarios.get(0));

        //OBTENEMOS EL USUARIO QUE CREÓ EL ALUMNO2 (ELIMINAMOS LA CONTRASEÑA DEL TOSTRING POR SEGURIDAD)
        System.out.println(alumno2.getUsuario());

        //CREAMOS LENGUAJES
        Etiqueta etiqueta = new Etiqueta("Java");
        Etiqueta etiqueta1 = new Etiqueta("HTML");
        Etiqueta etiqueta2 = new Etiqueta("C++");
        Etiqueta etiqueta3 = new Etiqueta("Phyton");

        //AÑADIMOS CADA ALUMNO EL LENGUAJE QUE CONOCE EN UNA NUEVA CLASE
        AlumnosEtiquetas ae = new AlumnosEtiquetas();
        ae.addAlumnoEtiqueta(alumno.getCorreoElectronico(), etiqueta.getLenguaje());
        ae.addAlumnoEtiqueta(alumno.getCorreoElectronico(), etiqueta1.getLenguaje());
        ae.addAlumnoEtiqueta(alumno2.getCorreoElectronico(), etiqueta2.getLenguaje());
        ae.addAlumnoEtiqueta(alumno2.getCorreoElectronico(), etiqueta3.getLenguaje());

        //LISTAMOS CADA ALUMNO CON SU LENGUAJE
        ae.listarAlumnoEtiqueta();

        //LISTAMOS LOS ALUMNOS QUE CONOCEN X LENGUAJE
        ae.listarAlumnosPorEtiqueta("HTML");

        //LISTAMOS LOS LENGUAJES QUE CONOCE X ALUMNO
        ae.listarEtiquetaPorAlumno("usuario2@mail.com");

    }
}
