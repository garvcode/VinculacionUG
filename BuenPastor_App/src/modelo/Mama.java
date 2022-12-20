/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sebastian Riofrio
 */
public class Mama {
     //Variables de Mama
    String nombre_ma,lug_tra_ma,cargo_ma,tele_ma, est_civ_ma;  
    int id_mama = 0;
    
    


    public Mama() {
    }

    public Mama(String nombre_ma, String est_civ_ma, String lug_tra_ma, String cargo_ma, String tele_ma) {
        this.nombre_ma = nombre_ma;
        this.lug_tra_ma = lug_tra_ma;
        this.cargo_ma = cargo_ma;
        this.tele_ma = tele_ma;
        this.est_civ_ma = est_civ_ma;
    }

    

    public String getNombre_ma() {
        return nombre_ma;
    }

    public void setNombre_ma(String nombre_ma) {
        this.nombre_ma = nombre_ma;
    }

    public String getLug_tra_ma() {
        return lug_tra_ma;
    }

    public void setLug_tra_ma(String lug_tra_ma) {
        this.lug_tra_ma = lug_tra_ma;
    }

    public String getCargo_ma() {
        return cargo_ma;
    }

    public void setCargo_ma(String cargo_ma) {
        this.cargo_ma = cargo_ma;
    }

    public String getTele_ma() {
        return tele_ma;
    }

    public void setTele_ma(String tele_ma) {
        this.tele_ma = tele_ma;
    }

    public int getId_mama() {
        return id_mama;
    }

    public void setId_mama(int id_mama) {
        this.id_mama = id_mama;
    }

    public String isEst_civ_ma() {
        return est_civ_ma;
    }

    public void setEst_civ_ma(String est_civ_ma) {
        this.est_civ_ma = est_civ_ma;
    }

    
    
}
