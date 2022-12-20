/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import idao.IBeneficiario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.BeneficiarioEntity;
import modelo.Reg_Benf;


public class DaoBeneficiario extends Conexion implements IBeneficiario {
    final String INSERT= "Insert into public.beneficiario(cedula,fech_nac,nom_bene,ape_bene,edad_bene,direccion,correo,religion,prom_sal,tele_bene,num_conv, id_padres, id_escu, id_socieco) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   

    @Override
    public boolean insertar(Reg_Benf beneficiario) {
        
        boolean registrar = false;
        PreparedStatement sta=null;
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(beneficiario.getBen_fechanac());
        java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
        
        try {
            this.conectar();
            sta=this.conexion.prepareStatement(INSERT);
             
            sta.setString(1, beneficiario.getBen_ced());
            
            
            sta.setDate(2, date1);
            
            sta.setString(3, beneficiario.getBen_nom());
            sta.setString(4, beneficiario.getBen_ape());
            sta.setInt(5, beneficiario.getBen_edad());
            sta.setString(6, beneficiario.getBen_dir());
            sta.setString(7, beneficiario.getBen_email());
            sta.setString(8, beneficiario.getBen_relig());
            sta.setString(9, beneficiario.getBen_promsal());
            sta.setString(10, beneficiario.getBen_cel());
            sta.setInt(11, beneficiario.getBen_convivientes());
            sta.setInt(12, beneficiario.getId_padres());
            sta.setInt(13, beneficiario.getId_escu());
            sta.setInt(14, beneficiario.getId_socioec());
            
            if (sta.executeUpdate() >0){
                JOptionPane.showMessageDialog(null, "Fueron ingresados todos los datos", "Sistema", JOptionPane.PLAIN_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se guardardo los datos del beneficiario", "Error", JOptionPane.WARNING_MESSAGE);
            
            }
                
         
        }catch (SQLException e){
            System.out.println("Esta mal el registro sql del insertar"+e);
            JOptionPane.showMessageDialog(null, "Faltan datos o en el campo id_beneficio "
                     + " a ingresado un dato que no existe a esa tabla", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                this.desconectar();
            } catch (Exception ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registrar;
    }

    @Override
    public boolean eliminar(Reg_Benf beneficiario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Reg_Benf bene) {
        boolean actualizar= false;
	PreparedStatement sta=null;
        try {
             this.conectar();
             String sql= "UPDATE beneficiario SET cedula=?, fech_nac=?, nom_bene=?, ape_bene=?, edad_bene=?, direccion=?, correo=?, religion=?, prom_sal=?, tele_bene=?, num_conv=? WHERE id_bene = ?";
             sta=this.conexion.prepareStatement(sql);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = simpleDateFormat.format(bene.getBen_fechanac());
            java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
            
            sta.setString(1, bene.getBen_ced());
            sta.setDate(2, date1);
            sta.setString(3, bene.getBen_nom());
            sta.setString(4, bene.getBen_ape());
            sta.setInt(5, bene.getBen_edad());
            sta.setString(6, bene.getBen_dir());
            sta.setString(7, bene.getBen_email());
            sta.setString(8, bene.getBen_relig());
            sta.setString(9, bene.getBen_promsal());
            sta.setString(10, bene.getBen_cel());
            sta.setInt(11, bene.getBen_convivientes());
            sta.setInt(12, bene.getId_benf());
             
            
            int filas = sta.executeUpdate();
            
           if(filas>0){
               actualizar= true;
           }
          
        }catch (Exception e){
               JOptionPane.showMessageDialog(null, "ESTA MAL EL INGRESO DE DATOS MODIFICAR Beneficciarios"+e,"Error", JOptionPane.WARNING_MESSAGE);
               
        }finally{
                try {
                    this.desconectar();
                } catch (Exception ex) {
                    Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
        }return actualizar;
    }

    @Override
    public ArrayList<Object[]> consultar() {
        Connection conexion= null;
        Statement sta=null;
        PreparedStatement stm= null;
        ResultSet rs=null;
        ArrayList<Object[]> beneficiariosList= new ArrayList<>();
        
        String sql="SELECT b.cedula, b.nom_bene, b.ape_bene, p.nombre_pa, m.nombre_ma, b.direccion, m.tele_ma\n" +
                    "FROM beneficiario b, socioeconomico s, padres pas, papa p, mama m, escuela e\n" +
                    "where b.id_padres = pas.id_padres and pas.id_mama =m.id_mama and pas.id_papa = p.id_papa and\n" +
                    "b.id_escu = e.id_escu and b.id_socieco = s.id_socieco ";
        
        try {
            this.conectar();
            conexion=this.getCon();
            sta=conexion.createStatement();
            sta.execute(sql);
            sta.close();

            stm=conexion.prepareStatement(sql);
            rs= stm.executeQuery();
            while(rs.next()){
                Object[] fila = new Object[7];
                for(int i=0; i<=6;i++){
                   fila[i]=rs.getObject(i+1);
                }
                beneficiariosList.add(fila);
            }
            conexion.close();
               
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error EN sql CONSULTAR Beneficiario:"+e.getMessage());
       } finally{
           return beneficiariosList;
       }
    }

    @Override
    public Reg_Benf obtener(Reg_Benf beneficiario) {
        Connection conexion= null;
        PreparedStatement sta=null;
        Statement stm= null;
        ResultSet rs=null;
        Reg_Benf benefi= new Reg_Benf();
        
        boolean valor = false;
        
        String sql="SELECT * FROM beneficiario where cedula = ? and nom_bene = ? and ape_bene = ? and direccion = ? ";
        
        try {
            this.conectar();
            conexion=this.getCon();
            sta=conexion.prepareStatement(sql);
            sta.setString(1, beneficiario.getBen_ced());
            sta.setString(2, beneficiario.getBen_nom());
            sta.setString(3, beneficiario.getBen_ape());
            sta.setString(4, beneficiario.getBen_dir());
            
            valor = sta.execute();
            beneficiario.setId_benf(0);
            
            rs = sta.executeQuery(); 
            
            while(rs.next()){
                beneficiario.setId_benf((Integer) rs.getObject(1));
                beneficiario.setBen_ced((String) rs.getObject(2));
                beneficiario.setBen_fechanac((Date)rs.getObject(3));
                beneficiario.setBen_nom((String)rs.getObject(4));
                beneficiario.setBen_ape((String)rs.getObject(5));
                beneficiario.setBen_edad((Integer)rs.getObject(6));
                beneficiario.setBen_dir((String)rs.getObject(7));
                beneficiario.setBen_email((String)rs.getObject(8));
                beneficiario.setBen_relig((String)rs.getObject(9));
                beneficiario.setBen_promsal((String)rs.getObject(10));
                beneficiario.setBen_cel((String)rs.getObject(11));
                beneficiario.setId_padres((Integer)rs.getObject(12));
                beneficiario.setId_escu((Integer)rs.getObject(13));
                beneficiario.setId_socioec((Integer)rs.getObject(14));
                beneficiario.setBen_convivientes((Integer)rs.getObject(15));
            }
            sta.close();
            conexion.close();
            
               
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error EN sql Obtener Beneficiario:"+e.getMessage());
       } finally{
           return beneficiario;
       }
    }
    
}
