
package ejercicios_polimorfismo;

public class bicicletaElectrica extends Vehiculo {
    
    
    @Override
    public void enceder() {
        prenderPantalla();
        energizarMotor();
    }
    
    
    public void prenderPantalla(){
        System.out.println("Pantalla encendida");
    }
    public void energizarMotor(){
        System.out.println("Motor Listo");
    }  
    
}
