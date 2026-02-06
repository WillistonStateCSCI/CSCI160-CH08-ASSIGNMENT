# CSCI160-CH08-EXERCISES
Programming Exercises From Java Illuminated Book by Anderson and Franceschi  
**Before You Begin:  Each test description will come with a compile and a run command for you to enter into the terminal.  This allows you to test your code with different starting arrays without having to go through user input each time.  Please compile and run using the terminal instead of the Run and Debug button.**  
## Q08_50 Instructions 
Write a value-returning method that returns the product of all the elements in an integer array  
**Note: The main method is completed for you.  Do not make ANY changes in the main method.**  
### Q08_50 Test 1  
**Terminal Compile Command:**  
*javac Q08_50/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_50 ArrayProduct 1 2 3 4 5 6*  
**Input:**  
*none*  
**Output:**  
The elements are 1 2 3 4 5 6  
The product of all elements in the array is 720  
### Q08_50 Test 2  
**Terminal Compile Command:**  
*javac Q08_50/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_50 ArrayProduct 1 22 3 44 5 66*  
**Input:**  
*none*  
**Output:**  
The elements are 1 22 3 44 5 66  
The product of all elements in the array is 958320  
## Q08_51 Instructions  
Write a void method that multiplies by 2 all the elements of an array of *floats*  
**Note: The main method is completed for you.  Do not make ANY changes in the main method.**  
### Q08_51 Test 1  
**Terminal Compile Command:**  
*javac Q08_51/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_51 ZeroArrayElements 1 2 3 4 5 6*  
**Input:**  
*none*  
**Output:**  
The elements are 1 2 3 4 5 6  
Calling zeroArray method  
The elements are 0 0 0 0 0 0  
### Q08_51 Test 2  
**Terminal Compile Command:**  
*javac Q08_51/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_51 ZeroArrayElements 1 22 3 44 5 66*  
**Input:**  
*none*  
**Output:**  
The elements are 1 22 3 44 5 66  
Calling zeroArray method  
The elements are 0 0 0 0 0 0  
## Q08_53 Instructions  
Write a method that returns the percentage of elements greater than or equal to 90 in an array of *ints*  
**Note: The main method is completed for you.  Do not make ANY changes in the main method.**  
### Q08_53 Test 1  
**Terminal Compile Command:**  
*javac Q08_53/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_53 ArrayElements90OrMore 90 80 91 82 93 80 99 100 120*  
**Input:**  
*none*  
**Output:**  
The elements are 90 80 91 82 93 80 99 100 120  
The percentage of elements 90 or greater is 66.7%  
### Q08_53 Test 2  
**Terminal Compile Command:**  
*javac Q08_53/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_53 ArrayElements90OrMore 90 80 91 95 93 80 99 100 120*  
**Input:**  
*none*  
**Output:**  
The elements are 90 80 91 95 93 80 99 100 120  
The percentage of elements 90 or greater is 77.8%  
## Q08_54 Instructions  
Write a method that returns the difference between the smallest and largest elements in an array of doubles  
**Note: The main method is completed for you.  Do not make ANY changes in the main method.**  
### Q08_54 Test 1  
**Terminal Compile Command:**  
*javac Q08_54/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_54 ArrayDifference 1.5 2.6 3.1 5.9 10.6 0.5*  
**Input:**  
*none*  
**Output:**  
The elements are 1.5 2.6 3.1 5.9 10.6 0.5  
The difference between the largest and smallest elements is 10.1  
### Q08_54 Test 2   
**Terminal Compile Command:**  
*javac Q08_54/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_54 ArrayDifference 2.5 2.6 2.999 2.3 2.111 2.7*  
**Input:**  
*none*  
**Output:**  
The elements are 2.5 2.6 2.999 2.3 2.111 2.7  
The difference between the largest and smallest elements is 0.8879999999999999  
## Q08_56 Instructions 
Write a method that returns the percentage of the number of elements that have the value of *true* in an array of *booleans*  
**Note: The main method is completed for you.  Do not make ANY changes in the main method.**  
### Q08_56 Test 1   
**Terminal Compile Command:**  
*javac Q08_56/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_56 PercentTrue true false true false false false true*  
**Input:**  
*none*  
**Output:**  
The elements are true false true false false false true  
The percentage of elements having the value true is 42.9%  
### Q08_56 Test 2   
**Terminal Compile Command:**  
*javac Q08_56/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_56 PercentTrue true false false false false false true*  
**Input:**  
*none*  
**Output:**  
The elements are true false false false false false true  
The percentage of elements having the value true is 28.6%  
## Q08_60 Instructions  
Write an array-returning method that takes an array of *ints* as a parameter and returns an array of *booleans*, assigning *true* for any element of the parameter array greater than or equal to 100; and *false* otherwise  
**Note: The main method is completed for you.  Do not make ANY changes in the main method.**  
### Q08_60 Test 1   
**Terminal Compile Command:**  
*javac Q08_60/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_60 StringToCharArray Hello*  
**Input:**  
*none*  
**Output:**  
The elements of the char array are H e l l o  
### Q08_60 Test 2   
**Terminal Compile Command:**  
*javac Q08_60/\*.java*  
**Terminal Run Command:**  
*java -cp Q08_60 StringToCharArray HappyCoding!*  
**Input:**  
*none*  
**Output:**  
The elements of the char array are H a p p y C o d i n g !  
