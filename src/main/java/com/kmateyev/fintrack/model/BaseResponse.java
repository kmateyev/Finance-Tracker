package com.kmateyev.fintrack.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BaseResponse {

    @NonNull
    private Integer code;

    private String message;
}
