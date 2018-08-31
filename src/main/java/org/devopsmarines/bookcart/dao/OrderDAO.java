package org.devopsmarines.bookcart.dao;

import java.util.List;

import org.devopsmarines.bookcart.model.CartInfo;
import org.devopsmarines.bookcart.model.OrderDetailInfo;
import org.devopsmarines.bookcart.model.OrderInfo;
import org.devopsmarines.bookcart.model.PaginationResult;

public interface OrderDAO {

public void saveOrder(CartInfo cartInfo);

public PaginationResult<OrderInfo> listOrderInfo(int page,
int maxResult, int maxNavigationPage);

public OrderInfo getOrderInfo(String orderId);

public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}