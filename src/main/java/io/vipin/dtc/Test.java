package io.vipin.dtc;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Test {

	@Id
	private String id;
	@NotNull
	@Field
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Test(String id, @NotNull String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
