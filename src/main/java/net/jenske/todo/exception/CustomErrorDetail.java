package net.jenske.todo.exception;

import org.springframework.http.ProblemDetail;

public class CustomErrorDetail extends ProblemDetail {
    private String message;
    private int statusCode;

    public CustomErrorDetail(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
