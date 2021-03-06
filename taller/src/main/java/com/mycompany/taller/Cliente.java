/*
 * @cliente.java         
 *
 * @author             Kattya Desiderio 
 * Fecha Creación      04/05/2017
 * Fecha Modificación  26/01/18
 * @version            1.2
 */
package com.mycompany.taller;

/**
 *
 * @author Kattya
 */
public class Cliente {
    
    String names;
    int sector;
    //Pago pago;

    /**
     *
     * @param names
     * @param sector
     * @param pago
     */
//    public Cliente(String names, int sector, Pago pago) {
//        this.names = names;
//        this.sector = sector;
//        this.pago = pago;
//    }

    public Cliente(String names, int sector) {
        this.names = names;
        this.sector = sector;
        //this.pago = pago;
    }
    
    /**
     *
     * @return names
     */
    public String getNombres() {
        return names;
    }
 
    public String getSector() {
        switch (this.sector) {
            case 1:
                return "Norte";
            case 2:
                return "Centro";
            case 3:
                return "Sur";
            default:
                break;
        }
        return null;
    }
    
    public String getinfo_cliente() {
        return "Usted ingreso la siguiente informacion" + "\nNombres:" + names + "\nSector=" + sector;
    }

    @Override
    public String toString() {
        return "Informacion correcta";
    }

}
