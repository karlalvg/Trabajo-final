/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Empleado;
import java.util.List;



/**
 *
 * @author karlylvg
 */
public interface IEmpleadoServicio {
    public Empleado crearEmpleado(Empleado empleado);
    public List<Empleado> listarEmpleados();
    public Empleado getEmpleadoByCodigo(String codigoEmpleado);
    public void actualizarEmpleado(String codigoEmpleado, Empleado empleadoNuevo);
    public Empleado eliminarEmpleado(String codigoEmpleado);
    public int getPositionEmpleado(Empleado empleado);
    
}
