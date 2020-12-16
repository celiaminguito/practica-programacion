public class Catalogo{
private ArrayList<Coche> coleccionCoches = new ArrayList<>();
private String nombreFichero = "coches.txt";

public void annadirCoche(Coche coche){
coleccionCoches.add(coche);
}

public void volvarCoches(){
try{
FileWriter fw = new FileWriter(nombreFichero);
for(Coche coche : coleccionCoches){
fw.write(coche getMarca() + "" + coche.getMatricula() + "\n");
}
fw.close();
}catch(IOException e){
System.out.println("Ha habido un problema al intentar escribir en el fichero" + nombreFichero);
}
}

public void cargarCoches(){
try{
Scanner sc = new Scanner(new File(nombreFichero));
while(sc.hasNext()){
coleccionCoches.add(new Coche(sc.next(), sc.next()));
}
}catch(FileNotFoundException e){
System.out.println("Ha habido un problema al intentar leer en el fichero" + nombreFichero);
}
}
@Override
public String toString(){
StringBuilder sb = new StringBuilder();
for(Coche coche : coleccionCoches) sb.appenes(coche + "\n");
return sb.toString();
}
