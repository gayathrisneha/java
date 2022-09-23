package edu.in;
class SubjectMarks {
	
	int ScienceMarks;
	int MathsMarks; 
	int GKMarks;
	}


public class Subject {

	public static void main(String[] args) {
		SubjectMarks Subj1 = new SubjectMarks();
		Subj1.ScienceMarks = 60;
		Subj1.MathsMarks = 80;
		Subj1.GKMarks = 70;

		SubjectMarks Subj2 = new SubjectMarks(); 
		Subj2.ScienceMarks = 85;
		Subj2.MathsMarks = 50;
		Subj2.GKMarks = 95;
       //student 1
		System.out.println("Marks for first object:"); 
		System.out.println(Subj1.ScienceMarks); 
		System.out.println(Subj1.MathsMarks); 
		System.out.println(Subj1.GKMarks);
        //student 2
		System.out.println("Marks for second object:");
		System.out.println(Subj2.ScienceMarks); 
		System.out.println(Subj2.MathsMarks); 
		System.out.println(Subj2.GKMarks);

	}

}
