

package empleado2;


public class EmpleadoPorComision extends Empleado{
        //constructor
    private double totalDeVentas;
    private double porcentajeComision;
    private double salario;
    public double calcularSalario(){
    return salario+ salario*0.10;
    }    
    public String totalDeVentas() {
        return nombre;
    }    
       public double getTotalDeVentas() {
            return totalDeVentas;
    }   
       public double getPorcentajeComision() {
            return porcentajeComision;
    }   
       public double getSalario() {
            return salario;
     }   

    public void setTotalDeVentas(double totalDeVentas) {
        this.totalDeVentas = totalDeVentas;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
}
