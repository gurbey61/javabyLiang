package ch_04;

public class ASCIITable {
    public static void main(String[] args){
        // ASCII Table
        for(char i ='\u0000'; i < '\u007F'; i++){
            char x = i;
            System.out.print(x);
        }
    }
}
