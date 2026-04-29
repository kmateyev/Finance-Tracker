package com.kmateyev.fintrack.model.transaction;

import com.kmateyev.fintrack.model.category.CategoryData;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import com.kmateyev.fintrack.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class TransactionData {

    @NotNull
    private TransactionType transactionType;

    @NotNull
    @Positive
    private BigDecimal amount;

    @NotNull
    private CategoryData categoryData;

    @NotNull
    private LocalDate transactionDate;

    private String description;
}
