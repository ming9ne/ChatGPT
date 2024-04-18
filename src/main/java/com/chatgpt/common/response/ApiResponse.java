package com.chatgpt.common.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiResponse {
    private String result;
    private int resultCode;
    private String resultMsg;
}