package com.emoney.mps.api.service;

import com.emoney.mps.api.dao.TrueStatus;
import com.emoney.mps.api.topup.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PendingTopUpService {
    public PaymentResult pendingTopUpReq(PendingTopUpRequest request) {

        PaymentResult paymentResult = new PaymentResult();
        List<String> mismatchCriteriaList = paymentResult.getCriteriaMismatch();


        if((request.getLanguage()).length() != 2) {
            mismatchCriteriaList.add("Language contains only two character.");
        }
        if( request.getCompanyCode() == 0 ) {
            mismatchCriteriaList.add("Company code is required.");
        }
        //Integer.toString(num).length()
        if((Integer.toString(request.getCompanyCode()).length()) != 4) {
            mismatchCriteriaList.add("Company code contains only four digit.");
        }
        if((request.getChannelID()).length()==0) {
            mismatchCriteriaList.add("Channel ID is required. ");
        }
        if((request.getChannelID()).length()==0) {
            mismatchCriteriaList.add("Channel ID is required. ");
        }
        if((request.getChannelID()).length() > 1) {
            mismatchCriteriaList.add("Channel ID is not correct.");
        }
        if((request.getBillKey1()).length()==0) {
            mismatchCriteriaList.add("Prepaid card number (BillKey1) is required. ");
        }
        if(request.getBillKey1() != null && (request.getBillKey1()).length() !=16) {
            mismatchCriteriaList.add("Prepaid card number length (BillKey1) contains 16 characters");
        }
        if((request.getBillKey2()).length()==0){
            mismatchCriteriaList.add("Amount (BillKey2) is required. ");
        }
        if(request.getPaymentAmount() ==0){
            mismatchCriteriaList.add("Payment amount is required. ");
        }
        if((request.getCurrency()).length()==0){
            mismatchCriteriaList.add("Currency is required.");
        }
        if((request.getTerminalID()).length()==0){
            mismatchCriteriaList.add("Transaction is required.");
        }
        if((request.getPaidBills()).length() <= 1){
            mismatchCriteriaList.add("Paid bills is required.");
        }
        if((request.getReference1()).length()==0){
            mismatchCriteriaList.add("Host receipt number (Reference1) is required.");
        }
        if((request.getReference2()).length()==0){
            mismatchCriteriaList.add("ATM id (Reference2)  is required.");
        }
        if((request.getReference3()).length()==0){
            mismatchCriteriaList.add("SOA terminal id (Reference3) is required.");
        }
        if(request.getReference4() != null && ((request.getReference4()).length() < 10 )) {
            mismatchCriteriaList.add("Channel name (Reference4) contains only ten character.");
        }
        if((request.getReference5()).length()==0){
            mismatchCriteriaList.add("Bank card no (Reference5) is required.");
        }
        if (mismatchCriteriaList.size() > 0) {


        } else {

            paymentResult.setBillInfo1("");
            paymentResult.setBillInfo2("");
            paymentResult.setBillInfo3("");
            paymentResult.setBillInfo4("");
            paymentResult.setBillInfo5("");
            paymentResult.setBillInfo6("");
            paymentResult.setBillInfo7("");
            paymentResult.setBillInfo8("");
            paymentResult.setBillInfo9("");
            paymentResult.setBillInfo10("");
            paymentResult.setBillInfo11("");

            TrueStatus ts=new TrueStatus();

            paymentResult.setStatus(ts.okStatus());
            mismatchCriteriaList.clear();
        }
        return paymentResult;

    }
}
