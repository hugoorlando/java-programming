package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = Movie.randomMovie();
            System.out.println("Movie #" + i + " :" + movie.getName() +
                    "\nPlot: " + movie.plot() + "\n");
        }

        Car car = new Car(4, "Base car");
        System.out.println(car.starEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(4, "Outlander VRW 4WD");
        System.out.println(mitsubishi.starEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(5, "Ford 1");
        System.out.println(ford.starEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

	}
}
