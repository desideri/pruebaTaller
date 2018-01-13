/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller;

/**
 *
 * @author Stephany
 */
public class Pago {

    Boolean tipo; // tipo = True(efectivo) tipo=false(tarjeta de credito)
    String numeroTarjeta;

    /**
     *
     */
    public Pago() {
    }

    /**
     *
     * @param tipo
     * @param tarjeta
     */
    public void crear_pago(Boolean tipo, String tarjeta) {
        this.tipo = tipo;
        this.numeroTarjeta = tarjeta;
    }

//Funcion que ingresa un tipo de dato Pago y retorna un String que indica el tipo de pago del cliente.
    /**
     *
     * @param p
     * @return
     */
    public String validar_pago(Pago p) {
        if (p.getTipo().equals(true)) {
            return "Pago en efectivo";
        } else if (p.getTipo().equals(false)) {
            if (this.numeroTarjeta.matches("[0-9]*")) {
                return "Pago con tarjeta";
            } else {
                return "Tarjeta no v�lida";
            }
        } else {
            return "Tipo de pago incorrecto";
        }
    }

    //Funcion que retorna el si el pago fue en efectivo(true) o tarjeta(false).
    /**
     *
     * @return
     */
    public Boolean getTipo() {
        return tipo;
    }
    //Funcion que retorna un String que contiene el n�mero de tajeta de cr�dito.

    /**
     *
     * @return
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

}
