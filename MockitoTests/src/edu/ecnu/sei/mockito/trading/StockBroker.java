package edu.ecnu.sei.mockito.trading;
import java.math.BigDecimal;

import edu.ecnu.sei.mockito.trading.dto.Stock;
public class StockBroker {

	private final MarketWatcher market;
	
	private static final BigDecimal LIMIT =new BigDecimal("0.10");
	
	public StockBroker(MarketWatcher market) {
		this.market = market;
	}
	
	void perform(Portfolio portfolio, Stock stock) {
		
		Stock liveStock = market.getQuote(stock.getSymbol());
		BigDecimal avgPrice = portfolio.getAvgPrice(stock);
		BigDecimal priceGained = liveStock.getPrice().subtract(avgPrice);
		BigDecimal percentGain = priceGained.divide(avgPrice);
		
		if(percentGain.compareTo(LIMIT) > 0 ) {
			portfolio.sell(stock, 10);
		}else if(percentGain.compareTo(LIMIT) < 0 ){
			portfolio.buy(stock);
		}
	}
}
