package hjy.hdu;

class Value{
    public int i=15;
}

public class 恶心不拉几的JAVA题{
    public static void main(String argv[]){
        恶心不拉几的JAVA题 t=new 恶心不拉几的JAVA题( );
        t.first( );
    }

    public void first( ){
        int i=5;
        Value v = new Value( );
        v.i=25;
        second(v,i);
        System.out.println(v.i);
    }

    public void second(Value v,int i){
        i = 0;
        v.i = 20;
        Value val = new Value( );
        v = val;
        // v=15
        System.out.println(v.i+" "+i);
    }
}
