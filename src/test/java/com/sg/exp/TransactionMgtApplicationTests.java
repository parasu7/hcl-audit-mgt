//package com.sg.exp;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootTest
//class TransactionMgtApplicationTests {
//
//
//	@Test
//	void contextLoads() {
//	}
//
//	@InjectMocks
//	AuditController controller;
//
//
//
//
//	public void init() {
//
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void getAllAuditList()
//	{
//		List<Audit> list = new ArrayList<Audit>();
//		Audit empOne = new Audit(1, "John", 14);
//		Audit empTwo = new Audit(4, "Alex", 23);
//		Audit empThree = new Audit(3, "Steve", 45);
//		controller.insert(empOne);
//
//		list.add(empOne);
//		list.add(empTwo);
//		list.add(empThree);
//
//		when(controller.retrieve()).thenReturn(list);
//
//
//		List<Audit> empList =controller.retrieve();
//
//
//	}
//
//
//
//
//}
