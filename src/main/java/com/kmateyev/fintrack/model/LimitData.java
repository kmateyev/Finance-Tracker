package com.kmateyev.fintrack.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class LimitData {

    private Long id;

    @NotNull
    private CategoryData categoryData;

    @NotNull
    @Positive
    private BigDecimal monthlyLimit;

    @NotNull
    @Min(1) @Max(12)
    private Integer month;

    @NotNull
    private Integer year;
}
