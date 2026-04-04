package com.kmateyev.fintrack.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryData {

    private Long id;

    @NotBlank
    private String name;
}
