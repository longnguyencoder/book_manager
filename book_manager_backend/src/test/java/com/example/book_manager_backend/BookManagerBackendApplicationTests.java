package com.example.book_manager_backend;

import com.example.book_manager_backend.dao.detailOrderRepository;
import com.example.book_manager_backend.entity.Category;
import com.example.book_manager_backend.entity.DetailOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootTest
class BookManagerBackendApplicationTests {

	@Autowired
	private com.example.book_manager_backend.dao.detailOrderRepository detailOrderRepository;

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
