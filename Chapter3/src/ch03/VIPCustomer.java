package ch03;


public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentId;


    public VIPCustomer(){
//        super(); 자동으로 넣어줌.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer() call");
    }

    public String getAgentId(){
        return agentId;
    }
}

