package com.fr3nzy.SpringEcom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
