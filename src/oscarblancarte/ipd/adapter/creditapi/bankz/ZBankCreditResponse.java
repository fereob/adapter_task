package oscarblancarte.ipd.adapter.creditapi.bankz;

/**
 * @author Oscar Javier Blancarte Iturralde
 * @see http://wwww.oscarblancarteblog.com
 */
public class ZBankCreditResponse {
    public boolean approved;
    
    public void setApproved(boolean approved){
        this.approved = approved;
    }
    
    public boolean getApproved(){
        return approved;
    }
}