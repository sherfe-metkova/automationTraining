package Education;

import java.util.HashMap;
import java.util.Map;

public class Student implements Comparable{
    private Map<String, Double> scores;

    public Student(){
        scores = new HashMap<>();
    }

    public void addScore(String subject, double score){
        scores.put(subject, score);
    }

    private double averageScore(){
        double sum=0;
        for(String key : scores.keySet()){
            double score = scores.get(key);
            sum += score;
        }
        return sum/scores.size();
    }

    @Override
    public int compareTo(Object o) {
        return (int) (averageScore()-((Student)o).averageScore());
    }
}
