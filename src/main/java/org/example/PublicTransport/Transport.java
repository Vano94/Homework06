package org.example.PublicTransport;

public class Transport {
    private String name;
    private Integer spots;

    public static void Transport() {
        System.out.println("New Object Created");
    }

    public void move () {
        System.out.println("Move carefully");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpotsCount() {
        return spots;
    }

    public void setSpotsCount(Integer spots) {
        this.spots = spots;
        if (spots > 7) {
            System.out.println("This is a bus");
        } else {
            System.out.println("This is a car");
        }
    }

    @Override
    public String toString() {
        return "PublicTransport.Transport{" +
                "name='" + name + '\'' +
                '}';
    }
}