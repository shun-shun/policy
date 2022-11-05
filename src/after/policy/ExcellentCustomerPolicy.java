package after.policy;

import java.util.HashSet;
import java.util.Set;

import after.dto.PurchaseHisotry;
import after.rule.ExcellentCustomerRule;

// 優良顧客の方針を表現するクラス
public class ExcellentCustomerPolicy {
	
	// ポリシーのみを定義
	private final Set<ExcellentCustomerRule> rules;
	
	public ExcellentCustomerPolicy() {
		rules = new HashSet<>();
	}
	
	// ポリシーを追加
	void add(final ExcellentCustomerRule rule) {
		rules.add(rule);
	}
	
	// ポリシーに合致しているか検証
	boolean complyWithAll(final PurchaseHisotry hisotry) {
		for(ExcellentCustomerRule each : rules) {
			if(!each.ok(hisotry)) return false;
		}
		return false;
	}
}
