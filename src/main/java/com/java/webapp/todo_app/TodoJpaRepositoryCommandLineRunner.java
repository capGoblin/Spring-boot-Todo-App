package com.java.webapp.todo_app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoJpaRepositoryCommandLineRunner implements CommandLineRunner {

	@Autowired
	private TodoJpaRepository todoJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		Todo todo = new Todo((long) 1, "cap", "Learn Spring boot", sysdate(), false);
		todoJpaRepository.save(todo);
	}

	private Date sysdate() {
		Date date = new Date();
		return date;
	}

}
