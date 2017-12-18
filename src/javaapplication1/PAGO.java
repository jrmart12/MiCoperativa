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
public class PAGO {
    String id_pago,usuario_creador,usuario_modificador,prestamo_id_prestamo;
    java.util.Date fecha,fecha_modificacion,fecha_creacion;
    int monto,intereses,capital;

    public String getId_pago() {
        return id_pago;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }

    public String getPrestamo_id_prestamo() {
        return prestamo_id_prestamo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public int getMonto() {
        return monto;
    }

    public int getIntereses() {
        return intereses;
    }

    public int getCapital() {
        return capital;
    }
    
    public PAGO(String id_pago,java.util.Date fecha,int monto,int intereses,int capital,
            java.util.Date fecha_creacion,java.util.Date fecha_modificacion,String usuario_creador,
            String usuario_modificador,String prestamo_id_prestamo){
        this.id_pago=id_pago;
        this.fecha=fecha;
        this.monto=monto;
        this.intereses=intereses;
        this.capital=capital;
        this.fecha_creacion=fecha_creacion;
        this.fecha_modificacion=fecha_modificacion;
        this.usuario_creador=usuario_creador;
        this.usuario_modificador=usuario_modificador;
        this.prestamo_id_prestamo=prestamo_id_prestamo;
    }
}
