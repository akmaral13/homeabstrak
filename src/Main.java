public class Main {
    public static void main(String[] args) {

        Sheep sheep=new Sheep(45,3,"m","sheep");
        Sheep sheep1=new Sheep(45,3,"m","Sheep");
        Sheep sheep2=new Sheep(45,3,"m","Sheep");
        Sheep[]sheepArray=new Sheep[]{sheep,sheep1,sheep2};

        Cow cow=new Cow(220,5,"f","mumu");
        Cow cow1=new Cow(220,5,"f","cow");
        Cow cow2=new Cow(220,5,"f","cow");
        Cow cow3=new Cow(220,5,"f","cow");
        Cow cow4=new Cow(220,5,"f","cow");
        Cow[]cows=new Cow[]{cow,cow1,cow2,cow3,cow4};

        Horse horse=new Horse(180,2,"h","horse");
        Horse horse1=new Horse(180,2,"h","horse");
        Horse[]horses=new Horse[]{horse,horse1};


        farm farm=new farm("Moscow",cows,horses,sheepArray,"Jonatan");
        farm farm1=new farm("Moscow",new Cow[]{cow},new Horse[]{horse},new Sheep[]{sheep},"Tom");
        System.out.println(farm);
        System.out.println(farm1);
    }
}