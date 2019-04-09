/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.clases;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class EmpleadoPorComision extends Empleado {
    
    private double ventasMensuales;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        super(codigo, nombre, cedula, fechaContratacion, salario);
    }

    public EmpleadoPorComision(double ventasMensuales, int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        super(codigo, nombre, cedula, fechaContratacion, salario);
        this.ventasMensuales = ventasMensuales;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }
    /*
     * Método que permite calcular el salario final del empleado asalariado
     * 
     *Si el empleado realizo ventas superiores entre $500 y $1000 
     *se le otorga una comisioin del 10% sobre las ventas mensuales.
      *
      *Si el empleado realizo ventas superiores entre $1000 y $5000 
      *se le otorga una comisioin del 15% sobre las ventas mensuales.
      */

    @Override
    public double calcularSalarioFinal() {
        if (ventasMensuales>=500 && ventasMensuales<=1000){
            return super.getSalario()+(0.10*ventasMensuales);
        }
        else if (ventasMensuales>1000 && ventasMensuales<=5000){
            return super.getSalario()+(0.15*ventasMensuales);
        }
        else if (ventasMensuales>5000){
        return super.getSalario()+(0.20*ventasMensuales);
    }
        else{
     return super.getSalario();
        }
    }
}
