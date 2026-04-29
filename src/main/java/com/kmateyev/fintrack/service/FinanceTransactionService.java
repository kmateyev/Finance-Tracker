package com.kmateyev.fintrack.service;

import com.kmateyev.fintrack.model.BaseResponse;
import com.kmateyev.fintrack.model.transaction.TransactionData;

public interface FinanceTransactionService {

    BaseResponse createTransaction(TransactionData transaction);
}
