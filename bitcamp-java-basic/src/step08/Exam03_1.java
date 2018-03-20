// 내장 변수 this
package step08;

public class Exam03_1 {
    static class A {
        int value;
        
        static void m1() {
            // 클래스 메서드는 인스턴스 주소 없이 호출되기 때문에
            // 인스턴스 주소를 받는 내장 변수가 없다.
            //this.value = 100; // 사용불가!
          
        }
        
        void m2() {
            // 인스턴스 메서드는 인스턴스 주소가 있어야만 호출되기 때문에
            // 인스턴스 주소를 받을 주소가 내장되어있다.
            this.value = 100;
        }
        
        void m3() {
            // 인스턴스 변수를 사용할 때 this를 생략할 수 있다.
            // this.value = 200;
            value = 200; // 앞에 자동으로 this가 붙는다.
        }
        
        void m4() {
            value = 200;
            this.value = 300;
            //로컬변수의 이름과 인스턴스 이름과 같은경우 this를 붙여 구분한다.
            
        }
    }

    public static void main(String[] args) {
        // 클래ㅑ스 메서드는 인스턴스 주서 없이 클래스 이름으로 호출한다.
        // 그래서 클래스 메서드는 this라는 내장 변수가 없는 것이다.
        A.m1();
        
        A obj1 = new A();
        // 인스턴스 메서드는 인스턴스 주서가 있어야만 호출할 수 있기 때문에
        // 인스턴스 메서드에는 인스턴스 주소를 받을 수 있는 내장 변수가 this안에 있다.
        obj1.m2();
        
        // 물론 클래서 메서드도 레퍼런스를 가지고 호출할 수 있지만,
        // 인스턴스 주소가 메서드에 전달되는 것은 아니다.
        // 그래서 클래스 메서드는 내장변수 this가 없다.
        obj1.m1();
        
        
        // 인스턴스 메서드의 this 변수는 메서드를 호출할 때 인스턴스 주소 값을 가진다.
        // (주석참고)
        A obj2 = new A();
        obj2 .m2();
    }
}
