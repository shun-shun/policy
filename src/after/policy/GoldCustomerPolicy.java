package after.policy;

import after.dto.PurchaseHisotry;
import after.rule.GoldCustomerPurchaseAmountRule;
import after.rule.PurchaseFrequencyRule;
import after.rule.ReturnRateRule;

public class GoldCustomerPolicy {
	private final ExcellentCustomerPolicy policy;
	
	public GoldCustomerPolicy() {
		policy = new ExcellentCustomerPolicy();
		policy.add(new GoldCustomerPurchaseAmountRule());
		policy.add(new PurchaseFrequencyRule());
		policy.add(new ReturnRateRule());
	}
	
	boolean complyWithAll(final PurchaseHisotry hisotry) {
		return policy.complyWithAll(hisotry);
	}
}
