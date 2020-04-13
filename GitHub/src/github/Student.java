/**
 * GitHub Exercise - Practice using GitHub w/ NetBeans
 * Student.java
 * Purpose: Creates a new student object which holds information on a singular 
 * student such as name, year, grade, and more.
 * 
 * @author <Team Names>
 * @version 1.0 <Date>
 */
// Packages
package github;

// Student - Java Class
public class Student {
    // Class Variables
    private String name; // Student Name
    private int year; // Student Year
    private int grade; // Student Grade (0-100)
    private String gender;
// Create code to...
    // Add one new student attributes
    
    // Constructors
    public Student() {
        // Assign default info
        name = " ABC DEF";
        year = 2;
        grade = 80;
        gender = "Male";
               
        // Create code to...
        // Assign new default attribute
    }
    /*
    @param:String studentName
    @param:int studentYear 
    @param:int studentGrade
    @param:String  studentGender
    
    */
    public Student(String studentName, int studentYear, int studentGrade, String studentGender) {
        // Assign give info (Parameters may change)
        name = studentName;
        year = studentYear;
        grade = studentGrade;
        gender = studentGender;
        // Create code to...
        // Assign new attribute
    }
    
    // Accessors
    /**
     * This method returns the name of the student
     * 
     * @return Name of student
     */
    public String getName() {
        return name;
    }
    /**
     * This method returns the current year of the student
     * 
     * @return Year of student
     */
    public int getYear() {
        return year;
    }
    /**
     * This method returns the grade of the student
     * 
     * @return Grade of student
     */
    public int getGrade() {
        return grade;
    }
    // Create code to...
    // Add a new accessor method for new attribute
    public String getGender(){
        
        return gender;
    }
    
    // Mutators
    /**
     * This method sets the name of the student
     * 
     * @param newName New name of the student
     */
    /*
    @param: String name
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * This method sets the year of the student
     * 
     * @param newYear New year of the student
     */
    
    /*
    param: int year
    */
    public void setYear(int year) {
       if(1<=year || 4 >=year){
            this.year = year;
        }
        
        else{
            System.out.println("Please enter between 1 and 4. Please try again");
        }
    }
    /**
     * This method sets the grade of the student
     * 
     * @param newGrade New grade of the student
     */
    
    /*
    param: int grade
    */
    public void setGrade(int grade) {
       
            
            
       if(grade<100||grade>0){
        this.grade = grade;
    }
        else{
            System.out.println("The grade should be between 0 and 100 ");
            
       
        
    }
    }  
    public void setGender(String gender){
        this.gender = gender; 
    }
    // Create code to...
    // Add a new mutator method for new attribute
    
    // String Method
    /**
     * Overrides the string value returned when printed
     * 
     * @return String of student info
     */
    @Override
    public String toString() {
        // Create printed string
        // Create code to...
        // Add on new attribute to string
        String Yearinfo = null;
        if (year==1){
           
            Yearinfo="Freshman";
        }
        if (year==2){
           
            Yearinfo="Sophomore";
        }
        if (year==3){
           
            Yearinfo="Junior";
        }
        if (year==4){
           
            Yearinfo="Senior";
        }
        
        
        return "Name is : " + name+ " Year is : "+ Yearinfo + "Grade is : " +grade ;
         
    }
}
// End of Class