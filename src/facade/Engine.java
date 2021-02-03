package facade;

/*
Описание:
Скрывает сложную систему классов приводя все вызовы к одному объекту.
Помещает вызов нескольких сложных объектов в один объект.
*/

public class Engine implements Car {
    @Override
    public void start() {
        System.out.println("Запустить двигатель");
    }

    @Override
    public void stop() {
        System.out.println("Остановить двигатель");
    }
}
