package com.kmateyev.fintrack.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.kmateyev.fintrack.repository.FinanceTransactionRepository;
import com.kmateyev.fintrack.service.FinanceTransactionService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FinanceTransactionServiceImpl implements FinanceTransactionService {

    private final FinanceTransactionRepository transactionRepository;


    @Override
    public void createTransaction() {

    }
}
