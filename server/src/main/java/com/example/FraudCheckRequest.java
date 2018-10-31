package com.example;

import java.util.Objects;

public class FraudCheckRequest {
    private final String clientId;
    private final int loadAmount;

    public FraudCheckRequest() {
        clientId = null;
        loadAmount = -1;
    }

    public FraudCheckRequest(String clientId, int loadAmount) {
        this.clientId = clientId;
        this.loadAmount = loadAmount;
    }

    public String getClientId() {
        return clientId;
    }

    public int getLoadAmount() {
        return loadAmount;
    }

    @Override
    public String toString() {
        return "FraudCheckRequest{" +
                "clientId='" + clientId + '\'' +
                ", loadAmount=" + loadAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudCheckRequest that = (FraudCheckRequest) o;
        return loadAmount == that.loadAmount &&
                Objects.equals(clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, loadAmount);
    }
}
