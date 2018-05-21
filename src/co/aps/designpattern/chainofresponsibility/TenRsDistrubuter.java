package co.aps.designpattern.chainofresponsibility;

public class TenRsDistrubuter implements CurrencyDistrubuter {
	CurrencyDistrubuter chain;

	@Override
	public void nextChain(CurrencyDistrubuter chain) {
		// TODO Auto-generated method stub

	}

	@Override
	public void distribute(Currency currency) {
		// TODO Auto-generated method stub

	}

}
