package edu.ecnu.sei.mockito.trading;

import edu.ecnu.sei.mockito.trading.dto.Stock;

public interface MarketWatcher {

  Stock getQuote(String symbol);
}
