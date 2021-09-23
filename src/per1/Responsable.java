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
public class Responsable extends Persona{
    private String res_relacion_familiar;

    public Responsable(String res_relacion_familiar, String per_cedula, String per_nombre, String per_apellido, String per_direccion, String per_correo, String per_tiposangre, String per_sexo, int per_telefono, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_direccion, per_correo, per_tiposangre, per_sexo, per_telefono, per_nacimiento);
        this.res_relacion_familiar = res_relacion_familiar;
    }
    
    public String getRes_relacion_familiar() {
        return res_relacion_familiar;
    }

    public void setRes_relacion_familiar(String res_relacion_familiar) {
        this.res_relacion_familiar = res_relacion_familiar;
    }

    @Override
    public String toString() {
        return "CEDULA   " + super.getPer_cedula() + "   NOMBRE   " + super.getPer_nombre() + "   APELLIDO   " + super.getPer_apellido() + "   DIRECCION   " + super.getPer_direccion() + "   CORREO   " + super.getPer_correo() + "   TIPO DE SANGRE   " + super.getPer_tiposangre() + "   SEXO   " + super.getPer_sexo() + "   TELEFONO   " + super.getPer_telefono() + "   NACIMIENTO   " + super.getPer_nacimiento()  + "   RELACION   " + res_relacion_familiar;
    }
}
