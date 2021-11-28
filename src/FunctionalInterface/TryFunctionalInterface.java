package FunctionalInterface;

@FunctionalInterface
interface Soundable {
    void makeSound();
}

public class TryFunctionalInterface implements Soundable{
    @Override
    public void makeSound(){
        System.out.println("Quack");
    }

    public static void main(String[] args){
        Soundable animal = new TryFunctionalInterface();
        animal.makeSound();
    }

}
