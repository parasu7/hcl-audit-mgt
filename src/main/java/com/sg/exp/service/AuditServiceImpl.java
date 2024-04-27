package com.sg.exp.service;

import com.sg.exp.model.Audit;
import com.sg.exp.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuditServiceImpl implements AuditService {

	@Autowired
	AuditRepository auditRepository;

	@Override
	@Transactional
	// A Proxy is Created that wraps the function retrieve
	// BeginTransaction
	public List<Audit> retrieve() {
		List<Audit> auditList = (List<Audit>) auditRepository.findAll();
		return auditList;
	}
	// Commit Transaction


}
