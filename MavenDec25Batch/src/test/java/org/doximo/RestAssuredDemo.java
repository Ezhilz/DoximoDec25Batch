package org.doximo;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;
public class RestAssuredDemo {
	
	@Test(priority=1)
	public void getUser() {
		
		
		when()
			.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
			.statusCode(200)
			.body("userId",equalTo(1))
			.log().all();
			
	}
	
	@Test(priority=2)
	public void createUser() {
		
		HashMap d=new HashMap();
		d.put("name","Dinesh");
		d.put("Job","Tester");
		
		given()
			.contentType("application/json")
			.body(d)
		
		.when()
			.post("https://jsonplaceholder.typicode.com/posts")		
		
		.then()
			.statusCode(201)
			.log().all();

	}
	
	@Test(priority=3)
	public void updateUser() {
		HashMap d=new HashMap();
		d.put("name","Arun");
		d.put("Job","Dev");
		
		given()
			.contentType("application/json")
			.body(d)
		
		.when()
			.put("https://jsonplaceholder.typicode.com/posts/1")		
		
		.then()
			.statusCode(200)
			.log().all();

	}
	
	@Test(priority=4)
public void deleteUser() {
		when()
		 	.delete("https://jsonplaceholder.typicode.com/posts/1")
		 .then()	
		 	.statusCode(200)
		 	.log().all();

	}

}
