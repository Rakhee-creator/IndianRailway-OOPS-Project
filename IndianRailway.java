//encap class (blueprint of building)

class IndianRail {

    private int ticket;
    private String passangername;

//constructor method -intialize object (like builder )

    IndianRail (int ticket,String passangername)

    {

        this.ticket = ticket;
        this.passangername = passangername;
    }

//getters to access this private data.In real projects, getters are usually public because
// making getters non‑public (like  or package‑private)
// then only code inside the same class (or package) can call them. no outside access.

    public int getTicket() {return ticket;}
    public String getPassangername() {return passangername;}
    //this is overloading poly
    void luxurytour(String delux)
    {System.out.println("The Maharajas Express has redefined the luxury travel experience:" + delux);}
}
//this is override i can merge it in 2nd class
//void luxurytour()
//{System.out.println("offering guests the opportunity to explore fabled destinations" );}
//}
//extending class -using inheritance

class MaharajasExpress extends IndianRail {
    private String indianpanorama;

    //constructor for 2nd class
    public MaharajasExpress (int ticket,String passangername,String indianpanorama ){
    super( ticket, passangername);//moving forward para from class 1
    this.indianpanorama=indianpanorama;
    }
    //Getters to access data from this class 2

    public String getIndianpanorama() {
        return indianpanorama;
    }

    void luxurytour()
        {System.out.println("offering guests the opportunity to explore fabled destinations");}

}
//expanding code with Abstract

abstract class maharajaservice {
    abstract void luxsuite();// abstract method (no body)
    // concrete method (common behavior)
//     void printWelcome() {
//        System.out.println("king-sized lifestyle");
//    }
}
//expanding code with Interface -PURE Abstraction .
interface maharajaexpress1{
    void book();

//    default void printwelcome1() {
//        System.out.println("Explore India like a true Indian maharaja");
//    }
}

//main class to execute code.
public class IndianRailway {
    public static void main(String[] args) {
        MaharajasExpress rail = new MaharajasExpress(10, "Rakhee", "DELHI–JAIPUR");

        System.out.println("passenger name:" + rail.getPassangername());
        System.out.println("Ticket no:" + rail.getTicket());
        System.out.println("Welcome aboard the Maharajas Express Panorama:" + rail.getIndianpanorama());
        rail.luxurytour();
        //to call overloading poly
        IndianRail rail1 = new IndianRail(11, "copilot-bro");
        rail1.luxurytour("indian luxury express");
        //creating an anonymous class that provides the missing implementation of luxsuite.
        maharajaservice rail2=new maharajaservice() {
            @Override
            void luxsuite() {
                System.out.println("king-sized");
            }

        } ;
//        rail2.printWelcome();
        rail2.luxsuite();

        maharajaexpress1 rail3=new maharajaexpress1() {
            @Override
            public void book() {
                System.out.println("exclusive experience");
            }
        };
        rail3.book();
//        rail3.printwelcome1();
    }
}



