public class Super{
    String superPower;
    String superHobby;
    void allRight(){
        System.out.println("Everything is ok");
    }
    void debugFor5hr(){
        System.out.println("Debugging for 5hr");
    }
    public static void main(String[] args){
        Super p=new Super();
        Super h=new Super();
        p.superPower="Flying ";
        h.superHobby="Hobbing";
        p.allRight();
        h.debugFor5hr();
    }
}