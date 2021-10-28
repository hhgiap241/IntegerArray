package vn.edu.hcmus.student.sv19127640.lab02.Exercise01;

import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise01
 * Created by ADMIN
 * Date 10/23/2021 - 7:28 PM
 * Description: main function for exercise 1
 */
public class Exercise01 {
    /**
     * main function
     * @param argv console parameters
     */
    public static void main(String[] argv){
        Integer chosse = null;
        do{
            System.out.println("===================================================================");
            System.out.println("0. Exit");
            System.out.println("1. Using constructor methods");
            System.out.println("2. Using get/set methods");
            System.out.println("3. Using input/output methods");
            System.out.println("4. Using sort ascending method");
            System.out.println("5. Using sort descending method");
            System.out.println("6. Using calculate sum of all elements method");
            System.out.println("7. Using calculate product of all elements method");
            System.out.println("8. Using find the largest element method");
            System.out.println("9. Using find the smallest positive integer number method");
            System.out.println("10. Using find the largest negative integer number method");
            System.out.println("11. Using add a new element to front of array method");
            System.out.println("12. Using add a new element to back of array method");
            System.out.println("13. Using add a new element to index K of array method");
            System.out.println("14. Using delete an element at index K of array method");
            System.out.println("15. Using delete all element X from array method");
            System.out.println("16. Using update an element at index K of array method");
            System.out.println("17. Using update an element X to element Y of array method");
            System.out.println("18. Using static method parseMangSoNguyen");
            System.out.println("19. Using static methods");
            System.out.println("20. Using overload methods");
            System.out.println("===================================================================");
            System.out.print("Input your choose: ");
            Scanner scan = new Scanner(System.in);
            chosse = scan.nextInt();
            switch (chosse){
                case 0: return;
                case 1: {
                    // use default constructor
                    MangSoNguyen obj_1 = new MangSoNguyen();
                    // use constructor with parameters
                    System.out.println("Use constructor with parameters: ");
                    MangSoNguyen obj_2 = new MangSoNguyen(3, 4, 5, 6, 7, 8);
                    obj_2.output();
                    int[] arr = {1, 2, 3};
                    MangSoNguyen obj_3 = new MangSoNguyen(arr);
                    obj_3.output();
                    // use copy constructor
                    System.out.println("Use copy constructor: ");
                    MangSoNguyen obj_4 =  new MangSoNguyen(obj_2);
                    obj_4.output();
                    break;
                }
                case 2: {
                    // use get
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(5, -5, 15);
                    System.out.println("Array:");
                    obj_1.output();
                    System.out.print("Using getter: ");
                    int[] arr_1 = obj_1.getArr();
                    for (int i = 0 ; i < arr_1.length; i++){
                        System.out.print(arr_1[i] + " ");
                    }
                    System.out.println();
                    int index = 2;
                    Integer value_1 = obj_1.get(index);
                    System.out.println("Using getter at index " + index + " = " + value_1);
                    // use set
                    MangSoNguyen obj_2 = new MangSoNguyen();
                    int[] arr_2 = {-100, 23, 332, 5, 11, 32, 55, 33, -12, -1100, 54};
                    obj_2.setArr(arr_2);
                    System.out.print("Using setter: ");
                    obj_2.output();
                    index = 3;
                    obj_2.set(index, 125);
                    System.out.print("Using setter at index " + index + " to 125: ");
                    obj_2.output();
                    break;
                }
                case 3:{
                    // use input and output method
                    MangSoNguyen obj_5 = new MangSoNguyen();
                    obj_5.input();
                    obj_5.output();
                    break;
                }
                case 4:{
                    // use sort array in ascending order
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array before sort in ascending order:");
                    obj_1.output();
                    System.out.println("Array after sort in ascending order:");
                    obj_1.sortAscending();
                    obj_1.output();
                    break;
                }
                case 5:{
                    // use sort array in descending order
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array before sort in descending order:");
                    obj_1.output();
                    System.out.println("Array after sort in descending order:");
                    obj_1.sortDescending();
                    obj_1.output();
                    break;
                }
                case 6: {
                    // use calculate sum of all elements in array
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    int sum = obj_1.sum();
                    System.out.println("Sum(arr) = " + sum);
                    break;
                }
                case 7: {
                    // use calculate product of all elements in array
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    long product = obj_1.product();
                    System.out.println("Product(arr) = " + product);
                    break;
                }
                case 8: {
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use find the largest element in array
                    int value_2 = obj_1.largestElement();
                    System.out.println("The largest element in array is " + value_2);
                    break;
                }
                case 9:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use find the smallest positive number in array
                    Integer value_3 = obj_1.smallestPositiveInteger();
                    System.out.println("The smallest positive number in array is " + value_3);
                    break;
                }
                case 10:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use find the largest negative number in array
                    Integer value_4 = obj_1.largestNegativeInteger();
                    System.out.println("The largest negative number in array is " + value_4);
                    break;
                }
                case 11:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use add an element to the front of array
                    System.out.print("Input the value to add in front of array: ");
                    int value_5 = scan.nextInt();
                    obj_1.addToFront(value_5);
                    System.out.println("Array after add " + value_5 + " to the front is:");
                    obj_1.output();
                    break;
                }
                case 12:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use add an element to the back of array
                    System.out.print("Input the value to add at back of array: ");
                    int value_6 = scan.nextInt();
                    obj_1.addToBack(value_6);
                    System.out.println("Array after add " + value_6 + " to the back is:");
                    obj_1.output();
                    break;
                }
                case 13:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use add an element to the index K of array
                    System.out.println("Using add an element to the index K of array:");
                    System.out.print("Input the index K: ");
                    int k = scan.nextInt();
                    System.out.print("Input the value to add: ");
                    int value_7 = scan.nextInt();
                    obj_1.addToIndexK(value_7, k);
                    System.out.println("Array after add " + value_7 + " to index " + k + " is:");
                    obj_1.output();
                    break;
                }
                case 14:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use delete element at index K of array
                    System.out.println("Using delete element at index K of array:");
                    System.out.print("Input the index K: ");
                    int k = scan.nextInt();
                    obj_1.deleteAtIndexK(k);
                    System.out.println("Array after delete element at index " + k + " is:");
                    obj_1.output();
                    break;
                }
                case 15:{
                    MangSoNguyen obj_1 = new MangSoNguyen(4, 4, 5, 6, 4, 4, 4, 4, 5, 3, 2, 1, 4, 4, 4, 4, 4);
                    System.out.println("Array before delete element 4:");
                    obj_1.output();
                    System.out.println("Array after delete element 4:");
                    obj_1.deleteAllXElement(4);
                    obj_1.output();
                    break;
                }
                case 16:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use update value of element at index k in array
                    System.out.print("Input the index K of the element: ");
                    int k = scan.nextInt();
                    System.out.print("Input the value to update: ");
                    int value_8 = scan.nextInt();
                    System.out.println("Array before update at index " + k + ":");
                    obj_1.output();
                    System.out.println("Array after update at index " + k + ":");
                    obj_1.updateElementAtIndexK(k, value_8);
                    obj_1.output();
                    break;
                }
                case 17:{
                    MangSoNguyen obj_1 = MangSoNguyen.createRandomArray(10, -1000, 1000);
                    System.out.println("Array:");
                    obj_1.output();
                    // use update element x to element y in array
                    System.out.println("Array before update element x:");
                    obj_1.output();
                    System.out.print("Input value x: ");
                    int x = scan.nextInt();
                    System.out.print("Input value y: ");
                    int y = scan.nextInt();
                    System.out.println("Array after update element x:");
                    obj_1.updateElementXtoElementY(x, y);
                    obj_1.output();
                    break;
                }
                case 18:{
                    String s = "1.2.3.-4&3|-4/5/4&-5|1";
                    MangSoNguyen obj_1 = MangSoNguyen.parseMangSoNguyen(s);
                    System.out.println("Array after parse String: " + s);
                    obj_1.output();
                    break;
                }
                case 19:{
                    MangSoNguyen obj_1 = MangSoNguyen.input(1, 2, 3, 4, 5, 6, 7);
                    System.out.println("Array after using static input method:");
                    obj_1.output();
                    MangSoNguyen obj_2 = MangSoNguyen.createZeroArray(10);
                    System.out.println("Array after using static create Zero array method:");
                    obj_2.output();
                    MangSoNguyen obj_3 = MangSoNguyen.createRandomArray(10, -10, 100);
                    System.out.println("Array after using static create random array method:");
                    obj_3.output();
                    MangSoNguyen obj_4 = MangSoNguyen.sort(obj_3, 0);
                    System.out.println("Array after using static sort array descending method:");
                    obj_4.output();
                    MangSoNguyen obj_5 = MangSoNguyen.sort(obj_3, 1);
                    System.out.println("Array after using static sort array ascending method:");
                    obj_5.output();
                    break;
                }
                case 20:{
                    System.out.println("Using overload methods:");
                    MangSoNguyen obj_7 = MangSoNguyen.createRandomArray(5, -5, 5);
                    System.out.println("First array:");
                    obj_7.output();
                    MangSoNguyen obj_8 = MangSoNguyen.createRandomArray(5, -5, 5);
                    System.out.println("Second array:");
                    obj_8.output();
                    System.out.println("Sum of 2 arrays is " + obj_7.sum(obj_8));
                    System.out.println("Product of 2 arrays is " + obj_7.product(obj_8));
                    break;
                }
                default: return;
            }
            System.out.print("Press enter to continue...");
            try{System.in.read();}
            catch(Exception e){}
        }while(0 < chosse && chosse <= 20);
    }
}
