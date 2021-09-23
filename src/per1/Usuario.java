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
public class Usuario extends Persona{
    private String usu_categoria, usu_contraseña;

    public Usuario(String usu_categoria, String usu_contraseña, String per_cedula, String per_nombre, String per_apellido, String per_direccion, String per_correo, String per_tiposangre, String per_sexo, int per_telefono, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_direccion, per_correo, per_tiposangre, per_sexo, per_telefono, per_nacimiento);
        this.usu_categoria = usu_categoria;
        this.usu_contraseña = usu_contraseña;
    }

    public String getUsu_categoria() {
        return usu_categoria;
    }

    public void setUsu_categoria(String usu_categoria) {
        this.usu_categoria = usu_categoria;
    }

    public String getUsu_contraseña() {
        return usu_contraseña;
    }

    public void setUsu_contraseña(String usu_contraseña) {
        this.usu_contraseña = usu_contraseña;
    }

    @Override
    public String toString() {
        return "CEDULA   " + super.getPer_cedula() + "   NOMBRE   " + super.getPer_nombre() + "   APELLIDO   " + super.getPer_apellido() + "   DIRECCION   " + super.getPer_direccion() + "   CORREO   " + super.getPer_correo() + "   TIPO DE SANGRE   " + super.getPer_tiposangre() + "   SEXO   " + super.getPer_sexo() + "   TELEFONO   " + super.getPer_telefono() + "   NACIMIENTO   " + super.getPer_nacimiento()  + "   CATEGORIA   " + usu_categoria;
    }
}
