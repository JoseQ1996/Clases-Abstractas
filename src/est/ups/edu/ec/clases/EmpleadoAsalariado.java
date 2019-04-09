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
public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        super(codigo, nombre, cedula, fechaContratacion, salario);
    }
     /**
     * Método que permite calcular el salario final del empleado asalariado
     * 
     * El método tiene la siguiente especificación: 
     *  si el empleado tiene más de 5 años trabajando en la empresa
     *  a su salario base se le aumenta 50 dolares por cada año extra
     *  caso contrario su salario final es su salario base
     * 
     * @return salario final del empleado
     */  
    
    @Override
    public double calcularSalarioFinal() {
       /*
         */
        Date fechaFin = new Date();
        Date fechaInicio = super.getFechaContratacion();
        long tiempoMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
        long tiempoTranscurridoEnAnios = (tiempoMilisegundos / (3600 * 24 * 1000)) / 365;
        System.out.println("Tiempo transcurrido " + tiempoTranscurridoEnAnios);

        if (tiempoTranscurridoEnAnios >= 5) {
            int aniosComision = (int) (tiempoTranscurridoEnAnios - 5);
            if (aniosComision > 1) {
                return super.getSalario() + (aniosComision * 50);
            } else {
                return super.getSalario() + 50;
            }
        } else {
            return super.getSalario();
        }

    }
     
    } 
    

