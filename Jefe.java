
package Banco;

/**
 *
 * @author Usuario
 */
public class Jefe extends Empleado {
    
    public Jefe(String nom, double sue, int agno, int mes, int dia){
        
        super(nom, sue, agno, mes, dia);
    }
    
    public void incentivo(double b){
        
        incentivo=b;
    }
    
    public double getSueldo(){
        
        double sueldoJefe=super.getSueldo();
        
        return sueldoJefe + incentivo;
    }
    
    private double incentivo;
    
}
