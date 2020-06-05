package com.emoney.mps.api.service;

import com.emoney.mps.api.topup.InquiryPendingTopUpRequest;
import com.emoney.mps.api.topup.InquiryResult;
import com.emoney.mps.api.topup.ReversePendingTopUpRequest;
import com.emoney.mps.api.topup.ReverseResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReversePendingTopUpService {

    public ReverseResult reversePendingTopUpReq(ReversePendingTopUpRequest request) {

        ReverseResult rev = new ReverseResult();
        List<String> mismatchCriteriaList = rev.getCriteriaMismatch();

        if (!((request.getLanguage()).length() != 2)) {
            mismatchCriteriaList.add("Length language contains only two character.");
        }
        if (!((request.getChannelID()).length() > 1)) {
            mismatchCriteriaList.add("Channel is not correct.");
        }
        if (!(request.getBillKey1() != null)) {
            mismatchCriteriaList.add("Card number is required. ");
        }
        if (!(request.getBillKey1() != null && (request.getBillKey1()).length() !=16)) {
            mismatchCriteriaList.add("Card number length is not correct. ");
        }
        if (mismatchCriteriaList.size() > 0) {

            rev.setIsError(false);
        } else {

            rev.setIsError(true);
            mismatchCriteriaList.clear();
        }
        return rev;

    }
}
