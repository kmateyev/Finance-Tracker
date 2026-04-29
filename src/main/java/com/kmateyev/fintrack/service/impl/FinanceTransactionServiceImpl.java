package com.kmateyev.fintrack.service.impl;

import com.kmateyev.fintrack.entity.Category;
import com.kmateyev.fintrack.entity.FinanceTransaction;
import com.kmateyev.fintrack.exception.CategoryNotFoundException;
import com.kmateyev.fintrack.model.BaseResponse;
import com.kmateyev.fintrack.model.transaction.TransactionData;
import com.kmateyev.fintrack.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.kmateyev.fintrack.repository.FinanceTransactionRepository;
import com.kmateyev.fintrack.service.FinanceTransactionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.kmateyev.fintrack.constant.Constant.CATEGORY_NOT_FOUND;
import static com.kmateyev.fintrack.constant.Constant.CREATED_MESSAGE;

@Slf4j
@Service
@RequiredArgsConstructor
public class FinanceTransactionServiceImpl implements FinanceTransactionService {

    private final FinanceTransactionRepository transactionRepository;
    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public BaseResponse createTransaction(TransactionData transaction) {
        FinanceTransaction saved = transactionRepository.save(mapTransaction(transaction));
        log.info("Created transaction with id {}", saved.getId());
        return BaseResponse.builder().code(201).message(CREATED_MESSAGE).build();
    }

    private FinanceTransaction mapTransaction(TransactionData transaction) {
        FinanceTransaction financeTransaction = new FinanceTransaction();
        financeTransaction.setType(transaction.getTransactionType());
        financeTransaction.setAmount(transaction.getAmount());
        financeTransaction.setCategory(resolveCategory(transaction.getCategoryData().getName()));
        financeTransaction.setTransactionDate(transaction.getTransactionDate());
        financeTransaction.setDescription(transaction.getDescription());
        return financeTransaction;
    }

    private Category resolveCategory(String categoryName) {
        return categoryRepository.findByName(categoryName)
                .orElseThrow(() -> new CategoryNotFoundException(CATEGORY_NOT_FOUND));
    }
}