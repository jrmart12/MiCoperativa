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
public class EMPLEADO_CORREO {
    String correo_electronico,usuario_creador,usuario_modificador,empleados_id_empleados;
    java.util.Date fecha_creacion,fecha_modificacion;

    public String getCorreo_electronico() {
        return correo_electronico;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }
    
    public EMPLEADO_CORREO(String correo_electronico,java.util.Date fecha_creacion,java.util.Date fecha_modificacion,
            String usuario_creador,String usuario_modificador,String empleados_id_empleados){
        this.correo_electronico=correo_electronico;
        this.empleados_id_empleados=empleados_id_empleados;
        this.fecha_creacion=fecha_creacion;
        this.fecha_modificacion=fecha_modificacion;
        this.usuario_creador=usuario_creador;
        this.usuario_modificador=usuario_modificador;
        
    }
}
