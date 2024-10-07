public class Main {
    public static void main(String[] args) {
       int firstSpeed = 120;
       int secondSpeed = 50;
       int speedThrashhold = 60;
       if (firstSpeed>=speedThrashhold){
           System.out.println("Если скорость "+firstSpeed+" ,то придется заплатить штраф");
       }else {
           System.out.println("Если скорость "+secondSpeed+" ,то можно ездить спокойно");
       }
        if (secondSpeed>=speedThrashhold){
            System.out.println("Если скорость "+firstSpeed+" ,то придется заплатить штраф");
        }else {
            System.out.println("Если скорость "+secondSpeed+" ,то можно ездить спокойно");
        }
    }
}