
package empleado2;


public class EmpleadoPorHoras {
    //contructor 
    private int numerosDeHorasTrabajadas;
    private double valorHoraTrabajada;
    
    public double calcularSalario(){
        return numerosDeHorasTrabajadas * valorHoraTrabajada;
    }
    public int getNumerosDeHorasTrabajadas(){
        return numerosDeHorasTrabajadas;
    }
    public double getValorhoraTrabajada(){
        return valorHoraTrabajada;
    }

    public void setNumerosDeHorasTrabajadas(int numerosDeHorasTrabajadas) {
        this.numerosDeHorasTrabajadas = numerosDeHorasTrabajadas;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
        
    }
}
