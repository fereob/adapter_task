package oscarblancarte.ipd.adapter.impl;

import oscarblancarte.ipd.adapter.creditapi.bankz.*;

/**
 * @author Oscar Javier Blancarte Iturralde
 * @see http://wwww.oscarblancarteblog.com
 */
public class ZBankCreditAdapter implements IBankAdapter{

    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        ZBankCreditRequest zrequest = new ZBankCreditRequest();
        zrequest.setCustomer(request.getCustomer());
        zrequest.setAmount(request.getAmount());

        ZBankCreditApi api = new ZBankCreditApi();
        ZBankCreditResponse zresponse = api.sendCreditRequest(zrequest);

        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(zresponse.getApproved());
        return response;
    }
}