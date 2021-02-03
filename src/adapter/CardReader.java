package adapter;

/*
Описание:
Используя паттерн, мы можем объединить два несовместимых объекта.
Конвертер между двумя несовместимыми объектами.
*/

public class CardReader implements USB {
    private MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
