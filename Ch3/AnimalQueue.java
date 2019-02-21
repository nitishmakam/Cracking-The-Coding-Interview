import java.util.*;

abstract class Animal {
    private int order;
    protected String name;

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return this.order;
    }

    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    }
}

public class Dog extends Animal {
    public Dog(String n) {
        super(n);
    }
}

public class Cat extends Animal {
    public Cat(String n) {
        super(n);
    }
}

class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0;

    public void enqueue(Animal a) {
        a.setOrder(order);
        order++;

        if (a instanceof Dog)
            dogs.addLast((Dog) a);
        else
            cats.addLast((Cat) a);
    }

    public Cat dequeueCat() {
        return cats.poll();
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Animal dequeueAny() {
        if (dogs.size() == 0) {
            return dequeueCat();
        } else if (cats.size() == 0) {
            return dequeueDog();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

}