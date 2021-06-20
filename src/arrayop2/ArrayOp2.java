/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayop2;

import java.util.Scanner;

/**
 *
 * @author Vuthy
 */
public class ArrayOp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner(System.in);
        boolean x = true;
        int arr[] = new int[100];
        int i=-1;
        int index;
        int num;
        do{
            if(i<0){
                i++;
                System.out.println("\nArray Operator");
                System.out.println("\n1.Add");
                System.out.println("2.Exit");
                System.out.print("\nChoose number :");
                num = cin.nextInt();
                switch(num){
                    case 1 ->{
                        System.out.print("\nValue["+i+"]:");
                        arr[i] = cin.nextInt();
                    }
                    default->{
                        x=false;
                    }
                } 
            }else{
                System.out.println("\nArray Operator");
                System.out.println("1.Add");
                System.out.println("2.Insert");
                System.out.println("3.Delete");
                System.out.println("4.Update");
                System.out.println("5.Display");
                System.out.println("6.Sort");
                System.out.println("7.Search");
                System.out.print("\nChoose number :");
                num = cin.nextInt();
                switch(num){
                    case 1 ->{
                        i++;
                        int y=1;
                        if(i==0){
                            System.out.print("\nValue["+i+"]:");
                            arr[i] = cin.nextInt();
                        }else{
                            System.out.print("\nValue["+i+"]:");
                            arr[i] = cin.nextInt();
                            for(int j=0;j<i;j++){
                                if(arr[i]==arr[j]){
                                    y=0;
                                    i--;  
                                }
                            }  
                        }
                        if(y==1){
                            System.out.println("Data has added.");
                        }else{
                            System.out.println("Data is already exist");
                        }         
                    }
                    case 2 ->{
                        System.out.print("Please input index to insert :");
                        index = cin.nextInt();
                        if(index<=i){
                            i++;
                            for(int k=i;k>=index;k--){
                                arr[k+1]=arr[k];
                            }
                            System.out.print("Insert value["+index+"] : ");
                            arr[index] = cin.nextInt();
                        }else{
                            System.out.println("Index out of Array Element");
                        }  
                    }
                    case 3 ->{
                        System.out.println("\n1.Delete by Index");
                        System.out.println("2.Delete by Number");
                        System.out.print("Choose : ");
                        num = cin.nextInt();
                        switch(num){
                            case 1->{
                                System.out.print("Please input index to delete :");
                                index = cin.nextInt();
                                if(index<=i){
                                    for(int l=index;l<=i;l++){
                                        arr[l]=arr[l+1];
                                    }
                                    System.out.println("Data has deleted.");
                                    i--;
                                }else{
                                    System.out.println("Index out of Array Element");
                                }
                            }
                            case 2->{
                                boolean a=false;
                                System.out.print("Please input Number to delete :");
                                int numInput = cin.nextInt();
                                for(int j=0;j<=i;j++){
                                    if(arr[j]==numInput){
                                        for(int l=j;l<=i;l++){
                                            arr[l]=arr[l+1];
                                        }
                                        i--;
                                        a=true;
                                        
                                    }
                                }
                                if(a==true){
                                    System.out.println("\nData has deleted!");
                                }else{
                                    System.out.println("\nNumber Not found!");
                                }
                            }
                            default->{
                                x=false;
                            }
                        }
                        
                        
                    }
                    case 4 ->{
                        System.out.println("\n1.Update by Index");
                        System.out.println("2.Update by Number");
                        System.out.print("Choose : ");
                        num = cin.nextInt();
                        switch(num){
                            case 1->{
                                System.out.print("Please input index to update : ");
                                index = cin.nextInt();
                                if(index<=i){
                                    System.out.print("Input new value : ");
                                    arr[index]=cin.nextInt();
                                    System.out.println("Data has updated.");
                                }else{
                                    System.out.println("Index out of Array Element");
                                }
                            }
                            case 2->{
                                boolean a=false;
                                System.out.print("Please input Number to update :");
                                int numInput = cin.nextInt();
                                    for(int j=0;j<=i;j++){
                                        if(arr[j]==numInput){
                                            System.out.print("\nInput new Number : ");
                                            arr[j]=cin.nextInt();
                                            a=true;
                                        }
                                        
                                }
                                if(a==true){
                                    System.out.println("\nNumber has updated!");
                                }else{
                                    System.out.println("\nNumber Not found");
                                }
                                    
                            }
                        }
                        
                    }
                    case 5 ->{
                        for(int j=0;j<=i;j++){
                            System.out.print(arr[j]+"\t");
                        }
                    }
                    case 6 ->{
                        System.out.println("\t\n1. Descending");
                        System.out.println("\t\n2. Ascending");
                        System.out.print("Choose number : ");
                        int chooseSort = cin.nextInt();
                        boolean con=false;
                        int temp;
                        switch(chooseSort){
                            case 1 ->{
                                while(con==false){
                                    con=true;
                                    for(int j=0;j<i;j++){
                                        if(arr[j]<arr[j+1]){
                                            temp=arr[j];
                                            arr[j]=arr[j+1];
                                            arr[j+1]=temp;
                                            con=false;
                                        }   
                                    }
                                } 
                            }
                            case 2 ->{
                                while(con==false){
                                    con=true;
                                    for(int j=0;j<i;j++){
                                        if(arr[j]>arr[j+1]){
                                            temp=arr[j];
                                            arr[j]=arr[j+1];
                                            arr[j+1]=temp;
                                            con=false;
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Data has been sorted.");
                    }
                    case 7 ->{
                        System.out.print("Input index to search :");
                        index = cin.nextInt();
                        if(index<=i){
                            System.out.print("\nValue index "+index+" is "+arr[index]);
                        }else{
                            System.out.println("Index out of Array elements");
                        }
                    }
                    default ->{
                        x=false;
                    }
                }
            }
        }while(x==true);
    }
    
}
