package com.tacos.web;

import com.tacos.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());

        return "orderForm";
    }

    @PostMapping
    public String processOrder(Order order, SessionStatus sessionStatus) {
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();

        return "redirect:/";

    }
}
