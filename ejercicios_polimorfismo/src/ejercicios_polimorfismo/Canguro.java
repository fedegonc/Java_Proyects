package ejercicios_polimorfismo;

public class Canguro extends Mamiferos {
    
    
    @Override
    public String som() {
        return "salta";
    }


    @Override
    public String nome() {
        return "Canguro";
    }
}

