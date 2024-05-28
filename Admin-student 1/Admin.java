class Admin extends User {
     String staffNo;

     String upLoadResults(String course, float score) {
         System.out.println(course + " " + score);
         return course;
     }
 }
