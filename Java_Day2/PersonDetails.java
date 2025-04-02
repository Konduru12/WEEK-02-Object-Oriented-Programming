public class PersonDetails {
   String name;
   String address;
   long MobileNo;
   PersonDetails(String name, String address, long MobileNo){
    this.name = name;
    this.address = address;
    this.MobileNo = MobileNo;
   } 
   PersonDetails(PersonDetails others){
    this.name = others.name;
    this.address = others.address;
    this.MobileNo = others.MobileNo;
   }
   void display(){
    System.out.println("Name of the Person: "  + name + " Address: " + address + " Mobile number: " + MobileNo);
   }
   public static void main(String[] args){
    PersonDetails p1 = new PersonDetails("Abhinaya", " Kavali", 28398);
    PersonDetails p2 = new PersonDetails(p1);
    p1.display();
    p2.display();
   }
}
