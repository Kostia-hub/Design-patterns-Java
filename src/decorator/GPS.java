package decorator;

/*
Описание:
Декоратор — это структурный паттерн, который позволяет добавлять объектам новые поведения на лету,
помещая их в объекты-обёртки.
Декораторы должны относиться к тому же типу, что и декорируемые объекты
*/

public class GPS extends Decorator{
    Car car;

    public GPS(Car car){
        this.car = car;
    }

    public String getInfo() {
        return car.getInfo() + " + GPS";
    }

    public int getPrice() {
        return car.getPrice() + 1500;
    }

}