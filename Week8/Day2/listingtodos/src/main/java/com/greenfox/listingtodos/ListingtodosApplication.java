package com.greenfox.listingtodos;

import com.greenfox.listingtodos.model.Todo;
import com.greenfox.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository todorepo;

	public static void main(String[] args) {
		SpringApplication.run(ListingtodosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        todorepo.save(new Todo("Do not get ill."));
        todorepo.save(new Todo("testing exercise"));
        todorepo.save(new Todo("Third entry"));
    }
}
