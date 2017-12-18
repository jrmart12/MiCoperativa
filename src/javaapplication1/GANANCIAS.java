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
public class GANANCIAS {

    public String getEmpleado() {
        return empleado;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public String getUsuario_modificacion() {
        return usuario_modificacion;
    }

    public String getEmpleados_id_empleados() {
        return empleados_id_empleados;
    }

    public int getSaldo_Cuenta() {
        return saldo_Cuenta;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public int getGanancia() {
        return ganancia;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }
    
    String empleado,usuario_creador,usuario_modificacion,empleados_id_empleados;
    int saldo_Cuenta,porcentaje,ganancia;
    java.util.Date fecha_creacion,fecha_modificacion;
    
    public GANANCIAS(String empleado, int saldo_cuenta,int porcentaje,int ganancia,java.util.Date fecha_creacion,
            java.util.Date fecha_modificacion,String usuario_creador,String usuario_modificacion,String empleados_id_empleados){
        this.empleado=empleado;
        this.saldo_Cuenta=saldo_cuenta;
        this.porcentaje=porcentaje;
        this.ganancia=ganancia;
        this.fecha_creacion=fecha_creacion;
        this.fecha_modificacion=fecha_modificacion;
        this.usuario_creador=usuario_creador;
        this.usuario_modificacion=usuario_modificacion;
        this.empleados_id_empleados=empleados_id_empleados;
        
    }
}
