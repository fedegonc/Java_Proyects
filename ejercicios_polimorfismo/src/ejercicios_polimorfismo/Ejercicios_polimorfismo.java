package ejercicios_polimorfismo;

public class Ejercicios_polimorfismo {

    public static void main(String[] args) {
       
        llamar(new Perro());
        llamar(new Gato());
        llamar(new Oso());
        llamar(new Canguro());
        llamar(new Papagayo());
        
        
    }
   
    public static void llamar(Mamiferos perro){
        System.out.println(perro.nome() + " " + perro.som());
        
        
    }
    
    
    
}
