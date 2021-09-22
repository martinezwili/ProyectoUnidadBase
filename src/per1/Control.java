/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per1;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MAWIL
 */
public class Control {

    public static ObjectContainer DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\Clinica.yap"); 
    
    /**
     * @param args the command line arguments
     */
/*    public static void open() {
        // TODO code application logic here
        DB = Db4o.openFile("C:\\Users\\MAWIL\\Downloads\\BD Access\\M2C\\Clinica.yap");      
    }*/
    
    public static boolean Crear_Especialidad(String esp_codigo, String esp_nombre, String esp_descripcion){
        
        Especialidad espe = new Especialidad(esp_codigo, esp_nombre, esp_descripcion);
        
        if(Comprobar_especialidad(DB, esp_codigo) == 0){
         DB.set(espe);
         DB.close();
            return true;
        }
        else
        {
        DB.close();
            return false; 
        }    
    }
    
    public static int Comprobar_especialidad(ObjectContainer base, String esp_codigo){
        Especialidad comespe = new Especialidad(null, null, null);
        ObjectSet resul = base.get(comespe);
        return resul.size();
    }
    
    /*public static boolean Crear_Especialidad(Especialidad objeto){
        try{
            open();
            Base.set(objeto);
            Base.close();
            System.out.println("datos ingresados");
            return true;
        }catch(Exception ex){
            return false;
        }
    }*/
    
    
    
    /*public static boolean Crear_Especialidad(ObjectContainer base, String esp_codigo, String esp_nombre, String esp_descripcion){
        Especialidad espe = new Especialidad(esp_codigo, esp_nombre, esp_descripcion);
        
        if(Comprobar_especialidad(base, esp_codigo) == 0){
         base.set(espe);
         System.out.println("datos ingresados");
            return true;
        }
        else
        {
            return false; 
        }    
    }
    
    public static int Comprobar_especialidad(ObjectContainer base, String esp_codigo){
        Especialidad comespe = new Especialidad(null, null, null);
        ObjectSet resul = base.get(comespe);
        return resul.size();
    }
    
    public static void Consultar_Especialidad(ObjectContainer base){
        Clientes cbuscar = new Clientes(null, null, null, null, null);
        ObjectSet resul = base.get(cbuscar);
        System.out.println("Existen : " + resul.size() + " Clientes ");
    
        while(resul.hasNext()){
            System.out.println(resul.next());
        }
    }*/
    
    /*
    public static void Eliminar_especialidad(ObjectContainer base, String cedula){
        Clientes cbuscar = new Clientes(cedula, null, null, null, null);
        ObjectSet resul = base.get(cbuscar);
        
        if(resul.size() == 0){
            System.out.println("El cliente no existe");
        }
        else
        {
            Clientes celimina = (Clientes)resul.next();
            base.delete(celimina);
            System.out.println("El cliente fue eliminado exitosamente");
        }
    }
    
    public static void Actualizar_especialidad(ObjectContainer base, String cedula, String nombre){
        Clientes cbuscar = new Clientes(cedula, null, null, null, null);
        ObjectSet resul = base.get(cbuscar);
        if(resul.size() == 0){
            System.out.println("El cliente no existe");
        }
        else
        {
            Clientes cactualizado = (Clientes)resul.next();
            cactualizado.setCli_nombre(nombre);
            base.set(cactualizado);
            System.out.println("El cliente fue actualizado exitosamente");
        }
        
    }*/
    
    /*public Especialidad [] Consultar_especialidades(){
        Especialidad [] especialidad = null;
        open();
        ObjectSet resultados = Base.get(this)
        int i = 0;
        Especialidad conmespe = new Especialidad(null, null, null);
        ObjectSet resul = Base.get(conmespe);
        System.out.println("Existen : " + resul.size() + " Especialidades ");
        
        while(resul.hasNext()){
            especialidad [i] = (Especialidad) resul.next();
        }
        return especialidad;
        Base.close();
    }*/
    
    public static void CerrarBd(ObjectContainer base){
        base.close();
    }
}
