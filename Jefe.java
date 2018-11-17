/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Usuario
 */
public class Jefe extends Empleado implements Jefess{
    
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
    
    @Override
    //redefino el metodo getDescicion de la intefaz Jefess
    public String getDesiciones(String desicion){
        
        return "Un miembro de la direccion ha tomado la desicion de : "+desicion;
    }
    
    @Override
    public double getBono(double gratificacion){
        
        double prima =2000;
        
        //Trabajadores es la intrerfaz
        return Trabajadores.bonus_base+prima+gratificacion;
        
    }
    
    private double incentivo;
    
}
