package chap06.car.example;

import chap06.car.Car;

/**
 * 접근제어자 (protected, private)
 */
public class SportsCar extends Car {

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        System.out.println(sportsCar.company);  // protected 접근 가능
//        sportsCar.model;  // private 접근 불가
    }
}
