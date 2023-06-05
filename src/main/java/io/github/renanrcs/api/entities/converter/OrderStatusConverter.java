package io.github.renanrcs.api.entities.converter;

import io.github.renanrcs.api.entities.enums.OrderStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class OrderStatusConverter implements AttributeConverter<OrderStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(OrderStatus attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public OrderStatus convertToEntityAttribute(Integer dbData) {
        if (dbData == null) {
            return null;
        }
        for (OrderStatus value: OrderStatus.values()) {
            if (value.getCode() == dbData){
                        System.out.println(value);
                return  value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
