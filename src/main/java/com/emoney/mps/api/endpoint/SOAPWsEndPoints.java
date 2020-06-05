package com.emoney.mps.api.endpoint;
import com.emoney.mps.api.service.InquiryPendingTopUpService;
import com.emoney.mps.api.service.PendingTopUpService;
import com.emoney.mps.api.service.ReversePendingTopUpService;
import com.emoney.mps.api.topup.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SOAPWsEndPoints {
    private static final String NAMESPACE = "http://www.emoney.com/mps/api/topup";

    @Autowired
    private InquiryPendingTopUpService inquiryPendingTopUpService;

    @Autowired
    private PendingTopUpService pendingTopUpService;

    @Autowired
    private ReversePendingTopUpService reversePendingTopUpService;



    @PayloadRoot(namespace = NAMESPACE, localPart = "inquiryPendingTopUpRequest")
    @ResponsePayload
    public InquiryResult topUpInquiry(@RequestPayload InquiryPendingTopUpRequest request) {
        return inquiryPendingTopUpService.inquiryPendingTopUpReq(request);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "pendingTopUpRequest")
    @ResponsePayload
    public PaymentResult pendingTopUp(@RequestPayload PendingTopUpRequest request) {
        return pendingTopUpService.pendingTopUpReq(request);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "reversePendingTopUpRequest")
    @ResponsePayload
    public ReverseResult revTopUpInquiry(@RequestPayload ReversePendingTopUpRequest request) {
        return reversePendingTopUpService.reversePendingTopUpReq(request);
    }
}

