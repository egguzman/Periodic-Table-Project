package JavaProject;
import java.util.Scanner;


public class JavaProject {
 public static String[][] elements;
String[][] headings = { { "Name","Symbol","Electrons","Protons","Type" }}; 

    public static void main(String[] args) {
        fillElements();
       
        System.out.println("		Periodic table		\n");
       Scanner nameinput = new Scanner(System.in); 
      System.out.println("\nEnter your name to continue:");
        String userName = nameinput.nextLine(); 
        
      menusearch(userName);
       
       
       
    }
    
   
    public static  void fillElements(){//fills the array with information.
     String[][] elementsfill ={{ "Name","Symbol","Electrons","Protons","Type" },{"Hydrogen","H","1","1","g"},{"Helium","He","2","2","g"},{"Lithium","Li","3","3","s"},
         {"Beryllium","Be","4","4","s"},{"Boron","B","5","5","s"},{"Carbon","C","6","6","s"},{"Nitrogen","N","7","7","g"}
     ,{"Oxygen","O","8","8","g"},{"Flourine","F","9","9","g"},{"Neon","Ne","10","10","g"},{"Sodium","Na","11","11","s"}
     ,{"Magnesium","Mg","12","12","s"},{"Aluminium","AI","13","13","s"},{"Silicon","Si","14","14","s"},{"Phosphorus","P","15","15","s"}
     ,{"Sulfur","S","16","16","s"},{"Chlorine","CI","17","17","s"},{"Argon","Ar","18","18","g"},{"Pottasium","K","19","19","s"}
     ,{"Calcium","Ca","20","20","s"},{"Scandium","Sc","21","21","s"},{"Titanium","Ti","22","22","s",},{"Vanadium","V","23","23","s"}
     ,{"Chromium","Cr","24","24","s"},{"Manganese","Mn","25","25","s"},{"Iron","Fe","26","26","s"},{"Cobalt","Co","27","27","s"}
     ,{"Nickel","Ni","28","28","s"},{"Copper","Cu","29","29","s"},{"Zinc","Zn","30","30","s"},{"Gallium","Ga","31","31","s"}
     ,{"Germanium","Ge","32","32","s"},{"Arsenic","As","33","33","s"},{"Selenium","Se","34","34","s"},{"Bromine","Br","35","35","s"}
     ,{"Krypton","Kr","36","36","g"},{"Rubidium","Rb","37","37","s"},{"Strontium","Sr","38","38","s"},{"Yttrium","Y","39","39","s"}
     ,{"Zirconium","Zr","40","40","s"},{"Niobium","Nb","41","41","s"},{"Molybdenum","Mo","42","42","s"},{"Technetium","Tc","43","43","s"}
     ,{"Ruthenium","Ru","44","44","s"},{"Rhodium","Rh","45","45","s"},{"Palladium","Pd","46","46","s"},{"Silver","Ag","47","47","s"}   
     ,{"Cadium","Cd","48","48","s"},{"Indium","In","49","49","s"},{"Tin","Sn","50","50","s"},{"Antimony","Sb","51","51","s"}
     ,{"Tellenium","Tn","52","52","s"},{"Iodine","I","53","53","s"},{"Xenon","Xe","54","54","g"},{"Caesium","Cs","55","55","s"}
     ,{"Barium","Ba","56","56","s"},{"Lanthnum","La","57","57","s"},{"Cerium","Ce","58","58","s"},{"Praseodymium","Pa","59","59","s"}
     ,{"Neodymium","Nd","60","60","s"},{"Promethium","Pm","61","61","s"},{"Samarium","Sm","62","62","s"},{"Europium","Eu","63","63","s"}
     ,{"Gadolinium","Ga","64","64","s"},{"Terbium","Tb","65","65","s"},{"Dysprosium","Dy","66","66","s"},{"Holmium","Ho","67","67","s"}
     ,{"Erbium","Er","68","68","s"},{"Thulium","Tm","69","69","s"},{"Ytterbium","Yb","70","70","s"},{"Lutetium","Lu","71","71","s"}
     ,{"Hafnium","Hf","72","72","s"},{"Tantalum","Ta","73","73","s"},{"Tungsten","W","74","74","s"},{"Rhenium","Ta","75","75","s"}
     ,{"Osmium","Os","76","76","s"},{"Iridium","Ir","77","77","s"},{"Platinum","Pt","78","78","s"},{"Gold","Au","79","79","s"}
     ,{"Mercury","Hg","80","80","s"},{"Thalium","TI","81","81","s"},{"Lead","Pb","82","82","s"},{"Bismuth","Bi","83","83","s"}
     ,{"Polonium","Po","84","84","s"},{"Astatine","At","85","85","s"},{"Radon","Rn","86","86","g"},{"Francium","Fr","87","87","s"}
     ,{"Radium","Ra","88","88","s"},{"Actinium","Ac","89","89","s"},{"Thorium","Th","90","90","s"},{"Protactinium","Pa","91","91","s"}
     ,{"Uranium","U","92","92","s"},{"Neptunium","Pa","93","93","s"},{"Plutonium","Pu","94","94","s"},{"Americium","Am","95","95","s"}
     ,{"Curium","Cm","96","96","s"},{"Berkelium","Bk","97","97","s"},{"Californium","Cf","98","98","s"},{"Einsteinium","Es","99","99","s"}
     ,{"Fermium","Fm","100","100","s"},{"Mendelevium","Md","101","101","s"},{"Nobelium","No","102","102","s"},{"Lawrencium","Lr","103","103","s"}
     ,{"Rutherfordium","Rf","104","104","s"},{"Dubnium","Db","105","105","s"},{"Seaborgium","Sg","106","106","s"},{"Bohrium","Bh","107","107","s"}
     ,{"Hassium","Hs","108","108","s"},{"Meitnerium","Mt","109","109","s"},{"Darmstadtium","Ds","110","110","s"},{"Roentgenium","Rg","111","111","s"}
     ,{"Copernicium","Cn","112","112","s"},{"Nihonium","Nh","113","113","s"},{"Flerovium","FI","114","114","s"},{"Moscovium","Mc","115","115","s"}
     ,{"Livermorium","Lv","116","116","s"},{"Tennessine ","Ts","117","117","s"},{"Oganesson","Og","118","118","s"}
  };
     
            elements=new String[elementsfill.length][elementsfill[0].length];
      for (int row = 0;row < elementsfill.length; row++) {
      for (int col = 0; col < elementsfill[0].length; col++) {
          elements[row][col]=elementsfill[row][col].trim();
      }
     
    }
     
      
     
    }
    
