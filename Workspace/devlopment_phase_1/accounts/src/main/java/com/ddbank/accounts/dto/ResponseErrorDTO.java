package com.ddbank.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ResponseErrorDTO {
    private String errorMessage;
    private HttpStatus errorCode;
    private String apiPath;
    private LocalDateTime errorTime;
}
