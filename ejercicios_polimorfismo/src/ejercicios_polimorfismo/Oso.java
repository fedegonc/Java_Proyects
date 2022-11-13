
package ejercicios_polimorfismo;

public class Oso extends Mamiferos{
    
    @Override
    public String som() {
        return "gruñido";
    }


    @Override
    public String nome() {
        return "Oso";
    }
}