    public static void menusearch( String userName){//prints the menu of the program
        
        
        System.out.println("\n\n1.Search any element through entering atomic number");
        System.out.println("2.Search an elements protons and electrons");
        System.out.println("3.Search elements that are gases or solids");
        System.out.println("4.Search an elements name by atom number");
        System.out.println("5.Search an element name by with protons or Electrons");
         System.out.println("6.Exit");
         
         
         Scanner nameinput = new Scanner(System.in);  
        
           
           System.out.println("Enter your Option");
            String option = nameinput.nextLine(); 
            
            if(option.equals("1")){
               
                
           System.out.println("Enter the atomic number to search the element");
            int number =nameinput.nextInt();
            
                if (number>118 || number<1) {
                    System.err.println(" The atomic number should be between 1 and 118");
                    menusearch(userName);
                }
                
                searchBytomicenumber(number);
                
                menusearch(userName);
                
            }else if(option.equals("2")){
                
               System.out.println("Enter the elements name");  
             String elementname = nameinput.nextLine();
               
             
                protonselectons(elementname);
                menusearch(userName);
            
            }else if(option.equals("3")){
            
                printSolic(elements);
                printgases(elements);
                menusearch(userName);
          
            }else if(option.equals("4")){
            System.out.println("Enter the atomic number to search the element");
            int number =nameinput.nextInt();
            
                if (number>118 || number<1) {
                    System.err.println(" The atomic number should be between 1 and 118");
                    menusearch(userName);
                }
                
                searchBytomicenumber(number);
                
                menusearch(userName);
            
            }else if(option.equals("5")){
            
                System.out.println("Enter the protons to search the element");
                  int number =nameinput.nextInt();
            
                if (number>118 || number<1) {
                    System.err.println(" The proton number should be between 1 and 118");
                    menusearch(userName);
                }
                
                searchBytomicenumber(number);
                
                menusearch(userName);
                
                
            
            }else if(option.equals("6")){
                System.out.println("Hi,"+userName+" You are exiting the application");
            
            }else{
            
                System.err.println("Wrong key selection try again");
                menusearch(userName);
            }
        
    }
    
    public static void searchBytomicenumber(int atomicnumber ){// searches an element using atomic number
         for (int row = 0;row < elements.length; row++) {
      for (int col = 0; col < elements[0].length; col++) {
          
        
           if( elements[row][3].equals(String.valueOf(atomicnumber)) ){
               String jj=  String.format(" The name of element is:%-2s",elements[row][col]);                        
              System.out.println(jj);     
                 break;
             
           }
         
      }
        
    }
    
    }
    public static void searchByProtonnumber(int atomicnumber ){// searches an element using atomic number
         for (int row = 0;row < elements.length; row++) {
      for (int col = 0; col < elements[0].length; col++) {
          
        
           if( elements[row][3].equals(String.valueOf(atomicnumber)) ){
               if (col==0) {
                   String jj=  String.format(" The name of element is:%-2s",elements[row][col]);                        
              System.out.println(jj);  
               }
                  
                 if (col==1) {
                   String jj=  String.format(" The name of Symbol is:%-2s",elements[row][col]);                        
                  System.out.println(jj);  
               }
             
           }
         
      }
        
    }
    
    }
   
    
    
    public static void protonselectons( String name){//searches protons and electrons of an element
        
         for (int row = 0;row < elements.length; row++) {
      for (int col = 0; col < elements[0].length; col++) {
          
        
           if( elements[row][0].equals(name) ){
               if( col==2){
               String jj=  String.format(" The electrons of the element are:%-2s",elements[row][col]);                        
              System.out.println(jj);   
               }
                if( col==3){
               String jj=  String.format(" The protons of the element are:%-2s",elements[row][col]);                        
              System.out.println(jj);   
               } 
             
           }
         
      }
        
    }
    
    }
    
    public static void printSolic(String matrix[][]){//prints the matrixes to the screen 
        
        System.err.println(" \nThe Solids components are as follows");
       for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
          if (matrix[row][4]=="s") {
              if (matrix[row][col]!=null) {
                  
            
             String jj=  String.format("%-10s",matrix[row][col].trim());                        
                        System.out.print(jj); 
              }
          }
               
      }
      System.out.println();
    }
    
    }
    
     public static void printgases(String matrix[][]){//prints the matrixes to the screen 
        System.err.println("\n The gases are as follows");
       for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
          if (matrix[row][4]=="g") {
              if (matrix[row][col]!=null) {
                  
            
             String jj=  String.format("%-10s",matrix[row][col].trim());                        
                        System.out.print(jj); 
              }
          }
               
      }
      System.out.println();
    }
    
       
       
    
    }
}