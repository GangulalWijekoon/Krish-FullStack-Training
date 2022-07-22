public class Application {
    public static void main(String[] args) {


        Dog originalDog = new Dog("Cindy" , "Rottweiler");

        Dog clonedDog = originalDog.makeCopyOfDog();

        System.out.println("Original Dog's name is: " + originalDog.getName());
        System.out.println("Original Dog's breed is: " + originalDog.getBreed());
        System.out.println();
        System.out.println("Cloned Dog's name is: " + clonedDog.getName());
        System.out.println("Cloned Dog's breed is: " + clonedDog.getBreed());

    }
}
