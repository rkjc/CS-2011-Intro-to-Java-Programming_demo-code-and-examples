package gameStuff;

public class mapPractice01 {
    
    public static void main(String[] args) {
        System.out.println("------ program is running -------");

        //                |                           |
        String label01 = "│       engine room         │";


        System.out.println("""
┌───────────────────────────┐       
│                           │
"""
+label01+        
"""

│                           │     
│                           │       
│                           └───────
│                                   
│                                   
│                           ┌───────
│                           │       
│                           │       
└────────────┐    ┌─────────┘       
             │    │                 
             │    │                 
             │    │                 
             │    │                 
             │    │                 
         ────┘    └───            
                """);



        System.out.println("-------- program ended ---------");
    } 

}
