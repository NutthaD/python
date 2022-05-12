  
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class test {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] Venus){
//---1:Input---
	Scanner input = new Scanner(System.in);
	System.out.print("Input Mid value : ");
	double mid=input.nextDouble();
	System.out.print("Input Quize value : ");
	double qz=input.nextDouble();
	System.out.print("Input Final value : ");
	double fin=input.nextDouble();
	System.out.print("Input Name : ");
	String name=input.next();
	double score=0;
//---2:Process&Output---
	if((mid>=0)&&(mid<=20)&&(qz>=0)&&(qz<=50)&&(fin>=0)&&(fin<=30)){
	score=mid+qz+fin;
	System.out.println("Name : "+name);
	System.out.println("Score : "+score);
		if(score<50){
	System.out.println("Grade : F");
	}
		else if(score<55){
	System.out.println("Grade : D");
	}
		else if(score<60){
	System.out.println("Grade : D+");
	}
		else if(score<65){
	System.out.println("Grade : C");
	}
		else if(score<70){
	System.out.println("Grade : C+");
	}
		else if(score<75){
	System.out.println("Grade : B");
	}
		else if(score<80){
	System.out.println("Grade : B+");
	}
		else{
	System.out.println("Grade : A");
	}
}
	else{
	System.out.println("Wrong value");
}
}//end main
}//end class

