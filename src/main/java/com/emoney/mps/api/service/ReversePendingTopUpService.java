package com.emoney.mps.api.service;

import com.emoney.mps.api.dao.SuccessStatus;
import com.emoney.mps.api.service.validate.ValidationWS;
import com.emoney.mps.api.topup.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReversePendingTopUpService extends ValidationWS {

    public ReverseResult reversePendingTopUpReq(ReversePendingTopUpRequest req) {


        ReverseResult rev = new ReverseResult();
        List<String> mismatchCriteriaList = rev.getCriteriaMismatch();

        ReversePendingTopUpRequest request=trimRevPendingSoapReq(req);


        if((request.getLanguage()).length()==0) {
            mismatchCriteriaList.add("Language is required.");
        }else {
            if ((request.getLanguage()).length() != 2) {
                mismatchCriteriaList.add("Language contains only two character.");
            }
        }
        if( request.getCompanyCode() == 0) {
            mismatchCriteriaList.add("Company code is required.");
        }else {
            if ((Integer.toString(request.getCompanyCode()).length()) != 4) {
                mismatchCriteriaList.add("Company code contains only four digit.");
            }
        }

        if(request.getTrxDateTime()==null){
            mismatchCriteriaList.add("Transaction date time  is required.");
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

        if(request.getOrigTrxDateTime() ==null){
            mismatchCriteriaList.add("Orig transaction date time  is required.");
        }else{
            if (!(isValidDate(request.getOrigTrxDateTime()))) {
                mismatchCriteriaList.add("Orig transaction date time in invalid format.");
            }
        }
        if(request.getOrigTransmissionDateTime()==null){
            mismatchCriteriaList.add("Orig transmission date time  is required.");
        }else {
            if(!(isValidDate(request.getOrigTransmissionDateTime()))){
                mismatchCriteriaList.add("Orig transmission date time in invalid format.");
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
        }else {
            if((request.getBillKey1()).length() != 16) {
                mismatchCriteriaList.add("Prepaid card number length (BillKey1) contains 16 characters");
            }
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
        if((request.getReference1()).length()==0){
            mismatchCriteriaList.add("Host receipt number (Reference1) is required.");
        }
        if((request.getReference2()).length()==0){
            mismatchCriteriaList.add("ATM id (Reference2)  is required.");
        }
        if((request.getReference3()).length()==0){
            mismatchCriteriaList.add("SOA terminal id (Reference3) is required.");
        }
        if((request.getReference4()).length()==0 ) {
            mismatchCriteriaList.add("Channel name (Reference4) is required.");
        }else {
            if((request.getReference4()).length() > 0 && (request.getReference4()).length() <= 10 ) {
                if(isContainSpecialChar(request.getReference4())){
                    mismatchCriteriaList.add("Channel name (Reference4) con not contain special character.");
                }
            }   else {
                mismatchCriteriaList.add("Channel name (Reference4) contains max ten character.");
            }
        }
        if((request.getReference5()).length()==0){
            mismatchCriteriaList.add("Bank card no (Reference5) is required.");
        }
        if((request.getReference6()).length()==0){
            mismatchCriteriaList.add("Bank account no (Reference6) is required.");
        }else{
            if(!(isNumericOnly(request.getReference6()))){
                mismatchCriteriaList.add("Character not allowed in bank account no.");
            }
        }
        if (mismatchCriteriaList.size() > 0) {


        } else {

            SuccessStatus ts=new SuccessStatus();
            rev.setStatus(ts.okStatus());

            mismatchCriteriaList.clear();
        }
        return rev;

    }

    private ReversePendingTopUpRequest trimRevPendingSoapReq(ReversePendingTopUpRequest request){
        ReversePendingTopUpRequest req=new ReversePendingTopUpRequest();

        req.setLanguage(request.getLanguage().trim());
        req.setTrxDateTime(request.getTrxDateTime());
        req.setTransmissionDateTime(request.getTransmissionDateTime());
        req.setOrigTrxDateTime(request.getOrigTrxDateTime());
        req.setOrigTransmissionDateTime(request.getOrigTransmissionDateTime());
        req.setChannelID(request.getChannelID().trim());
        req.setTerminalID(request.getTerminalID().trim());
        req.setCompanyCode(request.getCompanyCode());
        req.setCurrency(request.getCurrency().trim());
        req.setTransactionId(request.getTransactionId().trim());
        req.setPaymentAmount(request.getPaymentAmount());
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
