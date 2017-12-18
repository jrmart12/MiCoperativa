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
public class ABONO {

    public String getId_abono() {
        return id_abono;
    }

    public int getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public String getUsuario_creacion() {
        return usuario_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }

    public String getCuentas_id_cuenta() {
        return cuentas_id_cuenta;
    }

    String id_abono;
    int monto;
    java.util.Date fecha;
    String comentario;
    java.util.Date fecha_creacion;
    String usuario_creacion;
    java.util.Date fecha_modificacion;
    String usuario_modificador;
    String cuentas_id_cuenta;

    public int getAbono_mensual() {
        return abono_mensual;
    }
    int abono_mensual;
    public ABONO(String id_abono,int monto,java.util.Date fecha, String comentario,int abono_mensual,
            java.util.Date fecha_creacion,String usuario_creacion,java.util.Date fecha_modificacion,
            String usuario_modificador,String cuentas_id_cuenta){    
        this.id_abono=id_abono;
        this.monto=monto;
        this.fecha=fecha;
        this.comentario=comentario;
        this.abono_mensual=abono_mensual;
        this.fecha_creacion=fecha_creacion;
        this.usuario_creacion=usuario_creacion;
        this.fecha_modificacion=fecha_modificacion;
        this.usuario_modificador=usuario_modificador;
        this.cuentas_id_cuenta=cuentas_id_cuenta;
    }
}
