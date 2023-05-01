package com.sri.tech;
import java.util.HashSet;
import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
public class HelloWorldApplication extends Application {
	 
	@Override
    public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
    	 classes.add(HelloWorld.class);
        return classes;
     }
}

