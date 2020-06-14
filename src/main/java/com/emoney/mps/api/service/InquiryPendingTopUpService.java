package com.emoney.mps.api.service;


import com.emoney.mps.api.dao.SuccessStatus;
import com.emoney.mps.api.service.validate.ValidationWS;
import com.emoney.mps.api.topup.BillDetail;
import com.emoney.mps.api.topup.InquiryResult;
import com.emoney.mps.api.topup.InquiryPendingTopUpRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InquiryPendingTopUpService extends ValidationWS{




    public InquiryResult inquiryPendingTopUpReq(InquiryPendingTopUpRequest req) {

        InquiryResult inquiry = new InquiryResult();
        List<String> mismatchCriteriaList = inquiry.getCriteriaMismatch();

        InquiryPendingTopUpRequest request=trimSoapInquiryReq(req);

        if((request.getLanguage()).length()==0) {
            mismatchCriteriaList.add("Language is required.");
        }else {
            if ((request.getLanguage()).length() != 2) {
                mismatchCriteriaList.add("Language contains only two character.");
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
        if(request.getCompanyCode() == 0) {
            mismatchCriteriaList.add("Company code is required.");
        }else {
            if ((Integer.toString(request.getCompanyCode()).length()) != 4) {
                mismatchCriteriaList.add("Company code contains only four digit.");
            }
        }
        if((request.getChannelID()).length()==0) {
            mismatchCriteriaList.add("Channel ID is required.");
        }else {
            if ((request.getChannelID()).length() != 1) {
                mismatchCriteriaList.add("Channel ID is not correct.");
            }
        }
        if((request.getBillKey1()).length()==0) {
            mismatchCriteriaList.add("Prepaid card number (BillKey1) is required.");
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

        if((request.getReference6()).length()==0){
            mismatchCriteriaList.add("Bank account no (Reference6) is required.");
        }else{
                if(!(isNumericOnly(request.getReference6()))){
                mismatchCriteriaList.add("Character not allowed in bank account no.");
            }
        }


        if(mismatchCriteriaList.size() > 0) {


        } else {
            SuccessStatus ss=new SuccessStatus();

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
            inquiry.setStatus(ss.okStatus());


        }
        return inquiry;

    }

    public static InquiryPendingTopUpRequest trimSoapInquiryReq(InquiryPendingTopUpRequest request){

        InquiryPendingTopUpRequest req=new InquiryPendingTopUpRequest();
        req.setLanguage(request.getLanguage().trim());
        req.setTrxDateTime(request.getTrxDateTime());
        req.setTransmissionDateTime(request.getTransmissionDateTime());
        req.setCompanyCode(request.getCompanyCode());
        req.setChannelID(request.getChannelID().trim());
        req.setTerminalID(request.getTerminalID().trim());
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
