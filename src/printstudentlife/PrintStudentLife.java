package printstudentlife;
public class PrintStudentLife {
    public static void main(String[] args) 
    {
       Student[] list = new Student[3];
       Student s1 = new Student();
       s1.setName("Stuti");
       s1.setAge(19);
       Student s2 = new Student();
       s2.setName("Tressa");
       s2.setAge(19);
       Student s3 = new Student();
       s3.setName("Heli");
       s3.setAge(18);       
       list[0]=s1;
       list[1]=s2;
       list[2]=s3;
       for(int i=0;i<list.length;i++ )
       {
           System.out.println(list[i].getName() + list[i].getAge());
       }
    }
}
