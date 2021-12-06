package dao;

import static com.oracle.webservices.api.databinding.DatabindingModeFeature.ID;
import context.DBContext;
import entity.Brand;
import entity.Customer;
import entity.Product;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT Top(12) * FROM Product WHERE Price > 2700000 ORDER BY RAND()";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> searchByName(String name) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product WHERE [Name] LIKE ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> getAllManageProducts() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
        }

        return list;
    }
    
    public List<Customer> getAllManageAcc() {
        List<Customer> list = new ArrayList<>();
        String query = "SELECT * FROM Customer";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
        }

        return list;
    }
    
    public List<Brand> getAllManageBrand() {
        List<Brand> list = new ArrayList<>();
        String query = "SELECT * FROM Brand";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Brand(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }

        return list;
    }
    
    public void DeleteBrand(String ID) {
        String query = "DELETE FROM Brand WHERE ID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void AddBrand(String ID, String Name) {
        String query = "INSERT INTO Brand VALUES (?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            ps.setString(2, Name);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    public void UpdateBrand(String ID, String Name) {
        String query = "UPDATE Brand SET Name = ? WHERE ID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, Name);
            ps.setString(2, ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void DeleteProduct(String ID) {
        String query = "DELETE FROM Product WHERE ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void UpdateAcc(String ID, String Name) {
        String query = "UPDATE Brand SET Name = ? WHERE ID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, Name);
            ps.setString(2, ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void DeleteAcc(String ID) {
        String query = "DELETE FROM Customer WHERE CusID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void AddProduct(String ID, String Name, String BrandID, String Category, String Price, String Quantity, String Size, String Color, String DateAdd, String Description, String Image) {
        String query = "INSERT INTO Product VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            ps.setString(2, Name);
            ps.setString(3, BrandID);
            ps.setString(4, Category);
            ps.setString(5, Price);
            ps.setString(6, Quantity);
            ps.setString(7, Size);
            ps.setString(8, Color);
            ps.setString(9, DateAdd);
            ps.setString(10, Description);
            ps.setString(11, Image);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void UpdateProduct(String ID, String Name, String BrandID, String Category, String Price, String Quantity, String Size, String Color, String DateAdd, String Description, String Image) {
        String query = "UPDATE Product SET Name = ?, BrandID = ?, Category = ?, Price = ?, Quantity = ?, Size = ?, Color = ?, [DateAdd] = ?, [Description] = ?, [Image] = ? WHERE ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, Name);
            ps.setString(2, BrandID);
            ps.setString(3, Category);
            ps.setString(4, Price);
            ps.setString(5, Quantity);
            ps.setString(6, Size);
            ps.setString(7, Color);
            ps.setString(8, DateAdd);
            ps.setString(9, Description);
            ps.setString(10, Image);
            ps.setString(11, ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void UpdateAcc(String ID, String UserName, String Password, String Email, String Phone) {
        String query = "UPDATE Customer SET UserName = ?, Password = ?, Email = ?, Phone = ? WHERE CusID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, UserName);
            ps.setString(2, Password);
            ps.setString(3, Email);
            ps.setString(4, Phone);
            ps.setString(5, ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Product> getTop10Products() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT Top(10) * FROM Product";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> getGiaySanTuNhien() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT Top(6) * FROM Product WHERE Category like 'FG' and Price between 4000000 and 6000000 ORDER BY Price ASC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> getGiaySanNhanTao() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT Top(6) * FROM Product WHERE Category like 'TF' and Price between 300000 and 1500000 ORDER BY Price DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public Customer login(String Email, String Password) {
        String query = "SELECT * FROM Customer WHERE Email = ? AND Password = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, Email);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Customer checkAccountExist(String Email) {
        String query = "SELECT * FROM Customer WHERE Email = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, Email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void Register(String UserName, String Password, String Email, String Phone) {
        String query = "INSERT INTO Customer VALUES (?,?,?,?,0,1)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, UserName);
            ps.setString(2, Password);
            ps.setString(3, Email);
            ps.setString(4, Phone);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Product> getProductByBrandID(String ID) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Product WHERE BrandID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Brand> getAllBrand() {
        List<Brand> list = new ArrayList<>();
        String query = "SELECT * FROM Brand";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Brand(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }

        return list;
    }
    
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Brand> list = new ArrayList<>();
        for (Brand o : list) {
            System.out.println(o);
        }
    }

    public Product getProductbyID(String ID) {
        String query = "SELECT * FROM Product WHERE ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getString(10),
                        rs.getString(11));
            }
        } catch (Exception e) {
        }

        return null;
    }
    
    public Customer getAccbyID(String ID) {
        String query = "SELECT * FROM Customer WHERE CusID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
        }

        return null;
    }
    
    public Brand getBrandbyID(String ID) {
        String query = "SELECT * FROM Brand WHERE ID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Brand(rs.getInt(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }

        return null;
    }

    //dem so luong san pham trong db
    public int getTotalProduct() {
        String query = "SELECT COUNT(*) FROM Product";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareCall(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        int count = dao.getTotalProduct();
//        System.out.println(count);
//    }
}
//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        Product p = dao.getProductbyID("1");
//        System.out.println(p);
//    }
//}
