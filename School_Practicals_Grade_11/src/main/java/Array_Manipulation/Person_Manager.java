package Array_Manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Person_Manager {

    private Person person_array[] = new Person[100]; 
    private int size = 0;
    
    public Person_Manager(String file_path){
        
         Scanner sc;
        try {
            sc = new Scanner(new File(file_path));
            
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
         
         
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
         

    }
    
    public Person BinearySearch(String name){
        
        NameSort();
        
        int start = 0; 
        int end = size - 1;
        
        while(start < end){
            
            int mid = (start + end) / 2;
            
            if(person_array[mid].getName().compareTo(name) == 0){
                return person_array[mid];
            }
            else if(person_array[mid].getName().compareTo(name) > 0){
                end = mid - 1;
            }
            else if(person_array[mid].getName().compareTo(name) < 0){
                start = mid + 1;
            }
        }
        return null;
    }
    
    //by name
    public void NameSort(){
        
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
             
                if(person_array[i].getName().compareTo(person_array[j].getName()) > 0){
                    Person temp = person_array[j];
                    person_array[j] = person_array[i];
                    person_array[i] = temp;
                }
                
            }
            
        }
        
    }
    //by age
    public void AgeSort(){
        
        for(int last_index = size - 1; last_index >= 0; last_index--){
            for(int current_index = 0; current_index < last_index ; current_index++){
                
                if(person_array[current_index].getAge() > person_array[last_index].getAge()){
                    Person temp = person_array[current_index];
                    person_array[current_index] = person_array[last_index];
                    person_array[last_index] = temp;
                }
            }
        }
        
    }
    
    public String toString(){
        
        String output = "";
        
        for(int i = 0 ; i < size; i++){
            output += person_array[i].toString() + "\n";
        }
        
        return output;
    }
    
    public void shiftUp(int pos){
        size++;
        for(int i = size; i > pos;i--){
                                            //if error, change to i - 1
            person_array[i] = person_array[i - 1];
            
        }
        
        
    }
    
    public void insertPerson(Person p){
        NameSort();
        int pos = 0;
            
//        System.out.println(person_array[pos].toString());
//            System.out.println(p.toString());
        
        while(person_array[pos].getName().compareTo(p.getName()) < 0){
                      
            pos++;
            if(pos == size){
                break;
            }
            
        }
        shiftUp(pos);
        person_array[pos] = p;
        PrintPerson(p);
        
    }
    
    private void PrintPerson(Person p){
        
        String name = p.getName();
        String surname = p.getSurname();
        int age = p.getAge();
        
        try {
            
            FileWriter fw = new FileWriter(new File("data\\Persons.txt"),true);
            PrintWriter pw = new PrintWriter(fw,true);
            pw.println(name + "#" + surname + "#" + age + "\n");
           
            pw.close();
            
        } catch (IOException ex) {
            
            System.out.println("File not found");
        }
        
        
    }
    
    public String deletePerson(String first_name){
        int person_pos = 0;
        for(int i = 0 ; i < size; i++){
            if(person_array[i].getName().equals(first_name)){
                person_pos = i;
                break;
            }
        }
        
        for(int j = person_pos; j < size - 1; j++){
            person_array[j] = person_array[j + 1];
        }
        return("Person Succesfully delted");
    }
    
    
    
    
    
}
