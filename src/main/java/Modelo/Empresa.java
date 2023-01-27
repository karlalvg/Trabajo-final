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
public class Empresa implements Serializable {

    private int codigo;
    private String nombre;
    private String duenio;
    private String ciudad;
    private String direccion; //(matriz principal)
    private LocalDate fechaCreacion;

    public Empresa(int codigo, String nombre, String duenio,
            String ciudad, String direccion, LocalDate fechaCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duenio = duenio;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
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

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad= ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Empresa{" + "codigo = " + codigo + ", nombre = "
                + nombre + ", duenio = " + duenio + ", ciudad = "
                + ciudad + ",\n direccion = " + direccion + ", "
                + "fechaFundacion = " + fechaCreacion;
    }

    public int mostrarAntiguedadEmpresa(int anioActual) {

        int anioFundacion = this.fechaCreacion.getYear();
        int antiguedad = anioActual - anioFundacion;
        return antiguedad;
    }

    public String mostrarInformacion(int anioActual) {
        String infoEmpresa = this.toString() + ", Antiguedad: "
                + mostrarAntiguedadEmpresa(anioActual) + " años }";
        return infoEmpresa;
    }
}
