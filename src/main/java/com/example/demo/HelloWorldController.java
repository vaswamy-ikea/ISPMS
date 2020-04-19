package com.example.demo;


import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

@RequestMapping("/hello")
public String sayHello() 
{
return "Hello World Developer!!!";
}


@RequestMapping("/hellovani")
public String sayHelloVani() 
{
return "Vani Developer!!!";
}

@RequestMapping(value = "/lsss")
public String lsss()
{

	System.out.println("test");
	return "Test";
	 
}

@RequestMapping(method = RequestMethod.GET , value = "/lsss/getstructure/{id}") 
public String getstructure(@PathVariable("id") String id)
{
	System.out.println("getstructure id" + id) ;

	return id;
	 
}


@RequestMapping(value="/method7/{id}")
public String method7(@PathVariable("id") int id){
	return "method7 with id="+id;
}


@RequestMapping(value="/method9")
public String method9(@RequestParam("id") int id){
	return "method9 with id= "+id;
}


}
