import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuCreator {
    public static void main(String[] args) {
        // Создание списка продуктов с их БЖУ
        Map<String, NutritionInfo> products = new HashMap<>();
        products.put("Eggs", new NutritionInfo(6, 5, 0));
        products.put("Chicken", new NutritionInfo(25, 10, 0));
        products.put("Rice", new NutritionInfo(2, 0, 45));
        products.put("Potatoe", new NutritionInfo(0, 5, 60));
        products.put("Bread", new NutritionInfo(0, 5, 63));
        products.put("Cheese", new NutritionInfo(10, 10, 30));




        // Добавьте другие продукты в соответствии с их БЖУ

        // Ввод диетических требований от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter daily amount of Protein (gr.)");
        int targetProtein = scanner.nextInt();
        System.out.println("Enter daily amount of Fats (gr.)");
        int targetFat = scanner.nextInt();
        System.out.println("Enter daily amount of Carbs (gr.)");
        int targetCarbs = scanner.nextInt();

        // Создание списка продуктов, соответствующих диетическим требованиям
        List<String> menu = new ArrayList<>();
        for (Map.Entry<String, NutritionInfo> entry : products.entrySet()) {
            String product = entry.getKey();
            NutritionInfo nutritionInfo = entry.getValue();
            if (nutritionInfo.protein >= targetProtein && nutritionInfo.fat >= targetFat && nutritionInfo.carbs >= targetCarbs) {
                menu.add(product);
            }
        }

        // Вывод меню
        System.out.println("Рекомендованное меню:");
        for (String product : menu) {
            System.out.println(product);
        }
    }
}



