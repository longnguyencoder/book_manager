package com.example.book_manager_backend;

import com.example.book_manager_backend.dao.DetailOrderRepository;
import com.example.book_manager_backend.entity.DetailOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookManagerBackendApplicationTests {

	@Autowired
	private DetailOrderRepository detailOrderRepository;

	@Test
	void contextLoads() {
		DetailOrder detailOrder = new DetailOrder();
//		detailOrderRepository detailOrderRepository = new detailOrderRepository() {
//			Override
//			public void flush() {
//
//			}@
//
//
//		}

	}
}
