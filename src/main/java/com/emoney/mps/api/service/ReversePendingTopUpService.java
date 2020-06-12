package com.emoney.mps.api.service;

import com.emoney.mps.api.dao.SuccessStatus;
import com.emoney.mps.api.service.validate.ValidationWS;
import com.emoney.mps.api.topup.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReversePendingTopUpService {

    public ReverseResult reversePendingTopUpReq(ReversePendingTopUpRequest request) {
        ValidationWS validate=new ValidationWS();
        ReverseResult rev = new ReverseResult();
        List<String> mismatchCriteriaList = rev.getCriteriaMismatch();
        if((request.getLanguage()).length() != 2) {
            mismatchCriteriaList.add("Language contains only two character.");
        }
        if( request.getCompanyCode() ==0) {
            mismatchCriteriaList.add("Company code is required.");
        }

        if(request.getTrxDateTime()==null){
            mismatchCriteriaList.add("Transaction date time  is required.");
        }else{
            if (!(validate.isValidDate(request.getTrxDateTime()))) {
                mismatchCriteriaList.add("Transaction date time in invalid format.");
            }
        }
        if(request.getTransmissionDateTime()==null){
            mismatchCriteriaList.add("Transmission date time  is required.");
        }else {
            if(!(validate.isValidDate(request.getTransmissionDateTime()))){
                mismatchCriteriaList.add("Transmission date time in invalid format.");
            }
        }

        if(request.getOrigTrxDateTime() ==null){
            mismatchCriteriaList.add("Orig transaction date time  is required.");
        }else{
            if (!(validate.isValidDate(request.getOrigTrxDateTime()))) {
                mismatchCriteriaList.add("Orig transaction date time in invalid format.");
            }
        }
        if(request.getOrigTransmissionDateTime()==null){
            mismatchCriteriaList.add("Orig transmission date time  is required.");
        }else {
            if(!(validate.isValidDate(request.getOrigTransmissionDateTime()))){
                mismatchCriteriaList.add("Orig transmission date time in invalid format.");
            }
        }
        //Integer.toString(num).length()
        if((Integer.toString(request.getCompanyCode()).length()) != 4) {
            mismatchCriteriaList.add("Company code contains only four digit.");
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
        }else{
            if(!(validate.isNumericOnly(request.getBillKey2()))){
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
        if(request.getReference4() == null ) {
            mismatchCriteriaList.add("Channel name (Reference4) is required.");
        }
        if((request.getReference4()).length() > 10 ) {
            mismatchCriteriaList.add("Channel name (Reference4) contains max ten character.");
        }
        if((request.getReference4()).length() > 0 && (request.getReference4()).length() <= 10 ) {
            if(validate.isContainSpecialChar(request.getReference4())){
                mismatchCriteriaList.add("Channel name (Reference4) con not contain special character.");
            }
        }
        if((request.getReference5()).length()==0){
            mismatchCriteriaList.add("Bank card no (Reference5) is required.");
        }
        if (mismatchCriteriaList.size() > 0) {


        } else {

            SuccessStatus ts=new SuccessStatus();
            rev.setStatus(ts.okStatus());

            mismatchCriteriaList.clear();
        }
        return rev;

    }
}
