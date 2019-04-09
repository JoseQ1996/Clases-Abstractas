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
public class EmpleadoPorHoras extends Empleado{

   private int numeroHorasExtra;
   private double costoHoraExtra;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int numeroHorasExtra, double costoHoraExtra, int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        super(codigo, nombre, cedula, fechaContratacion, salario);
        this.numeroHorasExtra = numeroHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }

    public int getNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void setNumeroHorasExtra(int numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    public double getCostoHoraExtra() {
        return costoHoraExtra;
    }

    public void setCostoHoraExtra(double costoHoraExtra) {
        this.costoHoraExtra = costoHoraExtra;
    }

    @Override
    public double calcularSalarioFinal() {
         return super.getSalario() + (numeroHorasExtra*costoHoraExtra);
    }
      
    
    
}
