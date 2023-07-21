package ch06;

import java.util.ArrayList;

public class Animal{
    public void move(){
        System.out.println("동물이 움직입니다");
    }
}
class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 걷습니다");;
    }    public void readBook() {
        System.out.println("사람이 책을 읽습니다");;
    }
}

class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 뜁니다");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥합니다");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 걷습니다");
    }
    public void flying(){
        System.out.println("독수리가 납니다");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal hAnibal = new Human();
        Animal tAnibal = new Tiger();
        Animal eAnibal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnibal);
//        test.moveAnimal(tAnibal);
//        test.moveAnimal(eAnibal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnibal);
        animalList.add(tAnibal);
        animalList.add(eAnibal);

        for(Animal animal : animalList){
            animal.move();
        }
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}


