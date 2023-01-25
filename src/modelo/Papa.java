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
public class Papa {
     //Variables de Papa
    String nombre_pa,lug_tra_pa,cargo_pa,tele_pa, est_civ_pa; 
    int id_papa =0;

    public Papa() {
    }

    public Papa(String nombre_pa,String est_civ_pa, String lug_tra_pa, String cargo_pa, String tele_pa) {
        this.nombre_pa = nombre_pa;
        this.lug_tra_pa = lug_tra_pa;
        this.cargo_pa = cargo_pa;
        this.tele_pa = tele_pa;
        this.est_civ_pa = est_civ_pa;
    }

    public String getNombre_pa() {
        return nombre_pa;
    }

    public void setNombre_pa(String nombre_pa) {
        this.nombre_pa = nombre_pa;
    }

    public String getLug_tra_pa() {
        return lug_tra_pa;
    }

    public void setLug_tra_pa(String lug_tra_pa) {
        this.lug_tra_pa = lug_tra_pa;
    }

    public String getCargo_pa() {
        return cargo_pa;
    }

    public void setCargo_pa(String cargo_pa) {
        this.cargo_pa = cargo_pa;
    }

    public String getTele_pa() {
        return tele_pa;
    }

    public void setTele_pa(String tele_pa) {
        this.tele_pa = tele_pa;
    }

    public int getId_papa() {
        return id_papa;
    }

    public void setId_papa(int id_papa) {
        this.id_papa = id_papa;
    }

    public String isEst_civ_pa() {
        return est_civ_pa;
    }

    public void setEst_civ_pa(String est_civ_pa) {
        this.est_civ_pa = est_civ_pa;
    }

    

    

   
    
    
}
