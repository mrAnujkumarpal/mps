package com.emoney.mps.api.dao;

import com.emoney.mps.api.topup.Status;

public class SuccessStatus {

    public Status okStatus(){
        Status status = new Status();
        status.setErrorCode("00");
        status.setIsError(false);
        status.setStatusDescription("No error");

        return status;
    }
}
