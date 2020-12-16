package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Libreta{
    private ArrayList<Contacto> coleccionContactos = new ArrayList<>();
    private String nombreFichero = "contactos.txt";

    public Libreta(){
        cargarContactos();
    }

    public void annadirContacto(Contacto contacto){
        coleccionContactos.add(contacto);
        volcarContactos();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Contacto contacto : coleccionContactos) sb.append(contacto + "\n");
        return sb.toString();
    }

    private void volcarContactos(){
        try{
            FileWriter fw = new FileWriter(nombreFichero);
            for(Contacto contacto : coleccionContactos){
                fw.write(contacto.getNombre() + " " + 
                        contacto.getNumeroTelefono()  + "\n");
            }
            fw.close();
        }catch(IOException e){
            System.out.println("Ha habido un problema al intentar escribir en el fichero " + nombreFichero); 
        }
    }

    private void cargarContactos(){
        try{
            File fichero = new File(nombreFichero);
            if (fichero.createNewFile()) System.out.println("Se ha creado el fichero " + nombreFichero); 
            Scanner sc = new Scanner(fichero);
            while(sc.hasNext()){
                coleccionContactos.add(new Contacto(sc.next(), sc.next()));
            }
        }catch(IOException e){
            System.out.println("Ha habido un problema al intentar leer en el fichero " + nombreFichero);
            System.out.println(e); 
        }
    }
}
