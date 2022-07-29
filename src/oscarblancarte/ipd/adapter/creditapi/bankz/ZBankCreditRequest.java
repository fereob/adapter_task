package oscarblancarte.ipd.adapter.creditapi.bankz;

import oscarblancarte.ipd.adapter.creditapi.banky.*;

/**
 * @author Oscar Javier Blancarte Iturralde
 * @see http://wwww.oscarblancarteblog.com
 */
public class ZBankCreditRequest {
    
    private String customer;
    private double amount;

    public void setCustomer(String customer){
        this.customer = customer;
    }
    
    public String getCustomer(){
        return customer;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public double getAmount(){
        return amount;
    }
}