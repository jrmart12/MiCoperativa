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
public class ROLES {
        String id_roles,descripcion,usuario_creador,usuario_modificador;
    java.util.Date fecha_creacion,fecha_modificacion;

    public String getId_roles() {
        return id_roles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUsuario_creador() {
        return usuario_creador;
    }

    public String getUsuario_modificador() {
        return usuario_modificador;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }
    
    public ROLES(String id_roles,String descripcion,java.util.Date fecha_creacion,
            java.util.Date fecha_modificacion,String usuario_creador,String usuario_modificador){
        this.id_roles=id_roles;
        this.descripcion=descripcion;
        this.fecha_creacion=fecha_creacion;
        this.fecha_modificacion=fecha_modificacion;
        this.usuario_creador=usuario_creador;
        this.usuario_modificador=usuario_modificador;
    }
}
