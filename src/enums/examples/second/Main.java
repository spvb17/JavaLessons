package enums.examples.second;

public class Main
{
    public static void main(String[] args) {
        Year year = Year.SUMMER;
        Year year1 = Year.SPRING;
        Year year2 = Year.FALL;
        Year year3 = Year.WINTER;

        Year[] arr = Year.values();
//        for(int i=0; i<arr.length; ++i)
//        {
//            someMethod(arr[i]);
//            System.out.println(arr[i].getAvgTemperature());
//            System.out.println(arr[i].getDescription());
//        }
//
        //for each
        for(Year yearIter : arr)
        {
            System.out.println(yearIter.getAvgTemperature());
            System.out.println(yearIter.getDescription());
            someMethod(yearIter);
        }
        //Тип данных
        //Итератор
        //:
        //Название массива
    }

    public static void someMethod(Year year)
    {
        switch(year)
        {
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case FALL:
                System.out.println("I love autumn");
                break;
        }
    }
}
