package com.kmateyev.fintrack.controller;

import com.kmateyev.fintrack.enums.TransactionType;
import com.kmateyev.fintrack.model.BaseResponse;
import com.kmateyev.fintrack.model.transaction.TransactionData;
import com.kmateyev.fintrack.service.FinanceTransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/finance-tracker")
public class MainController {

    private final FinanceTransactionService financeTransactionService;

    @PostMapping("/create/")
    public ResponseEntity<BaseResponse> create(@RequestBody @Valid TransactionData transaction) {
        var response = financeTransactionService.createTransaction(transaction);
        return ResponseEntity.status(201).body(response);
    }
}
