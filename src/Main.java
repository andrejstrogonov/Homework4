public class Main {
    public static void main(String[] args) {
        int ageOutAttraction = 3;
        int ageWithParents = 10;
        int ageOwn = 16;
        if (ageOutAttraction<=5){
            System.out.println("Если возраст ребенка равен "+ageOutAttraction+" нельзя кататься на аттракционе");
        }
        if(ageWithParents>=5 &&ageWithParents<=14){
            System.out.println("Если возраст ребенка равен "+ageWithParents+
                    " можно кататься на аттракционе в сопровождении взрослого");
        }
        if(ageOwn>=14){
            System.out.println("Если возраст ребенка равен "+ageOwn+
                    " можно кататься на аттракционе без сопровождения взрослого");
        }
    }
}