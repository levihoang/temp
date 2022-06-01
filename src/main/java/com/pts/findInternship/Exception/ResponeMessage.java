package com.pts.findInternship.Exception;

import lombok.Data;

@Data
public class ResponeMessage {
	private int httpCode;
	private String message;
	public ResponeMessage()
	{
		
	}
	public ResponeMessage(int code, String message)
	{
		this.httpCode =  code;
		this.message =  message;
	}
}
