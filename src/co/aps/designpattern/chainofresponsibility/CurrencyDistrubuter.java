package co.aps.designpattern.chainofresponsibility;

public interface CurrencyDistrubuter {

	void nextChain(CurrencyDistrubuter chain);

	void distribute(Currency currency);
}
