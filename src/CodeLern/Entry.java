package CodeLern;

public class Entry {
    public static void main(String[] args) {
          Animal ainmal=new Dog();
//          down- casting
//        ((Dog)ainmal).play();
        ainmal.sound();
    }
}
class Animal{
    public void sound(){
        System.out.println("some sound");
    }
}
class Dog extends Animal{
    public void sound() {
        System.out.println("woof woof");
    }
    public void play(){
        System.out.println("The dog is playing");
    }
}
