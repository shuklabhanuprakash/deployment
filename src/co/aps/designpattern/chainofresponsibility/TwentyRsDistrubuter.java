package co.aps.designpattern.chainofresponsibility;

public class TwentyRsDistrubuter implements CurrencyDistrubuter {
	CurrencyDistrubuter chain;

	@Override
	public void nextChain(CurrencyDistrubuter chain) {
		this.chain = chain;

	}

	@Override
	public void distribute(Currency currency) {
		if (currency.getAmount() >= 20) {
			int quotient = currency.getAmount() / 20;
			int remain = currency.getAmount() % 20;
			System.out.println("Distrubuting " + quotient + " 20 Rs note.");
			if (remain != 0) {
				this.chain.distribute(currency);
			}
		} else {
			this.chain.distribute(currency);
		}
	}

}
