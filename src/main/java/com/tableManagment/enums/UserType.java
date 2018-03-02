package com.tableManagment.enums;

public enum UserType {
	//private String userTypeValue =null;

	USER_ADMIN("ADMIN"),
	USER_USER("USER"),
	USER_COUSTOMER("CUSTOMER");


	private String userTypeValue =null;
	UserType(final String UserTypeValue){
		userTypeValue=this.userTypeValue	;
	}
	public String getStringValue() {
		return userTypeValue; }

}
