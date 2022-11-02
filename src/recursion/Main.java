package recursion;

//Рекурсия - процесс, когда метод вызывает сама себя
public class Main
{
    public static void main(String[] args) {
        output();
    }

    public static void output()
    {
        System.out.println("hello world");
        output();
    }

    //stack overflow - переполнение стека
}
