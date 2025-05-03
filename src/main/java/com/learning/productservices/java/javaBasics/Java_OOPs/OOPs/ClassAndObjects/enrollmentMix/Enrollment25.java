package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
public class Enrollment25 {
    private int year;
    private int semester;
    private Student25 student;
    private List<Subject25> subject;

    Enrollment25(int year, int sem, Student25 std){
        this.year = year;
        semester = sem;
        student = std;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setSemester(int sem){
        semester = sem;
    }
    public int getSemester() {
        return semester;
    }
    public void setStudent(Student25 std) {
        student = std;
    }
    public Student25 getStudent25(){
        return student;
    }
    public void setSubject(List<Subject25> subID) {
        subject = subID;
    }
    public List<Subject25> getSubject25() {
        return subject;
    }
    public double calGPA(){
        int unit = 0;
        int totalunit = 0;
        double grade = 0.0;
        double totalgrade = 0.0;
        double gpa = 0.0;
        for(Subject25 Obj25 : subject){
            Obj25.toString();
            grade = Obj25.getGrade();
            unit = Obj25.getUnit();
            totalunit += unit;
            totalgrade += (double)unit * grade;
            gpa = (totalgrade) / (totalunit);
        }
        return gpa;
    }
    public String toString() {
        return "Year: " + year + "Semester: " + semester + "Student: " + student + "Subject: " + subject + "\n";
    }

    public static void main(String [] args){
			
		Faculty25 fac = new Faculty25("01","Science and Engineering","59 M1","Kasetsart university");
		//teacher's faculty
		Teacher25 tea = new Teacher25("3470012211679","Sawinee sangsuriyan","838/2 Sakhon Nakhon","B5204",fac);
		//advisor
		Faculty25 facStd = new Faculty25("01","Science and Engineering","59 M.1","Kasetsart University");
		//std's faculty
		Student25 std = new Student25("111", "Wayo Chaiyaphet", "222/2 Kalasin","b6240202058" ,facStd , tea);
	
		//----Subject---------------------------------------------------
		Teacher25 tea1 = new Teacher25("3470012211679","Sawinee Sangsuriyan","338 Sakhon Nakhon","B52051",fac);
		Subject25 sub1 = new Subject25("02739214", "OOP", 3 ,tea1);
		sub1.setGrade(3.5);
	
		Teacher25 tea2 = new Teacher25("3427001222229","Siriporn Sansee","338 Sakhon Nakhon","B52052",fac);
		Subject25 sub2 = new Subject25("02739201", "Data Structure", 3 ,tea2);
		sub2.setGrade(4.0);
			
		Faculty25 fac1 = new Faculty25("02","Management","59 M.1","Kasetsart University");
		Teacher25 tea3 = new Teacher25("3470012211111","Darica Jansee","868/1 Sakhon Nakhon","B52053",fac1);
		Subject25 sub3 = new Subject25("01911201", "English I", 3 ,tea3);
		sub3.setGrade(3.5);
		
		List<Subject25> sub = new ArrayList<Subject25>();
		sub.add(sub1);
		sub.add(sub2);
		sub.add(sub3);

		Enrollment25 enrollment = new Enrollment25(2563, 1, std);
		enrollment.setSubject(sub);
		System.out.println(enrollment);

		DecimalFormat formatter = new DecimalFormat("#0.00");
		double gpa = enrollment.calGPA();
		System.out.println("GPA: " + formatter.format(gpa));
		
	}

}  
