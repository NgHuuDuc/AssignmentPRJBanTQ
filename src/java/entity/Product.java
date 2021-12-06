/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Product {
    private int ProductID;
    private String Name;
    private String BrandID;
    private String Category;
    private int Price;
    private int Quantity;
    private int Size;
    private String Color;
    private Date DateAdd;
    private String Description;
    private String Image;

    public Product() {
    }

    public Product(int ProductID, String Name, String BrandID, String Category, int Price, int Quantity, int Size, String Color, Date DateAdd, String Description, String Image) {
        this.ProductID = ProductID;
        this.Name = Name;
        this.BrandID = BrandID;
        this.Category = Category;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Size = Size;
        this.Color = Color;
        this.DateAdd = DateAdd;
        this.Description = Description;
        this.Image = Image;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrandID() {
        return BrandID;
    }

    public void setBrandID(String BrandID) {
        this.BrandID = BrandID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Date getDateAdd() {
        return DateAdd;
    }

    public void setDateAdd(Date DateAdd) {
        this.DateAdd = DateAdd;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductID=" + ProductID + ", Name=" + Name + ", BrandID=" + BrandID + ", Category=" + Category + ", Price=" + Price + ", Quantity=" + Quantity + ", Size=" + Size + ", Color=" + Color + ", DateAdd=" + DateAdd + ", Description=" + Description + ", Image=" + Image + '}';
    }
    
    
         
}
