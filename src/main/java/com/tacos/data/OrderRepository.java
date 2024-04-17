package com.tacos.data;

import com.tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
