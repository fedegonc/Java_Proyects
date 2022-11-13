
package ejercicios_polimorfismo;

public class Perro extends Mamiferos {
    
    
    @Override
    public String som() {
        return "Guau guau";
    }


    @Override
    public String nome() {
        return "Perro";
    }
}

