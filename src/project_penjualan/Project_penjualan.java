/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_penjualan;

import com.View_penjualan.Login;
import com.View_penjualan.Menu_Barang;
import com.View_penjualan.Menu_JenisBarang;
import java.sql.SQLException;

/**
 *
 * @author Alifiyah
 */
public class Project_penjualan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException{
        // TODO code application logic here
       Login lg = new Login();
       lg.setLocationRelativeTo(null);
       lg.setVisible(true);
        
        
    }
    
}
