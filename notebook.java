import java.util.*;
import java.util.stream.Collectors;

public class NotebookStore {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("HP", 8, 256, "Windows 10", "Silver", 699.99));
        notebooks.add(new Notebook("Dell", 16, 512, "Windows 10", "Black", 999.99));
        notebooks.add(new Notebook("Lenovo", 8, 512, "Windows 10", "Gray", 799.99));
        notebooks.add(new Notebook("Apple", 8, 256, "macOS", "Silver", 1299.99));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номера критериев фильтрации (через пробел):");
        System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        String input = scanner.nextLine();
        String[] criteria = input.split(" ");

        Map<String, Object> filters = new HashMap<>();

        for (String criterion : criteria) {
            switch (criterion) {
                case "1":
                    System.out.print("Введите минимальный объем ОЗУ (в ГБ): ");
                    int minRamSizeGB = scanner.nextInt();
                    filters.put("ramSizeGB", minRamSizeGB);
                    break;
                case "2":
                    System.out.print("Введите минимальный объем ЖД (в ГБ): ");
                    int minStorageSizeGB = scanner.nextInt();
                    filters.put("storageSizeGB", minStorageSizeGB);
                    break;
                case "3":
                    System.out.print("Введите операционную систему: ");
                    String operatingSystem = scanner.next();
                    filters.put("operatingSystem", operatingSystem);
                    break;
                case "4":
                    System.out.print("Введите цвет ноутбука: ");
                    String color = scanner.next();
                    filters.put("color", color);
                    break;
                default:
                    System.out.println("Неверный номер критерия: " + criterion);
                    break;
            }
        }

        // Фильтрация ноутбуков
        List<Notebook> filteredNotebooks = notebooks.stream()
                .filter(notebook -> {
                    for (Map.Entry<String, Object> entry : filters.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        switch (key) {
                            case "ramSizeGB":
                                if (notebook.getRam
