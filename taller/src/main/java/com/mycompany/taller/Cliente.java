/*
 * @cliente.java         
 *
 * @author             Kattya Desiderio 
 * Fecha Creación      04/05/2017
 * Fecha Modificación  01/01/18
 * @version            1.2
 */
package com.mycompany.taller;

/**
 *
 * @author kattya
 */
public class Cliente {

    /**
     *
     */
    public String nombres;
    public int sector;
    public Pago pago;

    /**
     *
     * @param nombres
     * @param sector
     * @param pago
     */
    public Cliente(String nombres, int sector, Pago pago) {
        this.nombres = nombres;
        this.sector = sector;
        this.pago = pago;
    }

    /**
     *
     * @return
     */
    public String getNombres() {
        return nombres;
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
    public String getInformacionCliente() {
        return "Usted ingreso la siguiente informacion" + "\nNombre:" + nombres + "\nSector=" + sector;
    }

    @Override
    public String toString() {
        return "Informacion correcta";
    }

}
