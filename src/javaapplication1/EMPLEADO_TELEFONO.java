/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Date;
/**
 *
 * @author jose
 */
public class EMPLEADO_TELEFONO {

    public int getTelefono() {
        return telefono;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getFecha_modificador() {
        return fecha_modificador;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }

    public String getEmpleados_id_empleados() {
        return empleados_id_empleados;
    }
    
    int telefono;
    java.util.Date fecha_creacion,fecha_modificador;
    String usuario_creador,usuario_modificador,empleados_id_empleados;
    
    public EMPLEADO_TELEFONO(int telefono,java.util.Date fecha_creacion,java.util.Date fecha_modificador,
            String usuario_creador,String usuario_modificador,String empleados_id_empleados){
        this.telefono=telefono;
        this.fecha_creacion=fecha_creacion;
        this.fecha_modificador=fecha_modificador;
        this.usuario_creador=usuario_creador;
        this.usuario_modificador=usuario_modificador;
        this.empleados_id_empleados=empleados_id_empleados;
        
    }
    
}
