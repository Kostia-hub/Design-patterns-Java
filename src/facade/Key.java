package facade;

/*
Описание:
Скрывает сложную систему классов приводя все вызовы к одному объекту.
Помещает вызов нескольких сложных объектов в один объект.
*/

public class Key implements Car {
    @Override
    public void start() {
        System.out.println("Вставить ключи");
    }

    @Override
    public void stop() {
        System.out.println("Вытянуть ключи");
    }
}
