package com.mistra.plank.api.request;

public class GetStockListRequest extends BaseTradeRequest {

    public GetStockListRequest(int userId) {
        super(userId);
    }

    @Override
    public String getMethod() {
        return TradeRequestMethod.GetStockList.value();
    }

}
