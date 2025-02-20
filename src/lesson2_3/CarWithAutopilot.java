package lesson2_3;

public class CarWithAutopilot {
    public static void main(String[] args) {
        // Цвет светофора (можно менять для тестирования)
        String trafficLight = "green"; // Возможные значения: "red", "yellow", "green"

        // Используем switch для определения действий автомобиля в зависимости от цвета светофора
        String action;
        switch (trafficLight) {
            case "red":
                action = "Stop";  // Если красный сигнал, остановиться
                break;
            case "green":
                action = "Go";  // Если зеленый сигнал, ехать
                break;
            case "yellow":
                action = "Wait";  // Если желтый сигнал, подождать
                break;
            default:
                action = "Invalid Signal";  // Если сигнал не распознан
                break;
        }

        System.out.println("The car should: " + action);  // Выводим соответствующее действие
    }
}

