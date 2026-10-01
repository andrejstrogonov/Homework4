public class Main {
    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        int one = rnd(min,max);
        int two = rnd(min,max);
        int three = rnd(min,max);
        if(one>=two&&one>=three){
            System.out.println("Большее число one: " +one);
        }
        if(two>=one&&two>=three){
            System.out.println("Большее число two: " +two);
        }
        if(three>=two&&three>=one){
            System.out.println("Большее число three: " +three);
        }

    }
    public static int rnd(int min,int max){
        max = -min;
        return (int) (Math.random() * ++max) + min;
    }
}