package decorator;

/*
Описание:
Декоратор — это структурный паттерн, который позволяет добавлять объектам новые поведения на лету,
помещая их в объекты-обёртки.
Декораторы должны относиться к тому же типу, что и декорируемые объекты
*/

public abstract class Car{
    String name = "Unnamed Car";
    public String getInfo(){
        return name;
    }

    public abstract int getPrice();
}
