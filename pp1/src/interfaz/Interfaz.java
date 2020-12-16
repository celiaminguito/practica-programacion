package interfaz;

import dominio.*;

public class Interfaz{
    public static void mostrarAyuda(){
        System.out.println("Pendiente de programar."); 
    }
    public static void ejecutar(String[] parametros){
        try{
            String instruccion = parametros[0];
            Libreta libreta = new Libreta();
            switch(instruccion){
                case "add":
                    libreta.annadirContacto(new Contacto(parametros[1], parametros[2]));
                    System.out.println("Contacto añadido");
                    break;
                case "list":
                    System.out.println(libreta);
                    break;
                case "--help": case "-h":
                    mostrarAyuda();
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    mostrarAyuda();    

            }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Opción incorrecta");
            mostrarAyuda(); 
        } 
    }
}
