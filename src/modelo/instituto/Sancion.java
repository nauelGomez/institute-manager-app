/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.instituto;

import java.io.Serializable;
import modelo.usuarios.Usuario;

/**
 *
 * @author veryn
 */
    public class Sancion implements Serializable {
        private String motivo;
        
        public Sancion (String motivo)
        {
            this.motivo = motivo;
        }


        public String getMotivo(){
            return motivo;
        }
    }
