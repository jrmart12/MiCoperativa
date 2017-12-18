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
public class PRESTAMO {
    String id_prestamo,usuario_creador,usuario_modificador,empelados_id_empleados,tipo_prestamo;
    java.util.Date fecha,fecha_creacion,fecha_modificacion;
    int monto,periodos,saldo;
    Object getId_prestamo;

    public String getId_prestamo() {
        return id_prestamo;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }

    public String getEmpelados_id_empleados() {
        return empelados_id_empleados;
    }

    public String getTipo_prestamo() {
        return tipo_prestamo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public int getMonto() {
        return monto;
    }

    public int getPeriodos() {
        return periodos;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public PRESTAMO(String id_prestamo,java.util.Date fecha,int monto,int periodos,int saldo,java.util.Date fecha_creacion,
            java.util.Date fecha_modificacion,String usuario_creador,String usuario_modificador,String empleados_id_empleados,
            String tipo_prestamo){
        this.id_prestamo=id_prestamo;
        this.usuario_creador=usuario_creador;
        this.usuario_modificador=usuario_modificador;
        this.empelados_id_empleados=empleados_id_empleados;
        this.tipo_prestamo=tipo_prestamo;
        this.fecha=fecha;
        this.fecha_creacion=fecha_creacion;
        this.fecha_modificacion=fecha_modificacion;
        this.monto=monto;
        this.periodos=periodos;
        this.saldo=saldo;
    }
}
