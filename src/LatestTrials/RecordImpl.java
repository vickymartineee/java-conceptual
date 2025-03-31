package LatestTrials;

public class RecordImpl {
    public static void main(String[] args)
    {
        Animal a = new Animal("Tiger", false);
        Animal b = new Animal("Cat");
        Animal d = new Animal();
        var n = new Animal();
        System.out.println(a.name());
        System.out.println(b);
        System.out.println(n);
    }


}

record  Animal (String name, boolean isDomestic){
    Animal(String name, boolean isDomestic){
      this.name = name + ":)";
      this.isDomestic = isDomestic;
    }

    Animal(String name){
        this(name, true);
    }

    Animal(){
       this("Dummy Animal", false);
    }
}