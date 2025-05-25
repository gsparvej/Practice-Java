
package anscrud;

import anscrud.util.CrudUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class AnsCRUD {

    public static CrudUtil cu=new CrudUtil();
    public static PreparedStatement ps;
    public static String sql;
    
    
    public static void main(String[] args) {
        
        saveTourist("Rahmat", "Barishal", "Ranggamati", 6500f);
        System.out.println("-----After Save-------");
        showTourist();
        
        updateTourist(4, "Parvej", "Potuakhali", "Sylhet", 4900f);
        System.out.println("-------After Update-------");
        showTourist();
        
        deleteTourist(1);
        System.out.println("------After Delete-------");
        showTourist();
        
        
    }
    
    public static void saveTourist(String name,String address,String tourPlace,float totalCost){
    
        sql="insert into travel(name,address,tourPlace,totalCost) values(?,?,?,?)";
        try {
            ps=cu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, tourPlace);
            ps.setFloat(4, totalCost);
            
            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
            System.out.println("Travel's table Data Save Successfully ! ");
            
        } catch (SQLException ex) {
            System.out.println("Travel's table Data Save Unsccessful ! ");
            Logger.getLogger(AnsCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public static void showTourist(){
    
        sql="select * from travel ";
        try {
            ps=cu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String address=rs.getString("address");
                String tourPlace=rs.getString("tourPlace");
                float totalCost=rs.getFloat("totalCost");
                
                System.out.println("ID : "+id+
                        " Name : "+name+
                        " Address : "+address+
                        " Tour Place : "+tourPlace+
                        " Cost : "+totalCost);
            
            }
            ps.executeQuery();
            ps.close();
            cu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AnsCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    public static void updateTourist(int id,String name, String address, String tourPlace, float totalCost){
    sql="update travel set  name=?,address=?,tourPlace=? ,totalCost=? where id =? ";
    
        try {
            ps=cu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, tourPlace);
            ps.setFloat(4, totalCost);
            ps.setInt(5, id);
            
            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
            
            System.out.println("Upadate Successfully ! ");
        } catch (SQLException ex) {
            Logger.getLogger(AnsCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    public static void deleteTourist(int id){
    
        sql="delete from travel where id=?";
        
        try {
            ps=cu.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
            System.out.println("Delete Successfully ! ");
        } catch (SQLException ex) {
            Logger.getLogger(AnsCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}
