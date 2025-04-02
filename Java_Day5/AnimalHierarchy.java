class Animal{
    String name;
    int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("name:" + name);
        System.out.println("Age:"+ age);
    }
    void makeSound(){
        System.out.println("Animal can make Sound");
    }
}
class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
        super.display();
    }
    @Override
    void makeSound() {
        System.out.println("Dog can make sound like bow bow");
    }
}
class Cat extends Animal{
    Cat(String name,int age){
        super(name, age);
        super.display();
    }
    @Override
    void makeSound(){
        System.out.println("Cat can make sound like Mewone");
    }
}
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
        super.display();
    }
    @Override
    void makeSound(){
        System.out.println("Bird can make sound like kukuku");
    }
}
class AnimalHierarchy{
    public static void main(String[] args){
        Animal a1 = new Animal("a1", 10);
        Dog d1 = new Dog("d1",20);
        Cat c1 = new Cat("c1",30);
        Bird b1 = new Bird("b1",20);
        a1.makeSound();
        d1.makeSound();
        c1.makeSound();
        b1.makeSound();
    }
}
