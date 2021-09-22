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
public class Doctor extends Persona{
    private String doc_esp_codigo, doc_categoria;

    public Doctor(String doc_esp_codigo, String doc_categoria, String per_cedula, String per_nombre, String per_apellido, String per_direccion, String per_correo, String per_tiposangre, String per_sexo, int per_telefono, Date per_nacimiento) {
        super(per_cedula, per_nombre, per_apellido, per_direccion, per_correo, per_tiposangre, per_sexo, per_telefono, per_nacimiento);
        this.doc_esp_codigo = doc_esp_codigo;
        this.doc_categoria = doc_categoria;
    }

    public String getDoc_esp_codigo() {
        return doc_esp_codigo;
    }

    public void setDoc_esp_codigo(String doc_esp_codigo) {
        this.doc_esp_codigo = doc_esp_codigo;
    }

    public String getDoc_categoria() {
        return doc_categoria;
    }

    public void setDoc_categoria(String doc_categoria) {
        this.doc_categoria = doc_categoria;
    }

    @Override
    public String toString() {
        return "Doctor{" + "doc_esp_codigo=" + doc_esp_codigo + ", doc_categoria=" + doc_categoria + '}';
    }
}
