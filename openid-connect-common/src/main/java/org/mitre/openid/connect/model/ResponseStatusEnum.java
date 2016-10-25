package org.mitre.openid.connect.model;

public enum ResponseStatusEnum{
	OK("ok"),
	ERROR("error");
	
	private String value;
	private ResponseStatusEnum(String value){
		this.value = value;
	}
	
	@Override
    public String toString() {
        return value;
    }
}