package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudDetectionController {
    @PutMapping(
            value = "/fraudcheck",
            consumes = "application/vnd.fraud.v1+json",
            produces = "application/vnd.fraud.v1+json"
    )
    public ResponseEntity<FraudCheckResponse> putFraudCheck(@RequestBody FraudCheckRequest request) {
        FraudCheckResponse response = new FraudCheckResponse(FraudCheckResponse.FraudCheckStatus.FRAUD, "Amount too high");
        return ResponseEntity.ok(response);
    }
}
