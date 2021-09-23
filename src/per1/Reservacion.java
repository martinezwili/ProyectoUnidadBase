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
public class Reservacion {
    private String rese_codigo, rese_doc_cedula,rese_usu_cedula, rese_res_cedula, rese_pac_cedula, rese_sintomas;
    private Date rese_fecha_hora;

    public Reservacion(String rese_codigo, String rese_doc_cedula, String rese_usu_cedula, String rese_res_cedula, String rese_pac_cedula, String rese_sintomas, Date rese_fecha_hora) {
        this.rese_codigo = rese_codigo;
        this.rese_doc_cedula = rese_doc_cedula;
        this.rese_usu_cedula = rese_usu_cedula;
        this.rese_res_cedula = rese_res_cedula;
        this.rese_pac_cedula = rese_pac_cedula;
        this.rese_sintomas = rese_sintomas;
        this.rese_fecha_hora = rese_fecha_hora;
    }

    public String getRese_codigo() {
        return rese_codigo;
    }

    public void setRese_codigo(String rese_codigo) {
        this.rese_codigo = rese_codigo;
    }

    public String getRese_doc_cedula() {
        return rese_doc_cedula;
    }

    public void setRese_doc_cedula(String rese_doc_cedula) {
        this.rese_doc_cedula = rese_doc_cedula;
    }

    public String getRese_usu_cedula() {
        return rese_usu_cedula;
    }

    public void setRese_usu_cedula(String rese_usu_cedula) {
        this.rese_usu_cedula = rese_usu_cedula;
    }

    public String getRese_res_cedula() {
        return rese_res_cedula;
    }

    public void setRese_res_cedula(String rese_res_cedula) {
        this.rese_res_cedula = rese_res_cedula;
    }

    public String getRese_pac_cedula() {
        return rese_pac_cedula;
    }

    public void setRese_pac_cedula(String rese_pac_cedula) {
        this.rese_pac_cedula = rese_pac_cedula;
    }

    public String getRese_sintomas() {
        return rese_sintomas;
    }

    public void setRese_sintomas(String rese_sintomas) {
        this.rese_sintomas = rese_sintomas;
    }

    public Date getRese_fecha_hora() {
        return rese_fecha_hora;
    }

    public void setRese_fecha_hora(Date rese_fecha_hora) {
        this.rese_fecha_hora = rese_fecha_hora;
    }

    @Override
    public String toString() {
        return "CODIGO   " + rese_codigo + "   CEDULA DOCTOR   " + rese_doc_cedula + "   CEDULA USUARIO   " + rese_usu_cedula + "   CEDULA RESPONSABLE   " + rese_res_cedula + "   CEDULA PACIENTE   " + rese_pac_cedula + "   SINTOMAS   " + rese_sintomas + "   FECHA Y HORA   " + rese_fecha_hora;
    }
}
