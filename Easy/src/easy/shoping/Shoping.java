
package easy.shoping;


public class Shoping {
 
    // super class 
    
    private String sProductName;
    private String sProductSize;
    private String sCustomerAddress;
    private String sCustomerContact;

    public Shoping() {
    }

    public Shoping(String sProductName, String sProductSize, String sCustomerAddress, String sCustomerContact) {
        this.sProductName = sProductName;
        this.sProductSize = sProductSize;
        this.sCustomerAddress = sCustomerAddress;
        this.sCustomerContact = sCustomerContact;
    }

    public String getsProductName() {
        return sProductName;
    }

    public void setsProductName(String sProductName) {
        this.sProductName = sProductName;
    }

    public String getsProductSize() {
        return sProductSize;
    }

    public void setsProductSize(String sProductSize) {
        this.sProductSize = sProductSize;
    }

    public String getsCustomerAddress() {
        return sCustomerAddress;
    }

    public void setsCustomerAddress(String sCustomerAddress) {
        this.sCustomerAddress = sCustomerAddress;
    }

    public String getsCustomerContact() {
        return sCustomerContact;
    }

    public void setsCustomerContact(String sCustomerContact) {
        this.sCustomerContact = sCustomerContact;
    }
    
    public String getDetails(){
//        String result =" ";
    

        return sProductSize;
    }
    public void getBothDetails(){
    
    
    
    }
    
}
