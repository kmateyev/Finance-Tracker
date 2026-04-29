package com.kmateyev.fintrack.model.category;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryData {

    @NotBlank
    private String name;
}
