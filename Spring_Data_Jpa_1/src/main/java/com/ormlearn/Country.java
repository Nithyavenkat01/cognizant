package com.ormlearn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Country")
public class Country {
	
	@Id
	
	@Column(name="co_code")
	private String code;
	@Column(name="co_name")
	private String name;
	
	Country()
	{
		
	}
	
	Country(String code,String name)
	{
		this.code=code;
		this.name=name;
	}
	
	public void setCode(String code)
	{
		this.code=code;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
	
	

}
