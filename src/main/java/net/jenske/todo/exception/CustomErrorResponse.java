package net.jenske.todo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;

import java.util.Map;

// Define a concrete class that implements ErrorResponse
public class CustomErrorResponse implements ErrorResponse {
    private String message;
    private HttpStatus status;
    private Map<String, String> errors;


    public CustomErrorResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public HttpStatusCode getStatusCode() {
        return status;
    }

    @Override
    public CustomErrorDetail getBody() {
        return new CustomErrorDetail(message, status.value());
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
    public Map<String, String> getErrors() {
        return errors;

    }
}


