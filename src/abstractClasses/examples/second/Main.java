package abstractClasses.examples.second;

public class Main
{
    public static void main(String[] args) {
        FerrariEngine ferrari1 = new FerrariEngine(3.3, 6, 200);
        FerrariEngine ferrari2 = new FerrariEngine(3.0, 8, 150);
        RenaultEngine renault1 = new RenaultEngine(2.3, 5, 160, 3.5);
        RenaultEngine renault2 = new RenaultEngine(3.0, 5, 20, 3);

        Engine[] arr = {ferrari1, ferrari2, renault1, renault2};
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i].getMaxSpeed());
        }
    }
}
