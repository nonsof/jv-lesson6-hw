public class Notebook {
    private String brand;           // Марка ноутбука (например, "HP", "Dell", "Lenovo" и т.д.)
    private int ramSizeGB;          // Размер оперативной памяти в ГБ
    private int storageSizeGB;      // Объем жесткого диска в ГБ
    private String operatingSystem; // Операционная система (например, "Windows 10", "macOS", "Linux" и т.д.)
    private String color;           // Цвет ноутбука
    private double price;           // Цена ноутбука

    // Конструктор класса
    public Notebook(String brand, int ramSizeGB, int storageSizeGB, String operatingSystem, String color, double price) {
        this.brand = brand;
        this.ramSizeGB = ramSizeGB;
        this.storageSizeGB = storageSizeGB;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.price = price;
    }

    // Геттеры и сеттеры для полей класса

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public void setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
    }

    public int getStorageSizeGB() {
        return storageSizeGB;
    }

    public void setStorageSizeGB(int storageSizeGB) {
        this.storageSizeGB = storageSizeGB;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Переопределение метода toString() для удобного вывода информации о ноутбуке
    @Override
    public String toString() {
        return "Brand: " + brand + ", RAM: " + ramSizeGB + "GB, Storage: " + storageSizeGB + "GB, OS: " + operatingSystem + ", Color: " + color + ", Price: $" + price;
    }
}
