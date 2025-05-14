
package onlineshoppingsystemusinginheritance2.shopping;


public class ServiceClass extends Product2{
    Product2[] product;

    public ServiceClass() {
    }

    public ServiceClass(Product2[] product) {
        this.product = product;
    }


    
    public String calculateTotal(){
    double total=0;
    double bonus=0;
    for(int i=0;i<product.length;i++){
    
        total+=product[i].getProductPrice();
    
    }
    
    if(total>30000){
    
        bonus=total-total*0.08;
        
    }
    
    else if(total>50000){
    bonus=total-total*0.15;
        
    
    }
    
    return "Total : "+total+"\nAfter discount you must pay : "+bonus;
    }
    
    public void getDisplayInfo(){
    for(Product2 p:product){
    
        System.out.println("--------------------------");
        System.out.println(" "+p.getDetails());
    }
    
    
    }
}
