package com.tacos.data;

import com.tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository  extends
        CrudRepository<Order, Long> {
}
