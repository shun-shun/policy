package after.rule;

import after.dto.PurchaseHisotry;

public class PurchaseFrequencyRule implements ExcellentCustomerRule {

	@Override
	public boolean ok(PurchaseHisotry hisotry) {
		return 10 <= hisotry.purchaseFrequencyPermonth;
	}

}
