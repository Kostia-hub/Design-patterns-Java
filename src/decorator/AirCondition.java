package decorator;

/*
Описание:
Декоратор — это структурный паттерн, который позволяет добавлять объектам новые поведения на лету,
помещая их в объекты-обёртки.
Декораторы должны относиться к тому же типу, что и декорируемые объекты
*/

public class AirCondition extends Decorator{
    Car car;

    public AirCondition(Car car){
        this.car = car;
    }

    public String getInfo() {
        return car.getInfo() + " + Air Conditioning";
    }

    public int getPrice() {
        return car.getPrice() + 1000;
    }
}