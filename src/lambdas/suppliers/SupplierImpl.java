package lambdas.suppliers;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierImpl {
    public static void main(String[] args) {
        Supplier<String> demo = () -> "Printing something from my supplier";
        System.out.println(demo.get());

        Supplier<Animal> animalSupplier = Animal::new;
        Animal a = animalSupplier.get();
        a.printMyPetName("Mojo");
        a.printMyPetName("jojo");
        Stream.generate(animalSupplier).limit(5).forEach(System.out::println);
    }
}

class Animal {
    static int instance;
    Animal(){
        instance++;
        System.out.println(instance +" Created Instance");
    }
    void printMyPetName(String name) {
        System.out.println("Helloo " + name);
    }
}
