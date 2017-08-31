/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2homework;

/**
 *
 * @author tjones61
 */
public class Class2Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person johnObject = new Person();
        Person maryObject = new Person();
        
        System.out.println("johnObject: " + johnObject.getFirstName() + " " + johnObject.getLastName() + " " + johnObject.getAge());
        System.out.println("maryObject: " + maryObject.getFirstName() + " " + maryObject.getLastName() + " " + maryObject.getAge());
    }
    
}
