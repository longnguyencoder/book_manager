package com.example.book_manager_backend;

import com.example.book_manager_backend.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookManagerBackendApplicationTests {

	@Test
	void contextLoads() {
		Category category = new Category();
		category.setIdCategory(1);
		category.setNameCategory("truyen tranh");
	}

}
