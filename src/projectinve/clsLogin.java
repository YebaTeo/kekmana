/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectinve;

import javax.swing.JOptionPane;

/**
 *
 * @author ktjan
 */
public class clsLogin extends Koneksi{
    String mUsername = "admin";
    String mPassword = "admin";
    
    public void Masuk()
    {
        try{
            sql = "SELECT * FROM tbllogin WHERE Username = ? AND Password = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, mUsername);
            pst.setString(2, String.valueOf(mPassword));
            rs = pst.executeQuery();
            if(rs.next()){
                FHome home = new FHome();
                home.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login berhasil");
            }else {
                JOptionPane.showMessageDialog(null, "Login gagal");                                
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
