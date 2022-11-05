package after.rule;

import after.dto.PurchaseHisotry;

public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {

	@Override
	public boolean ok(PurchaseHisotry hisotry) {
		return 100000 <= hisotry.totalAmount;
	}

}
