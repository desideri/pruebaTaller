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

    String names;
    int cliente_sector;
    Pago Pago;

    public Cliente(String names, int sector, Pago pago) {
        this.names = names;
        this.cliente_sector = sector;
        this.Pago = pago;
    }

    public String getNombres() {
        return names;
    }

    public String getinfo_cliente() {
        return "Usted ingreso la siguiente informacion" + "\nNombre:" + names + "\nSector=" + cliente_sector;
    }
    
//     public String getclientesector() {
//        return "Usted ingreso la siguiente informacion" + "\nNombre:" + names + "\nSector=" + cliente_sector;
//    }

    @Override
    public String toString() {
        return "Informacion correcta";
    }

}
