package after.rule;

import after.dto.PurchaseHisotry;

public interface ExcellentCustomerRule {

	/**
	 * 
	 * @return 条件を満たす場合true
	 * @param hisotry 購入履歴
	 */
	boolean ok(final PurchaseHisotry hisotry);
}
