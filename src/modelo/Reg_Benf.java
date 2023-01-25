/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author steve
 */
public class Reg_Benf {
    //Variables de ingreso del beneficiario
    String ben_nom,ben_ape,ben_dir,ben_ced,ben_email,ben_relig,ben_promsal,ben_cel; 
    int ben_edad, ben_convivientes,id_padres,id_escu,id_benf,id_socioec;
    Date ben_fechanac;
//    Date ben_fechainsc;

    public String getBen_nom() {
        return ben_nom;
    }

    public void setBen_nom(String ben_nom) {
        this.ben_nom = ben_nom;
    }

    public String getBen_ape() {
        return ben_ape;
    }

    public void setBen_ape(String ben_ape) {
        this.ben_ape = ben_ape;
    }

    public String getBen_dir() {
        return ben_dir;
    }

    public void setBen_dir(String ben_dir) {
        this.ben_dir = ben_dir;
    }

    public String getBen_ced() {
        return ben_ced;
    }

    public void setBen_ced(String ben_ced) {
        this.ben_ced = ben_ced;
    }

    public String getBen_email() {
        return ben_email;
    }

    public void setBen_email(String ben_email) {
        this.ben_email = ben_email;
    }

    public String getBen_relig() {
        return ben_relig;
    }

    public void setBen_relig(String ben_relig) {
        this.ben_relig = ben_relig;
    }

    public String getBen_promsal() {
        return ben_promsal;
    }

    public void setBen_promsal(String ben_promsal) {
        this.ben_promsal = ben_promsal;
    }

    public String getBen_cel() {
        return ben_cel;
    }

    public void setBen_cel(String ben_cel) {
        this.ben_cel = ben_cel;
    }

    public int getBen_edad() {
        return ben_edad;
    }

    public void setBen_edad(int ben_edad) {
        this.ben_edad = ben_edad;
    }

    public int getBen_convivientes() {
        return ben_convivientes;
    }

    public void setBen_convivientes(int ben_convivientes) {
        this.ben_convivientes = ben_convivientes;
    }

    public int getId_padres() {
        return id_padres;
    }

    public void setId_padres(int id_padres) {
        this.id_padres = id_padres;
    }

    public int getId_escu() {
        return id_escu;
    }

    public void setId_escu(int id_escu) {
        this.id_escu = id_escu;
    }

    public int getId_benf() {
        return id_benf;
    }

    public void setId_benf(int id_benf) {
        this.id_benf = id_benf;
    }

    public int getId_socioec() {
        return id_socioec;
    }

    public void setId_socioec(int id_socioec) {
        this.id_socioec = id_socioec;
    }

    public Date getBen_fechanac() {
        return ben_fechanac;
    }

    public void setBen_fechanac(Date ben_fechanac) {
        this.ben_fechanac = ben_fechanac;
    }

    
    public void mostrarDato(){
        System.out.println(this.getBen_nom()+"\n"+ this.getBen_ape()+ this.getBen_ced());
    }
    

    public  Reg_Benf(){
        
    }
    
}
