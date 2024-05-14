package static_class_attribute_pandu;

class Display{
    static String type = "Display";
    private String name;
    
    Display (String name){
        this.name = name;
    }
    
    void setType(String typeInput){
        //type = typeInput;//altermtif 1
        //this.type = typeInput;// alternatif 2
        Display.type = typeInput;//alternatif 3 //Recommended
    }
    
    void show(){
        System.out.println("Name = " + this.name);
    }
}
public class Static_class_attribute_pandu {

    public static void main(String[] args) {
        
        Display display1 = new Display("Monitor");
        display1.show();
                
        Display display2 = new Display("Smartphone");
        display2.show();
        
        //static variabel atau class variabel
        
        //mengganti variabel staticnya
        display1.setType("Computer");
        
        System.out.println("Menampilkan static atau class variabel");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
    
}
