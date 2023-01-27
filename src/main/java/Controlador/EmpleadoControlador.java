/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Departamento;
import Modelo.Empleado;
import Servicio.DepartamentoServicio;
import Servicio.EmpleadoServicio;
import java.time.LocalDate;
import java.util.List;



/**
 *
 * @author karlylvg
 */
public class EmpleadoControlador {
    private final EmpleadoServicio empleadoServicio = new EmpleadoServicio();
    public final DepartamentoServicio departamentoServicio = new DepartamentoServicio();
    
    public Empleado crearEmpleado(String codigoEmpleado, String nombre, int anioNacimiento, 
            int mesNacimiento, int diaNacimiento, 
            String ciudadNatal, String tituloUniversitario, String horasMes, float costoHora, 
            Departamento departamento){
        
          var fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        // fecha de entrada = fecha del sistema
        var fechaEntrada = LocalDate.now();
        
        if (codigoEmpleado.equals("")) {
            throw new NullPointerException("Debe ingresar codigo");
        }
        if (nombre.equals("")){
            throw new NullPointerException("Debe ingresar un nombre");
        }
        if (horasMes.equals("")){
            throw new NullPointerException("Debe ingresar horas");
        }
        
        if (!isAdult(fechaNacimiento)) {
            throw new RuntimeException("Empleado debe ser mayor a 18 años");
        }
        var nuevoEmpleado =  new Empleado(codigoEmpleado,nombre,
                fechaNacimiento,ciudadNatal,tituloUniversitario,horasMes,costoHora,departamento);
        return empleadoServicio.crearEmpleado(nuevoEmpleado);  
        
        
        
                
    }
    
    public List<Empleado> listarEmpleados(){
        return empleadoServicio.listarEmpleados();
    }
    
    
    
    public void asignarDepartamento(String codigoEmpleado, Departamento departamento){
        empleadoServicio.asignarDepartamento(codigoEmpleado, departamento);
    }
     
    
    public Empleado getEmpleadoByCodigo(String codigoEmpleado){
        return empleadoServicio.getEmpleadoByCodigo(codigoEmpleado);
    }
    
    public void actualizarEmpleado(String codigoEmpleado, Empleado empleadoNew){
        empleadoServicio.actualizarEmpleado(codigoEmpleado, empleadoNew);
    } 
     
    public Empleado eliminarEmpleado(String codigoEmpleado){
        return empleadoServicio.eliminarEmpleado(codigoEmpleado);
    }
    public boolean isAdult(LocalDate date){
        var anioActual = LocalDate.now().getYear();
        var anioNacimiento = date.getYear();
        var age = anioActual-anioNacimiento;
        return age>=18;
    } 
    
    
    
    
   
      // Metodos validacion KeyEvent
    
    // valida que solo se ingresen numeros en numero de empleados
    public boolean validarSoloNumeros(char codigo){
        boolean flag = false;
        if(Character.isDigit(codigo)){
            flag = true;
        }
        return flag;
    }
    
    // valida que solo se ingrese texto en el campo "nombre"
    public boolean validarSoloTexto(char texto){
        boolean flag = false;
        if(Character.isLetter(texto) || Character.isSpaceChar(texto) 
                || Character.isUpperCase(texto)){
            flag = true;
        }
        return flag;
                
    }
}
