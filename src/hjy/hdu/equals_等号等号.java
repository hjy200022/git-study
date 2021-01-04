package hjy.hdu;
/**
 * @author hjy
 */
public class equals_等号等号 {
    public static void main(String[] args) {
        String helloA = new String("hello");
        String helloB = new String("hello");
        String helloC = "hello";
        String helloD = "hello yyt";
        String helloE = helloC + " yyt";
        String helloF = "hello yyt";
        int i = 10;
        int j = 10;
        // 比较对象时，equals比较值是否相等，如果对象没有被重写，比较引用地址；
        // ==比较对象的引用地址是否相同
        System.out.println(helloA == helloB); //false，没有指向同一个对象，但字符串内容相同
        System.out.println(helloF == helloD); //ture，指向同一个对象 "hello yyt"
        System.out.println(helloA.equals(helloB)); //字符串内容相同，ture
        System.out.println(helloA.equals(helloC)); //字符串内容相同，true
        System.out.println(helloD.equals(helloE)); //字符串内容相同，true
        //==比较基本数据类型，比较值
        System.out.println(i == j); //ture
    }
}
