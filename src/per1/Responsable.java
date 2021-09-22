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
    private String res_cedula, res_per_cedula, res_relacion_familiar;

    public Responsable(String res_cedula, String res_per_cedula, String res_relacion_familiar, String per_cedula, String per_nombre, String per_apellido, String per_direccion, String per_correo, String per_tiposangre, String per_sexo, int per_telefono, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_direccion, per_correo, per_tiposangre, per_sexo, per_telefono, per_nacimiento);
        this.res_cedula = res_cedula;
        this.res_per_cedula = res_per_cedula;
        this.res_relacion_familiar = res_relacion_familiar;
    }

    public String getRes_cedula() {
        return res_cedula;
    }

    public void setRes_cedula(String res_cedula) {
        this.res_cedula = res_cedula;
    }

    public String getRes_per_cedula() {
        return res_per_cedula;
    }

    public void setRes_per_cedula(String res_per_cedula) {
        this.res_per_cedula = res_per_cedula;
    }

    public String getRes_relacion_familiar() {
        return res_relacion_familiar;
    }

    public void setRes_relacion_familiar(String res_relacion_familiar) {
        this.res_relacion_familiar = res_relacion_familiar;
    }

    @Override
    public String toString() {
        return "Responsable{" + "res_cedula=" + res_cedula + ", res_per_cedula=" + res_per_cedula + ", res_relacion_familiar=" + res_relacion_familiar + '}';
    }
}
