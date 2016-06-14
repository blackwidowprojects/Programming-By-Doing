public class MySchedule {
    public static void main(String[] args) {
        
        // Use several variables to store the names of your classes and // their teachers. Then, display a nice little table displaying // your schedule.	Just FYI, my column of courses has a width of // 26 characters, and the teacher column has a width of 15. The // first and last lines are a plus sign, fifty dashes (a.k.a.   // minus signs) and another plus sign.
        
        String course1, course2, course3, course4, course5, prof1, prof2, prof3, prof4, prof5;
        
        course1 = "Computer Networks" ;
        course2 = "Data Communication Systems" ;
        course3 = "Optical Circuits" ;
        course4 = "Senior Project Laboratory" ;
        course5 = "Ethics in Engineering Technology" ;
        
        prof1 = "Prof. Gurkan" ;
        prof2 = "Prof. Gundrum" ;
        prof3 = "Prof. Maida" ;
        prof4 = "Prof. Moges" ;
        prof5 = "Prof. Moghaddam" ;
        
        System.out.println("");
        
        System.out.println( "+---------------------------------------------------------------------+");
        System.out.println( "| 1 |                             " + course1 + " |    " + prof1 + " |");
        System.out.println( "| 2 |                    " + course2 + " |   " + prof2 + " |");
        System.out.println( "| 3 |                              " + course3 + " |     " + prof3 + " |");
        System.out.println( "| 4 |                     " + course4 + " |     " + prof4 + " |");
        System.out.println( "| 5 |              " + course5 + " | " + prof5 + " |");
        System.out.println( "+---------------------------------------------------------------------+");
        
        System.out.println("");
        
    }
}