package com.tacos.data;

import com.tacos.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository  extends
        CrudRepository<Order, UUID> {
}
