package com.mes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

///order/orderBatch.page
@Controller
@RequestMapping("/order")
public class OrderController {
	
	private static String FPATH="order/";

	@RequestMapping("/orderBatch.page")
	public String orderBatchPage() {
		return FPATH+"orderBatch";
	}
	
	
}
