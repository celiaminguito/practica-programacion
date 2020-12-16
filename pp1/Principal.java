package aplicacion;

import dominio.*;

public class Principal{
public static void main(Strin[] args){
Coche audi = new Coche("Audi", "1234 BCD");
Coche citroen = new Coche("Citroen", "5678 FGH");
Catalogo catalogo = new Catalogo();
catalogo.annadirCoche(audi);
catalogo.annadirCoche(citroen);
catalogo.volcarCoches();
Catalogo catalogo2 = new Catalogo();
catalogo2.cargarCoches();
System.out.println(catalogo2);


}

}
