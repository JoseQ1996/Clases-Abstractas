/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.ups.edu.ec.principal;

import est.ups.edu.ec.clases.Empleado;
import est.ups.edu.ec.clases.EmpleadoAsalariado;
import est.ups.edu.ec.clases.EmpleadoPorComision;
import est.ups.edu.ec.clases.EmpleadoPorHoras;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author José Quinde
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        List<Empleado> lista = new ArrayList<>();
        
        
        GregorianCalendar fechaContratacionPepito = new GregorianCalendar(2010, 0, 1);
        EmpleadoAsalariado empleadoPepito = new EmpleadoAsalariado(1,  "Pepito Perez","0101010101", fechaContratacionPepito.getTime(), 500);
        double salarioFinalPepito = empleadoPepito.calcularSalarioFinal();
        System.out.println("Salario final Pepito: " + salarioFinalPepito);
        
        GregorianCalendar fechaContratacionJuanito = new GregorianCalendar(2015, 0, 1);
        EmpleadoPorHoras empleadoJuanito = new EmpleadoPorHoras(2, "Juanito Perez", "0202022020", fechaContratacionJuanito.getTime(), 350);
        empleadoJuanito.setCostoHoraExtra(10);
        empleadoJuanito.setNumeroHorasExtra(15);
        double salarioFinalJuanito = empleadoJuanito.calcularSalarioFinal();
        System.out.println("Salario final Juanito: " + salarioFinalJuanito);
        
        GregorianCalendar fechaContratacionMaria = new GregorianCalendar(2017, 0, 1);
        EmpleadoPorComision empleadaMaria = new EmpleadoPorComision(3, "María Perez", "0303030303", fechaContratacionMaria.getTime(), 450);
        empleadaMaria.setVentasMensuales(1200);
        double salarioFinalMaria = empleadaMaria.calcularSalarioFinal();
        System.out.println("Salario final Maria: " + salarioFinalMaria);
        
        
        lista.add(empleadoPepito);
        lista.add(empleadoJuanito);
        lista.add(empleadaMaria);
        
        for (Empleado empleado : lista) {
                if (empleado instanceof EmpleadoAsalariado){
                    EmpleadoAsalariado temp= (EmpleadoAsalariado) empleado;
                    System.out.println(temp);
                }
                else if (empleado instanceof EmpleadoPorComision){
                    EmpleadoPorComision temp= (EmpleadoPorComision) empleado;
                    System.out.println(temp);
                }
                else if (empleado instanceof EmpleadoPorHoras){
                    EmpleadoPorHoras temp= (EmpleadoPorHoras) empleado;
                    System.out.println(temp);
                }
                
            }
        
                
                
    }
    
}
