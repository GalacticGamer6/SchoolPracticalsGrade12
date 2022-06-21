package Array_Manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Person_Manager {

    private Person person_array[] = new Person[100]; 
    private int size = 0;
    
    public Person_Manager(String file_path) throws FileNotFoundException{
        
         Scanner sc = new Scanner(new File(file_path));
         
         while(sc.hasNext()){
             
             String line = sc.nextLine();
             
             Scanner line_scanner = new Scanner(line).useDelimiter("#");
             
             String name = line_scanner.next();
             String surname = line_scanner.next();
             int age = line_scanner.nextInt();
             
             Person current_person = new Person(name, surname, age);
             person_array[size] = current_person;
             size++;
         }
    }
    
    public Person BinearySearch(Person Sorted_Array[], String name){
        int start = 0; 
        int end = size - 1;
        
        while(start < end){
            
            int mid = (start + end) / 2;
            
            if(person_array[mid].getName().compareTo(name) == 0){
                return person_array[mid];
            }
            else if(person_array[mid].getName().compareTo(name) > )
        }
    }
    
}
