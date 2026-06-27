package com.fr3nzy.SpringEcom.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(
        String orderId,
        String customerName,
        String email,
        String status,
        LocalDateTime orderDate,
        List<OrderItemResponse> items
) {}
