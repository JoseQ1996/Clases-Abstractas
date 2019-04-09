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
public abstract class Empleado {
    
    private int codigo;
    private String nombre;
    private String cedula;
    private Date fechaContratacion;
    private double salario;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + '}';
    }
    
    public abstract double calcularSalarioFinal();
        
    
}
