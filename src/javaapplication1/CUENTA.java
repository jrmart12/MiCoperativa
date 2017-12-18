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
public class CUENTA {

    public String getId_cuenta() {
        return id_cuenta;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public String getEmpleados() {
        return empleados;
    }

    public String getTipos() {
        return tipos;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getAhorro_mensual() {
        return ahorro_mensual;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getUltima_modificacion() {
        return ultima_modificacion;
    }
    String id_cuenta,usuario_creador,usuario_modificador,empleados,tipos;
    int saldo,antiguedad,ahorro_mensual;
    java.util.Date fecha_apertura,fecha_creacion,ultima_modificacion;
    
    public CUENTA(String id_cuenta,java.util.Date fecha_apertura,int saldo,int antiguedad,int ahorro_mensual,
            java.util.Date fecha_creacion,String usuario_creador,java.util.Date ultima_modificacion,String usuario_modificador,String empleados,
            String tipos){
        this.id_cuenta=id_cuenta;
        this.usuario_creador=usuario_creador;
        this.empleados=empleados;
        this.tipos=tipos;
        this.saldo=saldo;
        this.antiguedad=antiguedad;
        this.ahorro_mensual=ahorro_mensual;
        this.fecha_apertura=fecha_apertura;
        this.fecha_creacion=fecha_creacion;
        this.ultima_modificacion=ultima_modificacion;
        this.usuario_modificador=usuario_modificador;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }
}
