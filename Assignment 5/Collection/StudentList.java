//Write a program towrite 5 student records into a Hashtable 
//and display the student whose marks are the highest in the class.
import java.util.*;
public class StudentList {
    public static void main(String args[])
    {
        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
        ht.put("Abhi",68);
        ht.put("Bhavana",78);
        ht.put("Chandru",88);
        ht.put("Deepak",92);
        ht.put("Fakri",75);
        Enumeration em=ht.keys();
        while(em.hasMoreElements())
        {
            String key=em.nextElement().toString();
            String value=ht.get(key).toString();
            System.out.println(key+" "+value);
        }
        String highestScorer = "";
        int highestScore = 0;
        for (String name : ht.keySet()) 
        {
            int score = ht.get(name);
            if (score > highestScore) 
            {
                highestScorer = name;
                highestScore = score;
            }
        }
        System.out.println(highestScorer + " scored the highest marks: " + highestScore);
    }
}
