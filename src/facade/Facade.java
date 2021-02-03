package facade;

/*
Описание:
Скрывает сложную систему классов приводя все вызовы к одному объекту.
Помещает вызов нескольких сложных объектов в один объект.
*/

public class Facade {
    private Key key;
    private Engine engine;
    public Facade() {
        key = new Key();
        engine = new Engine();
    }
    public void startCar() {
        key.start();
        engine.start();
    }
    public void stoptCar() {
        key.stop();
        engine.stop();
    }
}
