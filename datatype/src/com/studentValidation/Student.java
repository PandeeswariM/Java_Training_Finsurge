package com.studentValidation;

import java.util.Locale;
import java.util.Scanner;

public class Student {
    String name;
     String dept;
     String clg;
     int year;
     int jmark;
     int cmark;
     int omark;
     int total;
     int avg;
     String cls;
     String result;
    Scanner s=new Scanner(System.in);

       void getName(){
         System.out.println("Student name ");
         String nam=s.nextLine();
         if(nam.matches("^[A-Z][a-z]+[\\s][A-Z]{1}$") || nam.matches("^[A-Z][a-z]+[\\s][A-Z]{1}+[\\s][A-Z][a-z]+") || nam.matches("^[A-Z][a-z]+[\\s][A-Z][a-z]+[\\s][A-Z]{1}$")){
             this.name=nam;
         }
         else {
             System.out.println("Enter valid name ");
             getName();
         }
    }

    void getDept(){
        System.out.println("Department");
         this.dept=s.nextLine();
    }

    void getClg(){
        System.out.println("College ");
        this.clg=s.nextLine();

    }

    void getYear(){
        System.out.println("Year of Passing ");
         int yr=s.nextInt();
        if(yr>1970 && yr<=2025){
            this.year=yr;
        }
        else{
            System.out.println("Enter the year between 1970 and 2025 ");
            getYear();
        }
    }

    void getJmark(){
        System.out.println("Java score ");
            int jm = s.nextByte();
            if (jm >= 0 && jm < 101) {
                this.jmark = jm;
            }

        else{
            System.out.println("Enter between 0 & 100");
            getJmark();
        }
    }

    void getCmark(){
        System.out.println("C# mark ");
        int cm=s.nextByte();
        if(cm>=0 && cm<101){
            this.cmark=cm;
        }
        else{
            System.out.println("Enter between 0 & 100");
            getCmark();
        }
    }

    void getOmark(){
        System.out.println("0racle mark ");
        int om=s.nextByte();
        if(om>=0 && om<101){
            this.omark=om;

        }
        else{
            System.out.println("Enter between 0 & 100");
            getOmark();
        }

    }
   void getTotal(){
           this.total=jmark+omark+cmark;
   }
   void getAvg(){
           this.avg=(jmark+omark+cmark)/3;
   }


   void getCls(){
           if(avg>90){
               this.result="Pass";
               this.cls= "First class with Distinction";
           }
           else if(avg>60){
               this.result="Pass";
               this.cls= "First";
           }
           else if(avg<=60 && avg>40){
               this.result="Pass";
               this.cls= "Second";
           }
           else if(avg<=40 && avg<=35){
               this.result="Pass";
               this.cls= "Third";
           }
           else{
               this.result="Fail";
               this.cls="null";
           }
   }

  static int nostud(){
           Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of students ");
      int n=sc.nextInt();
      if(n<7 && n!=0){
          return n;
      }
      else{
          System.out.println("Enter range between 1 & 6");
          nostud();
      }
      return 0;
  }


    public static void main(String[] args) {
        int num=nostud();

            Student[] st=new Student[num];
            for(int i=0;i<num;i++){
                System.out.println("Student "+(i+1));
                st[i]=new Student();
                st[i].getName();
                st[i].getDept();
                st[i].getClg();
                st[i].getYear();
                st[i].getJmark();
                st[i].getCmark();
                st[i].getOmark();
                st[i].getTotal();
                st[i].getAvg();
                st[i].getCls();
                System.out.println();
            }
        System.out.println("Name Department College Year JavaMark C#Mark OracleMark Total Average Class");
            for(int j=0;j<num;j++){
                System.out.println(st[j].name+" "+st[j].dept.toUpperCase(Locale.ROOT)+" "+st[j].clg.toUpperCase(Locale.ROOT)+" "+st[j].year+" "+st[j].jmark+" "+st[j].cmark+" "+st[j].omark+" "+st[j].total+" "+st[j].avg+" "+st[j].cls+" "+st[j].result);
            }

    }
}
