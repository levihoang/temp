package com.r2s.findInternship.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ExceptionHandling {
	//Handler Not found Entity
	@ExceptionHandler(value = ResourceNotFound.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponeMessage handlerNotFound(ResourceNotFound ex)
	{
		return new ResponeMessage(404, ex.getMessage());
	}
	//Exception with SQL
	@ExceptionHandler(value = InternalServerErrorException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponeMessage handlerInternalServerError( InternalServerErrorException ex)
	{
		return new ResponeMessage(500, ex.getMessage());
	}
	@ExceptionHandler(value = ExceptionCustom.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ResponeMessage handlerExceptionCustom(ExceptionCustom ex)
	{
		return new ResponeMessage(401, ex.getMessage());
	}
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public  Map<String, String> handlerValidation(MethodArgumentNotValidException ex)
	{
		Map<String, String> maps = new HashMap<String, String>();
		ex.getBindingResult().getAllErrors().forEach(
				(error) -> {
					String field = ((FieldError)error).getField();
					String msg = error.getDefaultMessage();
					maps.put(field, msg);
				}
				);
		return maps;
	}
}
