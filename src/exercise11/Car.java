package exercise11;

public class Car implements Comparable<Car> {
      private String name;
      private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car car) {
        return this.getPrice()-car.getPrice();
    }
}
