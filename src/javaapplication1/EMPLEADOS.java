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
public class EMPLEADOS {

    public String getId_empleados() {
        return id_empleados;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public String getDireccion_emp() {
        return direccion_emp;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }

    public int getTelefono_emp() {
        return telefono_emp;
    }

    public Date getNacimiento_emp() {
        return nacimiento_emp;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }
    
    String id_empleados,nombre_emp,direccion_emp,correo_emp,usuario_creador,usuario_modificador;
    int telefono_emp;
    java.util.Date nacimiento_emp,fecha_inicio,fecha_creacion,fecha_modificacion;
    
    public EMPLEADOS(String id_empleados,String nombre_emp,int telefono_emp,String direccion_emp,String correo_emp,
            java.util.Date nacimiento_emp,java.util.Date fecha_inicio,java.util.Date fecha_creacion,java.util.Date fecha_modificacion,
            String usuario_creador,String usuario_modificador){
        this.id_empleados=id_empleados;
        this.nombre_emp=nombre_emp;
        this.direccion_emp=direccion_emp;
        this.correo_emp=correo_emp;
        this.usuario_creador=usuario_creador;
        this.usuario_modificador=usuario_modificador;
        this.telefono_emp=telefono_emp;
        this.nacimiento_emp=nacimiento_emp;
        this.fecha_inicio=fecha_inicio;
        this.fecha_creacion=fecha_creacion;
        this.fecha_modificacion=fecha_modificacion;
    }
}
