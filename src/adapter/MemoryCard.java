package adapter;

/*
Описание:
Используя паттерн, мы можем объединить два несовместимых объекта.
Конвертер между двумя несовместимыми объектами.
*/

public class MemoryCard {
    public void insert() {
        System.out.println("Карта памяти успешно вставлена!");
    }

    public void copyData() {
        System.out.println("Данные скопированы на компьютер!");
    }
}
