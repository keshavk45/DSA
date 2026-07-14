package OOPS;

//iss pure class ko ENCAPSULATION/DATA HIDING kehte h kyunki hamne rollno ko private kar diya h aur usko access karne ke liye getter and setter function ka use kiya h
class Students{
        String name;
        private int rollno;
        double cgpa;
        // private void print(){
        //     System.out.print(rollno);
        // }

        public void print(){  //isko bhi getter keh sakte h because it is returning some private value and we can access it outside the class
            System.out.print(rollno);
        }

        int getRno(){ //getter kehte h isse iska kaam h jo chiz nahi show ho sakti usse get karna
            return rollno;
        }

        void setRno(int x){ //setter kehte h isse iska kaam h jo chiz nahi show ho sakti usse set karna
            rollno = x;
        }


        // yaha par print ho jaega private class
        // iska mtlb private class and method sirf uske class k andar hi use kar sakte h
        // same agar void k aage private void print() hota toh woh bhi error deta

        // public void p(){
        //     print(); // ab private method ko access kar sakte h
        // }

    }
public class PrivateKeyword {

    public static void main(String[] args){
        Students s1 = new Students();
        // There are also some default values like agar ham s1.cgpa ko print kare toh answer 0.0 show karega
        // and if agar ham class m hi suppose cgpa = 8.8 likh de then its default calue will be 8.8 it means agar kuch na change karke sidha print kar toh 8.8 show karega


        s1.name = "keshav";
        s1.cgpa = 22.43;
        // s1.rollno = 12; it shows error because rollno is private and we cannot access it outside the class
        // private class ko print bhi nahi kar sakte h aur na hi usko access kar sakte h outside the class

        s1.setRno(12); //setter function ko use karke private class ko set kar sakte h
        s1.print(); //getter function ko use karke private class ko print kar sakte
        System.out.println(s1.getRno());
    }
    
    
}
