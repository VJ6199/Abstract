abstract class Marks{
    int T1 = 89, T2 = 95, H1 = 88, H2 = 92, M1 = 84, M2 = 99, S1 = 97, S2 = 100;
    abstract void overallscore();
    static void display(){
        System.out.println("total marks of students in A class");
    }
}
class Vijay extends Marks{
    void overallscore(int T2, int H2, int M2, int S2){
    }
    void overallscore(){
        System.out.println("total marks of vijay = "+(T2+H2+M2+S2));
    }
}
class Abhi extends Marks{
    void overallscore(int T1, int H2, int M1, int S2){
    }
    void overallscore(){
        System.out.println("total marks of Abhi = "+(T1+H2+M1+S2));
    }
}
class Nikhil extends Marks{
    void overallscore(int T2, int H1, int M1, int S1){
    }
    void overallscore(){
        System.out.println("total marks of Nikhil = "+(T2+H1+M2+S1));
    }
}
class Tharun extends Marks{
    void overallscore(int T1, int H1, int M2, int S1){
    }
    void overallscore(){
        System.out.println("total marks of Tharun = "+(T1+H1+M2+S1));
    }
}
class Akash extends Marks{
    void overallscore(int T2, int H1, int M2, int S2){
    }
    void overallscore(){
        System.out.println("total marks of Akash = "+(T2+H1+M2+S2));
    }
}
public class Student_college {
    public static void main(String[] args){
        Marks.display();
        Vijay score = new Vijay();
        score.overallscore();
        Akash score1 = new Akash();
        score1.overallscore();
        Abhi score2 = new Abhi();
        score2.overallscore();
       Tharun score3 = new Tharun();
        score3.overallscore();
        Nikhil score4 = new Nikhil();
        score4.overallscore();
    }
}
