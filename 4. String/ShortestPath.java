public class ShortestPath {
    public static float shortPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < str.length();i++){
            char dir = str.charAt(i);
            if(dir == 'E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
        }
        return (float)Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        String str = "SN";
        float disp = shortPath(str);
        System.out.println(disp);
        
    }
}
