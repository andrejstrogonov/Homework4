public class Main {
    public static void main(String[] args) {
        int kindergartenAge = 5;
        int schoolAge = 10;
        int universityAge = 20;
        int workAge = 45;
        if (kindergartenAge<=6&&kindergartenAge>=2){
            System.out.println("Если возраст человека равен "+kindergartenAge+ ", то ему нужно ходить в детский сад");
        }
        if (schoolAge<=17&&schoolAge>=7){
            System.out.println("Если возраст человека равен "+schoolAge+ ", то ему нужно ходить в школу");
        }
        if (universityAge<=24&&universityAge>=18){
            System.out.println("Если возраст человека равен "+universityAge+ ", то ему нужно ходить в университет");
        }
        if (workAge>=24){
            System.out.println("Если возраст человека равен "+workAge+ ", то ему нужно ходить на работу");
        }
    }
}