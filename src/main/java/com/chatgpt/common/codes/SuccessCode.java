package com.chatgpt.common.codes;

import lombok.Getter;

@Getter
public enum SuccessCode {
    SELECT(200, "Success"),
    INSERT(201, "Data successfully inserted"),
    UPDATE(202, "Data successfully updated"),
    DELETE(203, "Data successfully deleted");

    private final int status;
    private final String message;

    SuccessCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
}