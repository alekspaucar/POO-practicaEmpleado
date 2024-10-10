
package empleado2;

import java.util.Date;
//esto de aqui es un construcctor 
public class Empleado {
    String cedula;
    String nombre;
    String apellido;
    Date fechaNacimiento ;
    String telefono;
    String direccion;
    String cargo;
    double salarioBase; 

       public double calcularSalario(){    
        return 0.00;
}
       
    public Empleado(){
    
    }
    
    public Empleado(String cedula, String nombre ,String apellido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }  

    public String getCedula() {
        return cedula; 
    }
    public void setCedula(String cedula) {
        this.cedula=cedula;
    }
    public String getNombre() {
        return nombre;
        
    }
       public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getApellido() {
        return apellido;
    }
       public void setApellido(String apellido) {
        this.apellido=apellido;                                                  //si no le pongo el void tengo que poner un tipo de dato 
    }
    public String getTelefono() {
        return telefono;
        
    }      
        public void setTelefono(String telefono) {
        this.telefono=telefono;                                                  //si no le pongo el void tengo que poner un tipo de dato 
    }
    public String getDireccion() {
        return direccion;
        
    }
        public void setDireccion(String direccion) {
        this.direccion=direccion;                                                  //si no le pongo el void tengo que poner un tipo de dato 
    }
    public String getCargo() {
        return cargo;
        
    }
        public void setCargo(String cargo) {
        this.cargo=cargo;                                                  //si no le pongo el void tengo que poner un tipo de dato 
    }
   
@Override
    public String toString(){
        return "["+cedula+","+nombre+","+apellido+"]";

        }

        
}


 


