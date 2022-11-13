
package ejercicios_polimorfismo;


public class Avion extends Vehiculo {

      @Override
    public void enceder() {
        calefacionarCarburador();
        regularMezclaDeCombustible();
        inyectarCombustible();
        masPasos();
    }
    
    public void calefacionarCarburador() {
        System.out.println("Carburador listo");
    }

    public void regularMezclaDeCombustible() {
        System.out.println("Mezcla regulada");
    }

    public void inyectarCombustible() {
        System.out.println("Combustible inyectado");
    }

    public void masPasos() {
        System.out.println("Muchos pasos mas...");
    }

  
}
