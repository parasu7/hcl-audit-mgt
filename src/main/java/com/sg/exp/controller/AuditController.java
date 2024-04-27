package com.sg.exp.controller;

import com.sg.exp.model.Audit;
import com.sg.exp.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuditController {

	@Autowired
	AuditService auditService;

	@GetMapping("/retrieveAudit")
	public List<Audit> retrieve() {
		List<Audit> auditList = auditService.retrieve();
		return auditList;
	}


}
