package Lesson4_3;

class Main {
    public static void main(String[] args) {
        // Создаем объект StringBuilder с начальной строкой "Привет"
        StringBuilder sb = new StringBuilder("Привет");

        // Добавляем строку ", world!" в конец объекта sb
        sb.append(", world!");

        // Выводим текущее содержимое StringBuilder в виде строки
        System.out.println(sb.toString());

        // Выводим длину текущей строки (количество символов)
        System.out.println(sb.length());

        // Удаляем символы с индексами от 6 (включительно) до 8 (не включая): удаляем запятую и пробел
        sb.delete(6, 8);

        // Выводим новую длину строки после удаления символов
        System.out.println(sb.length());

        // Выводим текущее состояние строки после удаления
        System.out.println(sb.toString());

        // Удаляем символ по индексу 11
        sb.deleteCharAt(11);

        // Выводим строку после удаления символа
        System.out.println(sb.toString());

        // Сохраняем текущее состояние строки в переменной result
        String result = sb.toString();
        // Все изменения далее не войдут в результат, так как мы зафиксировали их

        // Вставляем строку " ;)" в позицию 11 (вставка происходит до символа с индексом 11)
        sb.insert(11, " ;)");

        // Выводим строку после вставки новой подстроки
      //  System.out.println(sb.toString());

        // Заменяем символ в позиции 0 на 'Х'
        sb.setCharAt(0, 'Х');

        // Выводим строку после изменения первого символа
      //  System.out.println(sb.toString());

        // Заменяем символ в позиции 2 на 'Ю'
        sb.setCharAt(2, 'Ю');

        // Выводим строку после второй замены символа
      //  System.out.println(sb.toString());

        // Переворачиваем (реверсируем) строку: символы меняются местами от начала к концу
        sb.reverse();

        // Выводим перевернутую строку (toString() вызывается неявно)
       // System.out.println(sb);

        // Выводим сохраненное ранее состояние строки, которое было до реверса
        System.out.println(result);
    }
}
