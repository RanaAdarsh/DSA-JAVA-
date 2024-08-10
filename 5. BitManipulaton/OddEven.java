import java.nio.channels.Pipe.SourceChannel;

public class OddEven {
    public static void OddrEven(int n){
        int BitMask = 1;
        if((n & BitMask )==0){
            //EVEN NUMBER
            System.out.println(n+" is an Even Number.");
        }
        else if((n&BitMask)==1){
            //ODD NUMBER
            System.out.println(n+" is a ODD number.");
        }
    }
    public static void main(String[] args) {
        OddrEven(3);
        OddrEven(10);
        OddrEven(151);
        OddrEven(24);
        OddrEven(9000);
    }
}
