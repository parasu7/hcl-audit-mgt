package com.sg.exp.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "audit")
public class Audit {


	@Id
	int auditId;

	public int getAuditId() {
		return auditId;
	}

	String instrumentId;
	String transactionRef;
	String instrumentName;

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

	String tradeType;

	public void setTradeAmount(double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	Date auditDate;

	public double getTradeAmount() {
		return tradeAmount;
	}

	double tradeAmount;



	public Audit() {
		super();
	}

	@Override
	public String toString() {
		return "Audit{" +
				"instrumentId=" + instrumentId +
				", transactionRef='" + transactionRef + '\'' +
				", instrumentName='" + instrumentName + '\'' +
				", tradeType='" + tradeType + '\'' +
				", auditDate=" + auditDate +
				", tradeAmount=" + tradeAmount +
				'}';
	}


	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}


	public String getTransactionRef() {
		return transactionRef;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public String getTradeType() {
		return tradeType;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public Audit(int auditId, String instrumentId, String transactionRef, String instrumentName, String  tradeType, Date auditDate, double tradeAmount) {
		super();
		this.auditId=auditId;
		this.instrumentId = instrumentId;
		this.transactionRef = transactionRef;
		this.instrumentName=instrumentName;
		this.tradeType=tradeType;
		this.auditDate=auditDate;
		this.tradeAmount=tradeAmount;
	}
}
