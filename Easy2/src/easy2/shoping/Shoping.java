
package easy2.shoping;

import java.util.Date;


public class Shoping {
    
    private String customerName;
    private String contactNumber;
    private String customerAddress;
    private Date buyDate;
    private double salePrice;
    private double totalPrice;

    public Shoping() {
    }

    public Shoping(String customerName, String contactNumber, String customerAddress, Date buyDate, double salePrice, double totalPrice) {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.customerAddress = customerAddress;
        this.buyDate = buyDate;
        this.salePrice = salePrice;
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    

    public String getCustomerDetails(){
    String detail = " ";
    
    return detail;
    }
    
    
}
