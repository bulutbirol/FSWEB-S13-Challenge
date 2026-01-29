package org.example.enums;

public enum Plan {
    BASIC("Basic", 100),
    STANDARD("Standard", 200),
    PREMIUM("Premium", 300);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
