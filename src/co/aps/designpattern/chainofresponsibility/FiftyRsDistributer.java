package co.aps.designpattern.chainofresponsibility;

public class FiftyRsDistributer implements CurrencyDistrubuter {

	CurrencyDistrubuter chain;

	@Override
	public void nextChain(CurrencyDistrubuter chain) {
		this.chain = chain;
	}

	@Override
	public void distribute(Currency currency) {
		if (currency.getAmount() >= 50) {
			int quotient = currency.getAmount() / 50;
			int remain = currency.getAmount() % 50;
			System.out.println("Distributing " + quotient + " 50 Rs notes");
			if (remain != 0) {
				this.chain.distribute(currency);
			}
		} else {
			this.chain.distribute(currency);
		}
	}

}
