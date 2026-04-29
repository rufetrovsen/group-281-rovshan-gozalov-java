package Classwork_11;

import java.util.ArrayList;

public class Student {
    String name;
    int grade;
    ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int grade) {
        this.name  = name;
        this.grade = grade;
    }

    public void addMark(int mark) { marks.add(mark); }

    public double average() {
        int sum = 0;
        for (int m : marks) {
			sum += m;
		}
        return (double) sum / marks.size();
    }

    public int bestMark() {
        int best = 0;
        for (int m : marks) {
			if (m > best) {
				best = m;
			}
		}
        return best;
    }

    public static void main(String[] args) {
        Student s = new Student("Аня", 7);
        s.addMark(5); s.addMark(4); s.addMark(5); s.addMark(3);
        System.out.println("Среднее: " + s.average());  // 4.25
        System.out.println("Лучшая: "  + s.bestMark()); // 5
    }
}