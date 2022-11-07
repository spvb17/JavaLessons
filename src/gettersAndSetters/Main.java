package gettersAndSetters;

/*Все члены класса в языке Java - поля и методы - имеют модификаторы доступа.
  В прошлых темах мы уже сталкивались с модификатором public. Модификаторы доступа
  позволяют задать допустимую область видимости для членов класса, то есть контекст,
  в котором можно употреблять данное поле или метод.

  -public: публичный, общедоступный класс или член класса. Поля и методы, объявленные
           с модификатором public, видны другим классам из текущего пакета и из внешних пакетов.
  -private: закрытый класс или член класса, противоположность модификатору public.
            Закрытый класс или член класса доступен только из кода в том же классе.
  -protected: такой класс или член класса доступен из любого места в текущем классе или пакете или
              в производных классах, даже если они находятся в других пакетах
  -default: Отсутствие модификатора у поля или метода класса предполагает применение к нему модификатора
            по умолчанию. Такие поля или методы видны всем классам в текущем пакете.

    Если другой класс имеет прямой доступ к какому-то полю, то есть вероятность, что в процессе работы программы
    ему будет передано некорректное значение. Подобное изменение данных не является
    желательным. Либо же мы хотим, чтобы некоторые данные были достуны напрямую, чтобы их можно было вывести на консоль
    или просто узнать их значение. В этой связи рекомендуется как можно больше ограничивать доступ к данным, чтобы защитить
    их от нежелательного доступа извне (как для получения значения, так и для его изменения). Использование различных модификаторов
    гарантирует, что данные не будут искажены или изменены не надлежащим образом.

    getter - метод для получения данных
    setter - метод для изменения данных
*/
public class Main
{
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2.4);
        System.out.println(car1.getName());
        Car car2 = new Car("bmw", 3.0);
        System.out.println(car2);
        car2.setEngineVolume(4.0);
        System.out.println(car2);
    }
}

class Car
{
    private String name;
    private double engineVolume;

    public Car(){};
    public Car(String name, double engineVolume)
    {
        this.name = name;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
