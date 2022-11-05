package after.policy;

import after.dto.PurchaseHisotry;
import after.rule.PurchaseFrequencyRule;
import after.rule.ReturnRateRule;

public class SliverCustomerPolicy {

	private final ExcellentCustomerPolicy policy;
	
	public SliverCustomerPolicy() {
		policy = new ExcellentCustomerPolicy();
		policy.add(new PurchaseFrequencyRule());
		policy.add(new ReturnRateRule());
	}
	
	boolean complyWithAll(final PurchaseHisotry hisotry) {
		return policy.complyWithAll(hisotry);
	}
}
