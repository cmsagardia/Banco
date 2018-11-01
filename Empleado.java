package banco;

import java.util.Date;
import java.util.GregorianCalendar;
//importo el paquete util por el tipo de dato Date
/**
 *
 * @author Usuario
 */

//Puedo no crear un metodo construcotor, en ese caso utilizamos el contructor por defecto
//nos menejamos solo por Getters y Setters

public class Empleado implements Comparable{

//la interfaz Comaparable nos obliga a reescribir el metodo compareTo    
    
    //Declaro el constructor antes de declarar las variables y esto no afecta el funcionamiento del programa 
    public Empleado(String nom, double sue, int agno, int mes, int dia){
      id=idSgte;
      idSgte++;
      nombre=nom;
      sueldo=sue;
      //Importo del paquete java.util la clase GrregorianCalendar
      //Instacio la clase GregorianCalendar y utilizo el segundo constructor de la API de java
      seccion=" Administración, ";
      GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
      //Utilizo el metodo getTime() que recibe por HERENCIA la clase GregorianCalendar de la clase Calendar
      altaContrato=calendario.getTime();
    }
    
    //SOBRECARGA DE CONSTRUCTOR: Una clase puede tener varios métodos constuctores
    //los M.C. deben tener diferente numeo de argumentos
    public Empleado(String nom) {
    
        nombre=nom;
    
    }
    
    public Empleado(String nom, int sue){
        
        this(nom,sue,2000,1,1);
    }
    
    
    //getters
    public int getId(){
        
        return id;
    }
    
    public String getNombre(){
        
        return nombre;
    }
    
    public String getSeccion(){
        
        return seccion;
    }
    
    public double getSueldo(){
        
        return sueldo;
    }
    
    public Date getFechacontarto(){
        
        return altaContrato;
    }
    
    //metodo que aumenta el sueldo pasandole el porcentaje de auemnto respecto
    //del sueldo
    
    public void subeSueldo(double porcentaje){
        
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
    public String getDatos(){
                                                                     //utilizo a la clase para llamar el metodo static
    return "Id: "+id+" ,Nombre: "+nombre+"Seccion: "+seccion+" Fecha de alta: "+altaContrato+", "+Empleado.getIdSgte();

    }
    
    //METODO ESTATICO: Metodo propio de la clae, no de los objetos
    //no puede acceder a las variables de los abjetos , sí a las de clase
    //Devuelve el Id siguiente
    public static String getIdSgte(){
        
        return "El Id siguinte es = "+idSgte;
    }
    
    
    @Override
    //reecribo el metodo comparetTo dela intefaz Comparable
    public int compareTo(Object miObjeto){
        
        //casteo la variable de tipo "Objeto"
        Empleado otroEmpleado=(Empleado) miObjeto;
        //ordeno por "id" en este caso, puede ser por sueldo u otro atributo
        if(this.id<otroEmpleado.id){
            
            //Si, en comparacion con el actual el sueldo de mi empleado es menor devuelve -1
            return -1;
        }
        
        if(this.id>otroEmpleado.id){
            
            //O sino 1
            return 1;
        }
    
        //en cualquier otro caso 0 
        return 0;
    }
    
       //Declaro variables después del constructor. diferencia con la programaciÓn ESTRUCTURADA 
       //final no deja alterar la variable, en este caso lo hacemos a traves del constructor, 
       //se llama constante a una variable con prefijo final
       private final String nombre;
       private String seccion;
       private double sueldo;
       private Date altaContrato;
       //static es una variable de clase, la comparten todos los objetos. 
       //No llamamos a la variable a traves de un objetos sino a traves de la clase
       private  int id;
       private static int idSgte=1;
}
