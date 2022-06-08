package com.r2s.findInternship.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class InternalServerErrorException extends RuntimeException {

	public InternalServerErrorException(String msg)
	{
		super(msg);
	}
}
