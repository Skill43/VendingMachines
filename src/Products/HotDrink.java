package Products;

public class HotDrink extends Product {
    private int volume;
    private int temperature;
    
    /**
     * Конструктор 4 параметра
     * @param name наименование
     * @param price цена
     * @param volume объем
     * @param temperature температура
     */
public HotDrink(String name, double price, int volume, int temperature)
{
    super(name, price);
    this.volume = volume;
    this.temperature = temperature;
}

public int getVolume() {
    return volume;
}

public void setVolume(int volume) {
    this.volume = volume;
}

public int getTemper() {
    return temperature;
}

public void setTemper(int temperature) {
    this.temperature = temperature;
}

/**
 * Переопределение вывода HotDrink
*/
@Override
public String toString()
{
    return  "Product{" +
    "наименоваие='" + super.getName() + '\'' +
    ", цена=" + super.getPrice() +
    ", объем=" + volume + ", температура=" + temperature +
    "}";
}
}
