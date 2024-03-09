package myPackage;

import myPackage.db.DB;

public class Main {

    public static void main(String[] args ) {

        Car bmw = new Car();
        bmw.setLight(true);
        bmw.blinkLight();


    }

//        final int count = 9;
//
//
//        Person obj1 = new Person();
//        Person.getCount();
//        Person obj2 = new Person();
//        Person obj3 = new Person();
//        Person obj4 = new Person();
//        Person.getCount();
//
//
////        Person.count = 5;
////        System.out.println(Person.count);
//
//        DB db = new DB();
//
////        info("World");
//
//    }
//
//    public static void info() {
//        System.out.println("Hello");
//    }
//    public static void info(String word) {
//        System.out.println(word + "!");
//    }



//        Car bmw = new Car (250.5f, 2000, "White", new byte[]{1,1,1});
//        bmw.engine.setValues(false, 2000);
//        bmw.engine.info();
//
//        //Transport transport = new Car(250.5f, 2000, "White", new byte[]{1,1,1});
//
//        Truck truck = new Truck (5000, new byte[]{0,0,0});
//        truck.engine.setValues(true, 500);
//        truck.engine.info();
           // truck.setValues(250.5f, 2000, "White", new byte[]{1,1,1});
           // System.out.println(truck.getValues());

//        Car flyCar = new Car(250.5f, 2000, "White", new byte[]{1,1,1}){
//            @Override
//            public void moveObject(Float speed) {
//                super.moveObject(speed);
//
//                this.engine.isReady(true);
//                System.out.println("Car fly)");
//            }
//        };
//
//        flyCar.moveObject(450f);




}