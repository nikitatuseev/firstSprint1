public class Converter1 {
    void distance(int allSteps){
        double distant=allSteps*75; //расстояние в см
        double distantOnKm=distant/10000; // расстояние в км
        System.out.println("Пройдено за месяц всего : " + distantOnKm + " километров");
    }

    void calories(int allSteps){
        double calories=allSteps*50; // всего калорий
        double kilocalorie=calories/1000;// всего килокалорий
        System.out.println("Всего сожжено за месяц : " + calories + " калорий " + "или " + kilocalorie + " килокалорий");
    }

}
