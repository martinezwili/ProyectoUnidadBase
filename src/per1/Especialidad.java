/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per1;

/**
 *
 * @author MAWIL
 */
public class Especialidad {
    private String esp_codigo, esp_nombre, esp_descripcion;

    public Especialidad(String esp_codigo, String esp_nombre, String esp_descripcion) {
        this.esp_codigo = esp_codigo;
        this.esp_nombre = esp_nombre;
        this.esp_descripcion = esp_descripcion;
    }

    public String getEsp_codigo() {
        return esp_codigo;
    }

    public void setEsp_codigo(String esp_codigo) {
        this.esp_codigo = esp_codigo;
    }

    public String getEsp_nombre() {
        return esp_nombre;
    }

    public void setEsp_nombre(String esp_nombre) {
        this.esp_nombre = esp_nombre;
    }

    public String getEsp_descripcion() {
        return esp_descripcion;
    }

    public void setEsp_descripcion(String esp_descripcion) {
        this.esp_descripcion = esp_descripcion;
    }

    @Override
    public String toString() {
        return   "CODIGO:   " + esp_codigo + "   NOMBRE:   " + esp_nombre + "   DESCRIPCION:   " + esp_descripcion;
    }
}
