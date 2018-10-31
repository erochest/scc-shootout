package com.example;

import java.util.Objects;

public class FraudCheckResponse {
    public FraudCheckResponse(FraudCheckStatus fraudCheckStatus, String rejectionReason) {
        this.fraudCheckStatus = fraudCheckStatus;
        this.rejectionReason = rejectionReason;
    }

    public FraudCheckStatus getFraudCheckStatus() {
        return fraudCheckStatus;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudCheckResponse that = (FraudCheckResponse) o;
        return fraudCheckStatus == that.fraudCheckStatus &&
                Objects.equals(rejectionReason, that.rejectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fraudCheckStatus, rejectionReason);
    }

    @Override
    public String toString() {
        return "FraudCheckResponse{" +
                "fraudCheckStatus=" + fraudCheckStatus +
                ", rejectionReason='" + rejectionReason + '\'' +
                '}';
    }

    public enum FraudCheckStatus {
        NOT_FRAUD, FRAUD
    }

    private final FraudCheckStatus fraudCheckStatus;
    private final String rejectionReason;
}
