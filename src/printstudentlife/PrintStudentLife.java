
package printstudentlife;

/**
 *
 * @author srinivsi
 */
public class PrintStudentLife {

    /**
     * store and print student details
     */
    public static void main(String[] args) 
    {
       Student[] list = new Student[4]; // array of objects
       //create object fro 3 student , store and print value
       Student s1 = new Student();
       s1.setName("peter");
       s1.setAge(23);
       Student s2 = new Student();
       s2.setName("ranbir");
       s2.setAge(23);
       Student s3 = new Student();
       s3.setName("vani");
       s3.setAge(20);
       Student s4 = new Student();
       s4.setName("vani");
       s4.setAge(20);
       list[0]=s1;
       list[1]=s2;
       list[2]=s3;
       list[3]=s4;
       for(int i=0;i<list.length;i++ )
       {
           System.out.println(list[i].getName() + list[i].getAge());
       }
    }
    
}
