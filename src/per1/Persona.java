/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per1;

import java.util.Date;

/**
 *
 * @author MAWIL
 */
public class Persona {
    private String per_cedula, per_nombre,per_apellido, per_direccion, per_correo, per_tiposangre, per_sexo;
    private int per_telefono;
    private Date per_nacimiento;

    public Persona(String per_cedula, String per_nombre, String per_apellido, String per_direccion, String per_correo, String per_tiposangre, String per_sexo, int per_telefono, Date per_nacimiento) {
        this.per_cedula = per_cedula;
        this.per_nombre = per_nombre;
        this.per_apellido = per_apellido;
        this.per_direccion = per_direccion;
        this.per_correo = per_correo;
        this.per_tiposangre = per_tiposangre;
        this.per_sexo = per_sexo;
        this.per_telefono = per_telefono;
        this.per_nacimiento = per_nacimiento;
    }

    public String getPer_cedula() {
        return per_cedula;
    }

    public void setPer_cedula(String per_cedula) {
        this.per_cedula = per_cedula;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public String getPer_correo() {
        return per_correo;
    }

    public void setPer_correo(String per_correo) {
        this.per_correo = per_correo;
    }

    public String getPer_tiposangre() {
        return per_tiposangre;
    }

    public void setPer_tiposangre(String per_tiposangre) {
        this.per_tiposangre = per_tiposangre;
    }

    public String getPer_sexo() {
        return per_sexo;
    }

    public void setPer_sexo(String per_sexo) {
        this.per_sexo = per_sexo;
    }

    public int getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(int per_telefono) {
        this.per_telefono = per_telefono;
    }

    public Date getPer_nacimiento() {
        return per_nacimiento;
    }

    public void setPer_nacimiento(Date per_nacimiento) {
        this.per_nacimiento = per_nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "per_cedula=" + per_cedula + ", per_nombre=" + per_nombre + ", per_apellido=" + per_apellido + ", per_direccion=" + per_direccion + ", per_correo=" + per_correo + ", per_tiposangre=" + per_tiposangre + ", per_sexo=" + per_sexo + ", per_telefono=" + per_telefono + ", per_nacimiento=" + per_nacimiento + '}';
    }
}
