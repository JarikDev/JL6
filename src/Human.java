public class Human {
    byte b = 1; //1 byte(256) -128 +128
    short sh = 1234; // 2 byte (`65000) -32000 +32000
    int _i = 1234112234; // 4 byte (4000000000) +- 2000000000
    long $l = 12341234; // 8 byte mnogo
    float f = 234.234f; // 4 byte
    double d = 23234254.2345234;//git status 8 byte
    boolean bool = false;
    char c = 'C';

    Human friend  ;
    Human mom  ;
    Human dad ;

    Car car = new Car();


    public static void main(String[] args) {
    Human human = new Human();
        System.out.println(human.car.speed);
    }
}
