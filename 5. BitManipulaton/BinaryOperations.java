public class BinaryOperations {
    public static int GetithBit(int num , int i){
        int BitMask = 1<<i;
        if((num&BitMask)==0){
            return 0;
        }
        return 1;
    }

    public static void SetithBit(int num , int i )
    {
        int BitMask = 1<<i;
        int result = num|BitMask;
        System.out.println(result);
    }    

    public static void ClearithBit(int num , int i ){
        int BitMask = ~(1<<i);
        System.out.println(num & BitMask); 
    }

    public static void UpdateithBit(int num , int i , int newBit){
        // if(newBit== 0 ){
        //     ClearithBit(num, i);
        // }
        // else if(newBit==1){
        //     SetithBit(num , i);
        // }

        int BitMask = newBit<<i;
        System.out.println(num|BitMask);

    }

    public static void clearLastiBits(int num , int i ){
        int BitMask = (~0)<<i;
        System.out.println(num&BitMask);
    }


    public static void ClrRangeOfbits(int num , int i , int j ){
        int a = (~0)<<(j+i);
        int b = (1<<i)-1;

        int BitMask = a|b;
        System.out.println(num&BitMask);
    }


public static void main(String[] args) {
        int num = 10;
        int i = 2;
        System.out.println(GetithBit(num, i));

        SetithBit(num, i);
        ClearithBit(num, 1);
        UpdateithBit(num , 2 , 1);
        clearLastiBits(15,2);
        ClrRangeOfbits(10, 2, 4);
    }
}
