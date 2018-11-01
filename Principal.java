package Banco;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Banco {

    public static void main(String[] args) {

        /*Empleado empleado1=new Empleado("Matias Sagardía",20000,10,3,2018);
        Empleado empleado2=new Empleado("Jose Lopez",35000,5,3,2015);
        Empleado empleado3=new Empleado("Cristina Sosa",48000,20,9,2000);
        
        empleado1.subeSueldo(10);
        empleado2.subeSueldo(8);
        empleado3.subeSueldo(13);
    
        System.out.println("Datos: \n"+empleado1.getDatos()+" "+empleado1.getSueldo());
        System.out.println(empleado2.getDatos());
        System.out.println(empleado3.getDatos());
      */
        
       Jefe jefeRH=new Jefe("Armando", 44000,2,10,2019);
       
       jefeRH.incentivo(2570);
        
       Empleado[] misEmpleados=new Empleado[8];
        
       misEmpleados[0]=new Empleado("Chagy, ",35000,5,3,2015);
       misEmpleados[1]=new Empleado("Perk, ",28000,4,1,2000);
       misEmpleados[2]=new Empleado("Wo, ",22000,8,9,1999);
       misEmpleados[3]=new Empleado("Khoo, ",33000,1,1,2015);
       misEmpleados[4]=new Empleado("jose Maria, ");
       misEmpleados[5]=new Empleado("Alan Aguerre, ",15000);
       //Podemos almacenar un objeto de la subclase cuando el programa 
       //espere un objeto de la superclase
       misEmpleados[6]=jefeRH;//Polimorfirmo, principio de sustitucion "es un"
       misEmpleados[7]=new Jefe("Rodolfo",46762,6,7,2011);
       
       //Casting o casteo de un objeto
       Jefe jefeFinanzas=(Jefe) misEmpleados[7];
       
       jefeFinanzas.incentivo(99862);
       
       //for each para subir el sueldo de los empleados
       for(Empleado e: misEmpleados){
           
           e.subeSueldo(8);
       }
       
       //Utilizacion de la clase ARRAYS la cual utiliza el metodo sort el cual 
       //implementa la interfaz comparable por lo que debo reescribir el metodo
       //compareTo de la interfaz en la clase "Empleado"
       
       Arrays.sort(misEmpleados);
       
       //for para mostrar los datos y el sueldo con incremento
       for(int i=0;i<misEmpleados.length;i++){
           
           System.out.println(misEmpleados[i].getDatos()+" "+misEmpleados[i].getSueldo());
       }
       
        
    }  
    
}
