package vn.edu.hcmus.student.sv19127640.lab02.Exercise01;

import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise01
 * Created by ADMIN
 * Date 10/23/2021 - 6:57 PM
 * Description: class of one dimensional integer array
 */
public class MangSoNguyen {
    // attribute
    private int[] arr;
    // constructor

    /**
     * default constructor
     */
    public MangSoNguyen(){
        this.arr = null;
    }

    /**
     * Constructor with parameters
     * @param arr set of integers
     */
    public MangSoNguyen(int...arr){
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            this.arr[i] = arr[i];
    }

    /**
     * copy constructor
     * @param object 1D integer array
     */
    public MangSoNguyen(MangSoNguyen object){
        this.arr = new int[object.arr.length];
        for (int i = 0; i < object.arr.length; i++){
            this.arr[i] = object.arr[i];
        }
    }

    /**
     * getter methods (for the whole array)
     * @return array
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * setter method (for the whole array)
     * @param arr set of integers
     */
    public void setArr(int...arr) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            this.arr[i] = arr[i];
        }
    }

    /**
     * setter methods use for specified index
     * @param index integer
     * @param value integer
     */
    public void set(int index, int value){
        if (0 <= index && index < this.arr.length)
            this.arr[index] = value;
    }

    /**
     * getter method for specified index
     * @param index integer
     * @return value integer
     */
    public Integer get(int index){
        Integer value = null;
        if (0 <= index && index < this.arr.length)
            value = this.arr[index];
        return value;
    }

    /**
     * input array
     */
    public void input(){
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter the number of elements: ");
            n = scan.nextInt();
            if (n <= 0)
                System.out.println("N is invalid. Please, enter again!");
        }while (n <= 0);
        this.arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.print("arr[" + i + "] = ");
            this.arr[i] = scan.nextInt();
        }
    }
    /**
     * output all elements of 1D integer array
     */
    public void output(){
        System.out.print("Array has " + this.arr.length + " elements: ");
        for(int i = 0; i < this.arr.length; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sort array in ascending order
     */
    public void sortAscending(){
        int n = this.arr.length;
        for (int i = 1; i < n; i++){
            int value = this.arr[i];
            int j = i - 1;
            // sort from arr[0] to arr[j]
            while(j >= 0 && this.arr[j] > value){
                this.arr[j + 1] = this.arr[j];
                j -= 1;
            }
            this.arr[j + 1] = value;
        }
    }
    /**
     * Sort array in descending order
     */
    public void sortDescending(){
        int n = this.arr.length;
        for (int i = 1; i < n; i++){
            int value = this.arr[i];
            int j = i - 1;
            // sort from arr[0] to arr[j]
            while(j >= 0 && this.arr[j] < value){
                this.arr[j + 1] = this.arr[j];
                j -= 1;
            }
            this.arr[j + 1] = value;
        }
    }

    /**
     * Calculate sum of all elements in array
     * @return sum integer
     */
    public int sum(){
        int sum = 0;
        for (int i = 0; i < this.arr.length; i++)
            sum += this.arr[i];
        return sum;
    }
    /**
     * Calculate product of all elements in array
     * @return product integer
     */
    public long product(){
        long product = 1;
        for (int i = 0; i < this.arr.length; i++)
            product *= this.arr[i];
        return product;
    }

    /**
     * Find the largest number in array
     * @return value integer
     */
    public int largestElement(){
        int value = this.arr[0];
        for (int i = 1; i < this.arr.length; i++){
            if (this.arr[i] > value){
                value = this.arr[i];
            }
        }
        return value;
    }

    /**
     * Find the smallest positive number in array
     * @return value Integer
     */
    public Integer smallestPositiveInteger(){
        Integer value = Integer.MAX_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            if (this.arr[i] > 0 && this.arr[i] < value)
                value = this.arr[i];
        }
        return value;
    }

    /**
     * Find the largest negative integer in array
     * @return value Integer
     */
    public Integer largestNegativeInteger(){
        Integer value = Integer.MIN_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            if (this.arr[i] < 0 && this.arr[i] > value)
                value = this.arr[i];
        }
        return value;
    }

    /**
     * add an element to the front of array
     * @param value integer
     */
    public void addToFront(int value){
        int n = this.arr.length;
        int[] newArray = new int[n];
        for (int i = 0; i < this.arr.length; i++)
            newArray[i] = this.arr[i];
        this.arr = new int[n + 1];
        this.arr[0] = value;
        for (int i = 1; i < this.arr.length; i++){
            this.arr[i]  = newArray[i - 1];
        }
    }

    /**
     * add an element to the back of array
     * @param value integer
     */
    public void addToBack(int value){
        int n = this.arr.length;
        int[] newArray = new int[n];
        for (int i = 0; i < this.arr.length; i++)
            newArray[i] = this.arr[i];
        this.arr = new int[n + 1];
        this.arr[n] = value;
        for (int i = 0; i < n; i++){
            this.arr[i]  = newArray[i];
        }
    }

    /**
     * add an element at index k to array
     * @param value integer
     * @param index integer
     */
    public void addToIndexK(int value, int index){
        if (index < 0){
            System.out.println("Invalid index. Please, input index again.");
        }else {
            int n = this.arr.length;
            int[] newArray = new int[n];
            for (int i = 0; i < this.arr.length; i++)
                newArray[i] = this.arr[i];
            this.arr = new int[n + 1];
            this.arr[index] = value;
            for (int i = 0; i < n + 1; i++) {
                if (i < index) {
                    this.arr[i] = newArray[i];
                }
                else if (i > index){
                    this.arr[i] = newArray[i - 1];
                }
            }
        }
    }

    /**
     * delete element at index k
     * @param index integer
     */
    public void deleteAtIndexK(int index){
        if (index < 0){
            System.out.println("Invalid index. Please, input index again.");
        }else {
            int n = this.arr.length;
            int[] newArray = new int[n];
            for (int i = 0; i < this.arr.length; i++)
                newArray[i] = this.arr[i];
            this.arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                if (i < index) {
                    this.arr[i] = newArray[i];
                }
                else if (i >= index){
                    this.arr[i] = newArray[i + 1];
                }
            }
        }
    }

    /**
     * delete all element x from array
     * @param x integer
     */
    public void deleteAllXElement(int x){
        for (int i = 0; i < this.arr.length;){
            if (this.arr[i] == x){
                this.deleteAtIndexK(i);
                i--;
            }
            i++;
        }
    }

    /**
     * update value of element at index k in array
     * @param index integer
     * @param value integer
     */
    public void updateElementAtIndexK(int index, int value){
        for (int i = 0; i < this.arr.length; i++){
            if (i == index){
                this.arr[i] = value;
            }
        }
    }

    /**
     * update element x to element y in array
     * @param x integer
     * @param y integer
     */
    public void updateElementXtoElementY(int x, int y){
        boolean flag = false;
        for (int i = 0; i < this.arr.length; i++){
            if (this.arr[i] == x){
                this.arr[i] = y;
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Element x doesnt exist in array.");
        }
    }

    /**
     * parse string to array with any delimiter
     * @param s String
     * @return f array
     */
    public static MangSoNguyen parseMangSoNguyen(String s){
        MangSoNguyen f = new MangSoNguyen();
        String[] arrStr = s.split("[^0-9-]");
        f.arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++){
            f.arr[i] = Integer.parseInt(arrStr[i]);
        }
        return f;
    }

    /**
     * static method to create a zero integer array
     * @param n integer
     * @return result MangSoNguyen
     */
    public static MangSoNguyen createZeroArray(int n){
        MangSoNguyen result = new MangSoNguyen();
        result.arr = new int[n];
        for (int i = 0; i < result.arr.length; i++){
            result.arr[i] = 0;
        }
        return result;
    }

    /**
     * static method to create a random integer array with elements from minValue to maxValue
     * @param n integer
     * @param minValue integer
     * @param maxValue integer
     * @return result MangSoNguyen
     */
    public static MangSoNguyen createRandomArray(int n, int minValue, int maxValue){
        MangSoNguyen result = new MangSoNguyen();
        result.arr = new int[n];
        for (int i = 0; i < result.arr.length; i++){
            result.arr[i] = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        }
        return result;
    }

    /**
     * static method to create array b by using sort array object. type = 1: ascending, type = 0: descending
     * @param object MangSoNguyen
     * @param type integer
     * @return result MangSoNguyen
     */
    public static MangSoNguyen sort(MangSoNguyen object, int type){
        MangSoNguyen result = new MangSoNguyen();
        result.arr = new int[object.arr.length];
        for (int i = 0; i < result.arr.length; i++){
            result.arr[i] = object.arr[i];
        }
        if (type == 1){
            result.sortAscending();
        }
        else{
            result.sortDescending();
        }
        return result;
    }

    /**
     * overload sum method (sum of 2 arrays)
     * @param arr IntegerArray
     * @return result integer
     */
    public int sum(MangSoNguyen arr){
        int sum_1 = this.sum();
        int sum_2 = arr.sum();
        int result = sum_1 + sum_2;
        return result;
    }

    /**
     * overload product method (product of 2 arrays)
     * @param arr IntegerArray
     * @return result long
     */
    public long product(MangSoNguyen arr){
        long sum_1 = this.product();
        long sum_2 = arr.product();
        long result = sum_1 * sum_2;
        return result;
    }

    /**
     * static input method
     * @param a set of integers
     * @return f IntegerArray
     */
    public static MangSoNguyen input(int...a){
        MangSoNguyen f = new MangSoNguyen();
        f.arr = new int[a.length];
        for (int i = 0; i < a.length; i++){
            f.arr[i] = a[i];
        }
        return f;
    }















}
