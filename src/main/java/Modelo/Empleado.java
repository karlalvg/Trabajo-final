/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;


/**
 *
 * @author karlylvg
 */
public class Empleado implements Serializable{
    private String codigoEmpleado;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String ciudadNatal;
    private String tituloUniversitario;
    private String horasMes;
    private float costoHora;
    private Departamento departamento;

    public Empleado(String codigoEmpleado, String nombre, LocalDate fechaNacimiento, 
            String ciudadNatal, String tituloUniversitario, String horasMes, 
            float costoHora,Departamento departamento) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadNatal= ciudadNatal;
        this.tituloUniversitario = tituloUniversitario;
        this.horasMes = horasMes;
        this.costoHora = costoHora;
        this.departamento = departamento;
    }

    public String getcodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setcodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getciudadNatal() {
        return ciudadNatal;
    }

    public void setciudadNatal(String ciudadNatal) {
        this.ciudadNatal = ciudadNatal;
    }

    public String gettituloUniversitario() {
        return tituloUniversitario;
    }

    public void settituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public String gethorasMes() {
        return horasMes;
    }

    public void sethorasMes(String horasMes) {
        this.horasMes = horasMes;
    }

    public float getcostoHora() {
        return costoHora;
    }

    public void setcostoHora(float costoHora) {
        this.costoHora = costoHora;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    

    @Override
    public String toString() {
        if(this.departamento == null){
            return "Empleado{" + "codigoEmpleado = " + codigoEmpleado + ", nombre = " 
                    + nombre + ", fechaNacimiento = " + fechaNacimiento 
                    + ", ciudadNatal = " + ciudadNatal + ", tituloUniversitario = " 
                    + tituloUniversitario+ ",\n horasMes=" + horasMes + ", costoHora=" + costoHora 
                    + ", departamento = Sin Asignar ";
        }
        return "Empleado{" + "codigoEmpleado = " + codigoEmpleado+ ", nombre = " 
                + nombre + ", fechaNacimiento = " + fechaNacimiento + 
                ", ciudadNatal= " + ciudadNatal+ ", tituloUniversitario = " 
                + tituloUniversitario + ",\n horasMes = " + horasMes + ", costoHora = " 
                + costoHora +  "departamento = " + departamento.getNombre()+" ";
    }
    
    public int calcularEdad(int anioActual){
        int edad = anioActual - this.fechaNacimiento.getYear();
        return edad;
    }
    
    
    public void asignarDepartamento ( Departamento departamento) {
        this.departamento = departamento;
    }
    
    public String mostrarInformacion(int anioActual){
        String info = toString() + "\nedad actual empleado: "+calcularEdad(anioActual)+" años }";
        return info;
    }
    
    
    
}
