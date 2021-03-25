package com.ioc.propertyeditor;

public class Fee {
	private double totalFee;
	private double feePaid;
	private double feeBalance;

	public Fee(double totalFee, double feePaid, double feeBalance) {
		this.totalFee = totalFee;
		this.feePaid = feePaid;
		this.feeBalance = feeBalance;
	}

	public final double getTotalFee() {
		return totalFee;
	}

	public final double getFeePaid() {
		return feePaid;
	}

	public final double getFeeBalance() {
		return feeBalance;
	}

}
