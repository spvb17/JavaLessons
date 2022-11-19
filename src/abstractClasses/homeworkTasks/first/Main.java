package abstractClasses.homeworkTasks.first;

public class Main
{
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("M1", 16, 512, 144, 400);
        Laptop laptop2 = new Laptop("M2", 8, 512, 120, 600);
        Laptop laptop3 = new Laptop("Core i9", 16, 1024, 240, 800);
        Monoblock monoblock1 = new Monoblock("Core i7", 16, 256, "TN");
        Monoblock monoblock2 = new Monoblock("Core i9", 32, 512, "IPS");
        Monoblock monoblock3 = new Monoblock("Core i5", 8, 480, "VA");
        Computer[] arr = {laptop1, laptop2, laptop3, monoblock1, monoblock2, monoblock3};


        System.out.println("Called maxFrequency method: ");
        System.out.println(Laptop.maxFrequency(arr).toString());
        System.out.println("Called isIps method: ");
        Monoblock.isIps(arr);
        System.out.println("Called isMonoblock method");
        Monoblock.isMonoblock(arr);
    }
}
