/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Main {
    static Set<Integer> setA = new HashSet<Integer>();
    public static void main(String[] args) {       
        setA.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
    }
    
    
    //add (value) : Thêm phần tử vào tập hợp (Trả về true khi add thành công, false khi phần tử đã tồn tại)
    static void add(int n){
        System.out.println(setA.add(n)); 
        System.out.println("Các phần tử của setA: " + setA);
    }
    
    //remove(value) : bỏ phần tử ra khỏi tập hợp (Trả về true khi bỏ thành công, false khi phần tử không tồn tại)
    static void remove(int n){
        System.out.println(setA.remove(n)); 
        System.out.println("Các phần tử của setA: " + setA);
    }
    
    //exist(value) : Kiểm tra xem phần tử ấy có tồn tại hay không. Trả về true | false 
    static void exist(int n){
        System.out.println(setA.contains(n));
    }
    
    //count() : Trả về số lượng phần tử trong tập hợp
    static void count(){
        System.out.println("Số phần tử của setA: " + setA.size()); 
    }
    
    //flush() : Làm trống tập hợp trả về true khi làm trống thành công 
    static void flush(){
        //System.out.println("Các phần tử của setA: " + setA);
        setA.clear(); 
        System.out.println(setA.isEmpty());
        //System.out.println("Các phần tử của setA sau khi clear: " + setA);
    }
}
