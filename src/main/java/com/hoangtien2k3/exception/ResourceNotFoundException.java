package com.hoangtien2k3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String fielName;
    private Long fieldValue;

    public ResourceNotFoundException(String resourceName, String fielName, Long fieldValue) {
        super(String.format("% not found with %s : '%s'", resourceName, fielName, fieldValue));
        this.resourceName = resourceName;
        this.fielName = fielName;
        this.fieldValue = fieldValue;
    }
}
