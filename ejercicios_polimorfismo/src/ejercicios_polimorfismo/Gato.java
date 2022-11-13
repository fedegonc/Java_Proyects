package ejercicios_polimorfismo;

public class Gato extends Mamiferos {
    
    
    @Override
    public String som() {
        return "miau";
    }


    @Override
    public String nome() {
        return "Gato";
    }
}

