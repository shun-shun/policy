package before;

public class Main {

	public static void main(String[] args) {

	}

	boolean isGoldCustomer(PurchaseHisotry hisotry) {
		if (100000 <= hisotry.totalAmount) {
			if (10 <= hisotry.purchaseFrequencyPermonth) {
				if (hisotry.returnRate <= 0.001) {
					return true;
				}
			}
		}
		return false;
	}

	boolean isSilverCustomer(PurchaseHisotry hisotry) {
		if (10 <= hisotry.purchaseFrequencyPermonth) {
			if (hisotry.returnRate <= 0.001) {
				return true;
			}
		}
		return false;
	}

}
