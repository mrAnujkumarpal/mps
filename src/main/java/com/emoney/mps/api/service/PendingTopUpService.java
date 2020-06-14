package com.emoney.mps.api.service;

import com.emoney.mps.api.dao.SuccessStatus;
import com.emoney.mps.api.service.validate.ValidationWS;
import com.emoney.mps.api.topup.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PendingTopUpService extends ValidationWS {
    public PaymentResult pendingTopUpReq(PendingTopUpRequest req) {


        PaymentResult paymentResult = new PaymentResult();
        List<String> mismatchCriteriaList = paymentResult.getCriteriaMismatch();

        PendingTopUpRequest request=trimSoapPendingReq(req);

        if(request.getLanguage()== null) {
            mismatchCriteriaList.add("Language is required.");
        }else {
            if ((request.getLanguage()).length() != 2) {
                mismatchCriteriaList.add("Language contains only two character.");
            }
        }
        if( request.getCompanyCode() == 0 ) {
            mismatchCriteriaList.add("Company code is required.");
        }else{
            if((Integer.toString(request.getCompanyCode()).length()) != 4) {
                mismatchCriteriaList.add("Company code contains only four digit.");
            }
        }
        if(request.getTrxDateTime()==null){
            mismatchCriteriaList.add("Transaction date time is required.");
        }else{
            if (!(isValidDate(request.getTrxDateTime()))) {
                mismatchCriteriaList.add("Transaction date time in invalid format.");
            }
        }
        if(request.getTransmissionDateTime()==null){
            mismatchCriteriaList.add("Transmission date time  is required.");
        }else {
            if(!(isValidDate(request.getTransmissionDateTime()))){
                mismatchCriteriaList.add("Transmission date time in invalid format.");
            }
        }
        if((request.getChannelID()).length()==0) {
            mismatchCriteriaList.add("Channel ID is required. ");
        }else {
            if ((request.getChannelID()).length() != 1) {
                mismatchCriteriaList.add("Channel ID is not correct.");
            }
        }
        if((request.getBillKey1()).length()==0) {
            mismatchCriteriaList.add("Prepaid card number (BillKey1) is required. ");
        }
        if(request.getBillKey1() != null && (request.getBillKey1()).length() !=16) {
            mismatchCriteriaList.add("Prepaid card number length (BillKey1) contains 16 characters");
        }

        if((request.getBillKey2()).length()==0){
            mismatchCriteriaList.add("Amount (BillKey2) is required. ");
        }else{
            if(!(isNumericOnly(request.getBillKey2()))){
                mismatchCriteriaList.add("Amount (BillKey2) can not allow decimal cent or character.");
            }
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
        if(request.getReference4() == null ) {
            mismatchCriteriaList.add("Channel name (Reference4) is required.");
        }
        if((request.getReference4()).length() > 10 ) {
            mismatchCriteriaList.add("Channel name (Reference4) contains max ten character.");
        }
        if((request.getReference4()).length() > 0 && (request.getReference4()).length() <= 10 ) {
            if(isContainSpecialChar(request.getReference4())){
                mismatchCriteriaList.add("Channel name (Reference4) con not contain special character.");
            }
        }
        if((request.getReference5()).length()==0){
            mismatchCriteriaList.add("Bank card no (Reference5) is required.");
        }
        if((request.getReference6()).length()!=0) {
            if (!(isNumericOnly(request.getReference6()))) {
                mismatchCriteriaList.add("Character not allowed in bank account no.");
            }
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

            SuccessStatus ts=new SuccessStatus();

            paymentResult.setStatus(ts.okStatus());
            mismatchCriteriaList.clear();
        }
        return paymentResult;

    }


    private PendingTopUpRequest trimSoapPendingReq (PendingTopUpRequest request){
        PendingTopUpRequest req=new PendingTopUpRequest();

        req.setLanguage(request.getLanguage().trim());
        req.setTrxDateTime(request.getTrxDateTime());
        req.setTransmissionDateTime(request.getTransmissionDateTime());
        req.setCompanyCode(request.getCompanyCode());
        req.setChannelID(request.getChannelID().trim());
        req.setTerminalID(request.getTerminalID().trim());
        req.setPaymentAmount(request.getPaymentAmount());
        req.setPaidBills(request.getPaidBills().trim());
        req.setCurrency(request.getCurrency().trim());
        req.setTransactionId(request.getTransactionId().trim());
        req.setBillKey1(request.getBillKey1().trim());
        req.setBillKey2(request.getBillKey2().trim());
        req.setBillKey3(request.getBillKey3().trim());
        req.setReference1(request.getReference1().trim());
        req.setReference2(request.getReference2().trim());
        req.setReference3(request.getReference3().trim());
        req.setReference4(request.getReference4().trim());
        req.setReference5(request.getReference5().trim());
        req.setReference6(request.getReference6().trim());



        return req;
    }
}
