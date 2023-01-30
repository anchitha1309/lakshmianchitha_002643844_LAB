/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Program {
       public static void main(String[] args){
          int[] arr={1,2,3,4,5};
 
        for(int i=0;i <arr.length;i++)
        {
            if(i%2==0){
                arr[i] =  arr[i]*2;
            }
            else{
                arr[i]= arr[i]*3;
            }
            System.out.println(arr[i]);
        }
        
       
    }
}
