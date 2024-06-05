class Customer{
    private String custNo;
    private String custName;
    private String category;

   

    public String getcustNo(){
        return custNo;
    }

    public String getcustName(){
        return custName;
    }

    public String getcategory(){
        return category;
    }

    public Customer(String custNo,String custName,String category){
        this.custNo=custNo;
        this.custName=custName;
        this.category=category;
    }
}


public class practiceset6 {
    public static void main(String[] args) {
        Customer c1= new Customer("C", "Rish", "Gold");
        
        
        System.out.println(c1.getcustNo());
        System.out.println(c1.getcustName());
        System.out.println(c1.getcategory());
    }
}
