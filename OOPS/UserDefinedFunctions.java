package OOPS;
// public static class Student{ 
//         String name;
//         int rollno;
//         double cgpa;
//     }

public class UserDefinedFunctions {
    public static class Student{ // khudka ek datatype bana liya h
        String name;
        int rollno;
        double cgpa;
    }
    
    // iss class ko ham dusre package m bhi use kar sakte h bas uske liye hame isko public class banana padega aur fir uska object bana ke use karna padega

    //iss class m zaruri nahi h public static likhna ham sirf class fir uska naam loikh sakte h and isko public class userdefinedfunctions k upar bhi likh sakte h 
    public static void main(String[] args) {
        Student s1 = new Student(); // ab s ek object h Student class ka
        s1.name = "keshav";
        s1.rollno = 18;
        s1.cgpa = 22.43;

        Student s2 = new Student();
        s2.name = "kev";
        s2.rollno = 12; 
        s2.cgpa = 20.50;

        // isse hum input bhi le skte h user se aur uske baad print bhi kr skte h





        // ab mujhe agar suppose naam age roll no wagera store karna h kisi single m array m toh m apna ek alag datatype banaunga
        // ex - "keshav" 18 22.43 @134 
        
    }
}
    