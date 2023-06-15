package com.example.event.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    NOT_BLANK(400,"공백은 허용되지 않습니다.");

    private final int status;
    private final String message;
}
