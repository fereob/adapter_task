package oscarblancarte.ipd.adapter.creditapi.bankz;

/**
 * @author Oscar Javier Blancarte Iturralde
 * @see http://wwww.oscarblancarteblog.com
 */
public class ZBankCreditApi{
    
    public ZBankCreditResponse sendCreditRequest(ZBankCreditRequest request) throws Exception{
        ZBankCreditResponse response = new ZBankCreditResponse();
        if(request.getAmount() < 3500){
            response.setApproved(true);
        } else {
            response.setApproved(false);
            throw new Exception("Request Rejected");
        }
        return response;
    }
}