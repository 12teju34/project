package com.candidate.dto;

public class ErrorDTO implements MyDTO{


	private  String errorMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	
	public ErrorDTO(String string) {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
