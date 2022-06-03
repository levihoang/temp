package com.r2s.findInternship.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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
}
