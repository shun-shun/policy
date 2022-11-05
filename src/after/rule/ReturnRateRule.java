package after.rule;

import after.dto.PurchaseHisotry;

public class ReturnRateRule implements ExcellentCustomerRule {

	@Override
	public boolean ok(PurchaseHisotry hisotry) {
		return hisotry.returnRate <= 0.001;
	}

}
