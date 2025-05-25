
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
        
        saveEmp("Rahmat", "Executive", 18000f);
        System.out.println("-----After Save-------");
        showEmp();
        
        updateEmp(6, "Sadiar", "Executive", 21000f);
        System.out.println("-------After Update-------");
        showEmp();
        
        deleteEmp(5);
        
        System.out.println("------After Delete-------");
        showEmp();
        
        
    }
    
    public static void saveEmp(String name,String designation,float salary){
    
        sql="insert into emp(name,designation,salary) values(?,?,?)";
        try {
            ps=cu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            
            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
            System.out.println("Employees table Data Save Successfully ! ");
            
        } catch (SQLException ex) {
            System.out.println("Employees  table Data Save Unsccessful ! ");
            Logger.getLogger(AnsCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public static void showEmp(){
    
        sql="select * from emp ";
        try {
            ps=cu.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String designation=rs.getString("designation");
                float salary=rs.getFloat("salary");
                
                System.out.println("ID : "+id+
                        ", Name : "+name+
                        ", Designation : "+designation+
                        ", Salary : "+salary);
            
            }
            ps.executeQuery();
            ps.close();
            cu.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AnsCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    public static void updateEmp(int id,String name, String designation,  float salary){
    sql="update emp set  name=?,designation=?,salary=? where id =? ";
    
        try {
            ps=cu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            ps.setInt(4, id);
            
            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
            
            System.out.println("Upadate Successfully ! ");
        } catch (SQLException ex) {
            Logger.getLogger(AnsCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    public static void deleteEmp(int id){
    
        sql="delete from emp where id=?";
        
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
