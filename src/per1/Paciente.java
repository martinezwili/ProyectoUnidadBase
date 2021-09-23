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
public class Paciente extends Persona{
    private String pac_res_cedula, pac_peso, pac_estatura;

    public Paciente(String pac_res_cedula, String pac_peso, String pac_estatura, String per_cedula, String per_nombre, String per_apellido, String per_direccion, String per_correo, String per_tiposangre, String per_sexo, int per_telefono, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_direccion, per_correo, per_tiposangre, per_sexo, per_telefono, per_nacimiento);
        this.pac_res_cedula = pac_res_cedula;
        this.pac_peso = pac_peso;
        this.pac_estatura = pac_estatura;
    }

    public String getPac_res_cedula() {
        return pac_res_cedula;
    }

    public void setPac_res_cedula(String pac_res_cedula) {
        this.pac_res_cedula = pac_res_cedula;
    }

    public String getPac_peso() {
        return pac_peso;
    }

    public void setPac_peso(String pac_peso) {
        this.pac_peso = pac_peso;
    }

    public String getPac_estatura() {
        return pac_estatura;
    }

    public void setPac_estatura(String pac_estatura) {
        this.pac_estatura = pac_estatura;
    }

    @Override
    public String toString() {
        return "CEDULA   " + super.getPer_cedula() + "   NOMBRE   " + super.getPer_nombre() + "   APELLIDO   " + super.getPer_apellido() + "   DIRECCION   " + super.getPer_direccion() + "   CORREO   " + super.getPer_correo() + "   TIPO DE SANGRE   " + super.getPer_tiposangre() + "   SEXO   " + super.getPer_sexo() + "   TELEFONO   " + super.getPer_telefono() + "   NACIMIENTO   " + super.getPer_nacimiento()  + "   CEDULA RESPONSABLE   " + pac_res_cedula + "   PESO   " + pac_peso + "   ESTATURA   " + pac_estatura;
    }
}
