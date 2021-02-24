package com.sales.model;

public enum TaxType {

	EXEMPT_NO_IMPORTED(0F), EXEMPT_IMPORTED(0.05f), NO_EXEMPT_NO_IMPORTED(0.1F), NO_EXEMPT_IMPORTED(0.15F);

	private float tax;

	TaxType(float tax) {
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

}
