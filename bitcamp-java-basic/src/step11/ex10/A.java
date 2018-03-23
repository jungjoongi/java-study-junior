
package step11.ex10;

public class A {
    public static void m() {
        System.out.println("M()");
    }
    
    public static void m(int a) {
        System.out.println("m(int)");
    }
    
    static public void m(String a) {
        
    } 
    
    static public void m(String a, int b) {
        System.out.println("m(String,int)");
    }

    static public void m(int a, String b) {
        System.out.println("m(int,String)");
    } 
    
    // 주의!
    // -> 변수의 이름만 다른 메서드를 중복해서 만들 수 없다.
    // 이유?
    // 메서드를 찾을 때 파라미터 값의 타입으로 찾기 때문이다.
    // 컴파일 오류!
    /*
    static public void m(int x, String y) {
        System.out.println("m(int,String)");
    }
    */
    
    // -> 리턴 타입만 다른 메서드를 중복해서 만들 수 없다.
    // -> 이유?
    //    메서드를 찾을 떄ㅑ 파라미터 값의 타입으로 찾기 때문이다.
    
    static public int m(int a, String b) {
        return 0;
    }
}


