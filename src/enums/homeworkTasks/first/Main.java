package enums.homeworkTasks.first;

public class Main
{
    public static void main(String[] args) {
        Size size1 = Size.XXS;
        Size size2 = Size.XS;
        Size size3 = Size.S;
        Size size4 = Size.M;
        Size size5 = Size.L;

        Tshirt tshirt1 = new Tshirt(size1, "black");
        Tshirt tshirt2 = new Tshirt(size2, "white");
        Tshirt tshirt3 = new Tshirt(size5, "blue");
        Tshirt tshirt4 = new Tshirt(size4, "black");
        Pant pant1 = new Pant(size3, "black", "woman", "slacks");
        Pant pant2 = new Pant(size4, "black", "man", "jeans");
        Pant pant3 = new Pant(size5, "grey", "man", "slacks");
        Pant pant4 = new Pant(size4, "white", "woman", "classic");
        Shirt shirt1 = new Shirt(size3, "white", "man");
        Shirt shirt2 = new Shirt(size2, "black", "woman");
        Shirt shirt3 = new Shirt(size3, "black", "man");
        Shirt shirt4 = new Shirt(size1, "magenta", "man");
        Pant[] pants = {pant1, pant2, pant3, pant4};
        Tshirt[] tshirts = {tshirt1, tshirt2, tshirt3, tshirt4};
        Shirt[] shirts = {shirt1, shirt2, shirt3, shirt4};
        Human human1 = new Human("Aida", "woman", size2);
        Human human2 = new Human("Roza", "woman", size3);
        Human human3 = new Human("Daneliya", "woman", size4);
        human1.isPantFit(pants);
        human2.isPantFit(pants);
        human3.isPantFit(pants);
        human1.isTshirtFit(tshirts);
        human2.isTshirtFit(tshirts);
        human3.isTshirtFit(tshirts);
        human1.isShirtFit(shirts);
        human2.isShirtFit(shirts);
        human3.isShirtFit(shirts);
        Cloth[] arr = {tshirt1, tshirt2, tshirt3, tshirt4, shirt1, shirt2, shirt3, shirt4, pant1, pant2, pant3, pant4};
        infoAboutSize(arr);
    }

    public static void infoAboutSize(Cloth[] arr)
    {
        int j = 0;
        for(Cloth i:arr)
        {
            j++;
            if(i.getSize().equals(Size.XXS))
            {
                System.out.println("Cloth number "+j+" gotta be removed from the shelves");
            }
        }
    }
}
