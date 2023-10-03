package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private studentrepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Student1 s=new Student1(101,"sai","java",9000.00);
		Student1 s1=new Student1(102,"akhil","spring",9500.00);
		Student1 s2=new Student1(103,"sanjay","java",7000.00);
		//repo.save(s);
		repo.save(s1);
		repo.save(s2);
		System.out.println("inserted sucessfully");*/
		/*repo.deleteById(103);
		System.out.println("record deleted");*/
		repo.findAll().forEach(s->{System.out.println(s);});
	
	}

}
