/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.view;

import Controladores.UsuarioJpaController;
import Entidades.Rol;
import Entidades.Usuario;
import com.bcd.managedbeans.ResquestScoped;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Héctor Vix
 */
//@Dependent
@ManagedBean(name = "registrar")
//@ResquestScoped
public class RegistrarView implements Serializable {

    UsuarioJpaController control_usuario = new UsuarioJpaController();
    private Integer usuarioid;
    private String nombre;
    private String apellido;
    private String usuario;
    private String sex;

    private Integer sexo;
    private Date fechanacimiento;
    private String email;
    private String contrasena;
    private Rol rolId;

    //validar usuario repetido
    // validar email repetido
    // validar nombre igual
    public UsuarioJpaController getControl_usuario() {
        return control_usuario;
    }

    public void setControl_usuario(UsuarioJpaController control_usuario) {
        this.control_usuario = control_usuario;
    }

    public Integer getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Integer usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRolId() {
        return rolId;
    }

    public void setRolId(Rol rolId) {
        this.rolId = rolId;
    }

    /**
     * Creates a new instance of Registrar
     */
    public RegistrarView() {
    }

    public String registrar() {

        Usuario usuarioE = new Usuario();
        usuarioE.setUsuarioId(usuarioid);
        usuarioE.setNombre(nombre);
        usuarioE.setApellido(apellido);
        usuarioE.setUsuario(usuario);
        usuarioE.setSexo(sexo);
        usuarioE.setFechanacimiento(fechanacimiento);
        usuarioE.setEmail(email);
        usuarioE.setContrasena(contrasena);
        usuarioE.setRolId(rolId);
        // rolId.setRolId(2);
        control_usuario.create(usuarioE);
        return "";
    }
}