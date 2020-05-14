package com.school.high.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javassist.NotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler  extends ResponseEntityExceptionHandler{
	
	 @ExceptionHandler(value = NotFoundException.class)
	  public ResponseEntity<Object> handleGenericNotFoundException(NotFoundException e) {		 
		         CustomErrorResponse error = new CustomErrorResponse("NOT_FOUND_ERROR", e.getMessage());		 
		         error.setTimestamp(LocalDateTime.now());		 
		         error.setStatus((HttpStatus.NOT_FOUND.value()));		 
		         return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		 
		     }
}
