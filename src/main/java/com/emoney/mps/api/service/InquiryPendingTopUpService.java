package com.emoney.mps.api.service;


import com.emoney.mps.api.dao.SuccessStatus;
import com.emoney.mps.api.topup.BillDetail;
import com.emoney.mps.api.topup.InquiryResult;
import com.emoney.mps.api.topup.InquiryPendingTopUpRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryPendingTopUpService {

    public InquiryResult inquiryPendingTopUpReq(InquiryPendingTopUpRequest request) {

        InquiryResult inquiry = new InquiryResult();
        List<String> mismatchCriteriaList = inquiry.getCriteriaMismatch();

        if((request.getLanguage()).length() != 2) {
            mismatchCriteriaList.add("Language contains only two character.");
        }
        if( request.getCompanyCode() == 0) {
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
        if((request.getReference6()).length()==0){
            mismatchCriteriaList.add("Bank account no (Reference6) is required.");
        }
        if(mismatchCriteriaList.size() > 0) {


        } else {
            SuccessStatus ts=new SuccessStatus();

            BillDetail billDetail=new BillDetail();
            billDetail.setBillCode("01");
            billDetail.setBillName("TOPUP PREPAID");
            billDetail.setBillShortName("6032981000045757");
            billDetail.setBillAmount("1");




            inquiry.setCurrency("360");
            inquiry.setBillInfo1("");
            inquiry.setBillInfo2("");
            inquiry.setBillInfo3("");
            inquiry.setBillInfo4("");
            inquiry.setBillInfo5("");
            inquiry.setBillInfo6("");
            inquiry.setBillInfo7("");
            inquiry.setBillInfo8("");

            inquiry.setBillDetails(billDetail);
            inquiry.setStatus(ts.okStatus());


        }
        return inquiry;

    }
}
