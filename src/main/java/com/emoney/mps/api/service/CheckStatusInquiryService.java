package com.emoney.mps.api.service;

import com.emoney.mps.api.dao.SuccessStatus;
import com.emoney.mps.api.service.validate.ValidationWS;
import com.emoney.mps.api.topup.CheckStatusInquiryRequest;
import com.emoney.mps.api.topup.CheckStatusResp;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CheckStatusInquiryService  extends ValidationWS {

    public CheckStatusResp ckStatusInquiryReq(CheckStatusInquiryRequest req){

        CheckStatusResp resp = new CheckStatusResp();

        List <String> mismatchCriteriaList = resp.getCriteriaMismatch();
        CheckStatusInquiryRequest request= trimCkStatusReq(req);

        if((request.getCan()).length()==0) {
            mismatchCriteriaList.add("Card number is required.");
        }else  if((request.getCan()).length() != 16) {
            mismatchCriteriaList.add("Card number contains 16 characters only.");
        }else  if(!(isNumericOnly(request.getCan()))){
            mismatchCriteriaList.add("Card number contains numeric characters only.");
        } else  if(isContainSpecialChar(request.getCan())){
            mismatchCriteriaList.add("Card number can not allow special characters.");
        }
        if(request.getTrxDateTime()==null){
            mismatchCriteriaList.add("Transaction date time is required.");
        }else{
            if (!(isValidDate(request.getTrxDateTime()))) {
                mismatchCriteriaList.add("Transaction date time in invalid format.");
            }
        }

        if(request.getAmount() == 0){
            mismatchCriteriaList.add("Amount is required.");
        }

        if (mismatchCriteriaList.size() > 0) {


        } else {

            resp.setCan(request.getCan());
            resp.setAmount(request.getAmount());
            resp.setTrxDateTime(request.getTrxDateTime());
            resp.setCounterdata(request.getCounterdata());
            SuccessStatus ts=new SuccessStatus();

            resp.setStatus(ts.okStatus());
            mismatchCriteriaList.clear();
        }

        return  resp;
    }

    private CheckStatusInquiryRequest trimCkStatusReq(CheckStatusInquiryRequest request) {
        CheckStatusInquiryRequest req=new CheckStatusInquiryRequest();

        req.setCan((request.getCan()).trim()) ;
        req.setAmount(request.getAmount());
        req.setTrxDateTime(request.getTrxDateTime());
        req.setCounterdata((request.getCounterdata()).trim());

        return  req;
    }
}
