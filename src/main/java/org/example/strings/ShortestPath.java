package org.example.strings;

public class ShortestPath {
    public static void main(String[] args) {
        String s ="WNEENESENNN";
        System.out.println(shortestStringPath(s));
    }
    public static double shortestStringPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir =str.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        int X =x*x;
        int Y =y*y;
        double shortestPath = Math.sqrt(X+Y);
        return shortestPath;
    }
}
