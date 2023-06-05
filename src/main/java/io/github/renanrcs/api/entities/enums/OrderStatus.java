package io.github.renanrcs.api.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private Integer code;

    OrderStatus(Integer code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }

}
