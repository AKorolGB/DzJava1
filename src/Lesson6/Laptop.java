package Lesson6;

public class Laptop {
        String manufacturer;
        int RAM;
        int HDD;
        double screen;
        String color;
        int price;

    public Laptop(String manufacturer, int RAM, int HDD, double screen,  String color,   int price) {
        this.manufacturer = manufacturer;
        this.RAM = RAM;
        this.HDD = HDD;
        this.screen = screen;
        this.color = color;
        this.price = price;
    }



        public String getManufacturer() {
            return manufacturer;
        }

        public int getRAM() {
            return RAM;
        }

        public int getHDD() {
            return HDD;
        }

        public double getScreen() {
            return screen;
        }

        public String getColor() {
            return color;
        }

        public int getPrice() {
            return price;
        }

    @Override
    public String toString() {
        return "manufacturer='" + manufacturer + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                ", screen=" + screen  +
                ", color=" + color +
                ", price=" + price
                ;

    }
}
