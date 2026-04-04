package com.kmateyev.fintrack.repository;

import com.kmateyev.fintrack.entity.FinanceTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FinanceTransactionRepository extends JpaRepository<FinanceTransaction, Long> {

    List<FinanceTransaction> findByTransactionDateBetween(LocalDate from, LocalDate to);

    List<FinanceTransaction> findByCategoryId(Long categoryId);
}