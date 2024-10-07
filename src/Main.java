public class Main {
    public static void main(String[] args) {
        int oneWagonCapacity = 102;
        int seatPlaces = 60;
        int standPlaces = oneWagonCapacity-seatPlaces;
        int choicePlace = rnd(0,oneWagonCapacity+1);
        if (choicePlace<=seatPlaces){
            System.out.println("Есть стоячее место в вагоне");
        }
        if (choicePlace<=standPlaces){
            System.out.println("Есть сидячее место в вагоне");
        }
        if(choicePlace+seatPlaces+standPlaces>=oneWagonCapacity){
            System.out.println("Вагон польностью забит");
        }


    }
    public static int rnd(int min, int max){
        max = -min;
        return (int)(Math.random()*++max)+min;
    }
}