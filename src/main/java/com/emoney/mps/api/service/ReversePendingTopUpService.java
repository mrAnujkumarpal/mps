package com.emoney.mps.api.service;

import com.emoney.mps.api.dao.TrueStatus;
import com.emoney.mps.api.topup.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReversePendingTopUpService {

    public ReverseResult reversePendingTopUpReq(ReversePendingTopUpRequest request) {

        ReverseResult rev = new ReverseResult();
        List<String> mismatchCriteriaList = rev.getCriteriaMismatch();
        if((request.getLanguage()).length() != 2) {
            mismatchCriteriaList.add("Language contains only two character.");
        }
        if( request.getCompanyCode() ==0) {
            mismatchCriteriaList.add("Company code is required.");
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
        if(request.getReference4() != null && ((request.getReference4()).length() < 10 )) {
            mismatchCriteriaList.add("Channel name (Reference4) contains only ten character.");
        }
        if((request.getReference5()).length()==0){
            mismatchCriteriaList.add("Bank card no (Reference5) is required.");
        }
        if (mismatchCriteriaList.size() > 0) {


        } else {

            TrueStatus ts=new TrueStatus();
            rev.setStatus(ts.okStatus());

            mismatchCriteriaList.clear();
        }
        return rev;

    }
}
