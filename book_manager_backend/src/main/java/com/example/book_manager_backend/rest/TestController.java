package com.example.book_manager_backend.rest;

import com.example.book_manager_backend.dao.DetailOrderRepository;
import com.example.book_manager_backend.entity.DetailOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private DetailOrderRepository detailOrderRepository;

    @Autowired
    public TestController(DetailOrderRepository detailOrderRepository) {
        this.detailOrderRepository = detailOrderRepository;
    }


        @GetMapping("/")
        public void test(){

            DetailOrder detailOrder = new DetailOrder();
            detailOrderRepository.findAll();
            return  ;

    }
}
