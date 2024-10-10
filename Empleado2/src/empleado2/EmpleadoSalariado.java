
package empleado2;

public class EmpleadoSalariado extends Empleado{
        //constructor
   private int aniosAntiguedad=15;
   private int salario=500;
   private int cargasFamiliares=5;
@Override

public double calcularSalario() {
    double pagoAntiguedad = 0.00;
    double pagoCargasFamiliares = 0.00;

    if (aniosAntiguedad >= 2 && aniosAntiguedad <= 5) {
        pagoAntiguedad = 80;
    } else if (aniosAntiguedad >= 6 && aniosAntiguedad <= 8) {
        pagoAntiguedad = 120;
    } else if (aniosAntiguedad >= 9 && aniosAntiguedad <= 14) {
        pagoAntiguedad = 130;
    } else if (aniosAntiguedad >= 15) {
        pagoAntiguedad = 200;
    }

    if (cargasFamiliares == 1) {
        pagoCargasFamiliares = 30;
    } else if (cargasFamiliares == 2) {
        pagoCargasFamiliares = 70;
    } else if (cargasFamiliares >= 3) {
        pagoCargasFamiliares = 100;
    }

    return (salario + pagoAntiguedad + pagoCargasFamiliares);
    }
    public double getCalcularSalario(double valorExtra){
        return this.calcularSalario()+valorExtra;

    }
    public int getAniosAntiguedad() {
        return aniosAntiguedad;
        
    }
    public int getSalario() {
        return salario;
        
    }    
    public int getCargasFamiliares() {
        return salario; 
    } 
    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setCargasFamiliares(int cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }


}