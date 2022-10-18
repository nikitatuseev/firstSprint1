import java.time.MonthDay;

public class StepTracker {
    int maxStep=0;
    int m=0;
    Converter1 converter1=new Converter1();
    double averageStep=0;
    int allSteps=0;
    int stepGoal=10000;
    int k=0;
    NameMonth nameMonth=new NameMonth();
    int[][] MonthDays=new int[12][30];
      void saveSteps(int month, int day, int step){
          for(int i=month;i<(month+1);i++){
            for(int j=0;j< MonthDays[0].length;j++){
                MonthDays[month][day]=step;
            }
          }
      }
    void printStep(int monthToPrint){
        nameMonth.name(monthToPrint);

          for(int i=monthToPrint;i<(monthToPrint+1);i++){
              for(int j=0;j<MonthDays[0].length;j++){
                  System.out.println(" День " + (j+1) + " - " + " " + MonthDays[i][j] + " шагов " + " ");
                  allSteps+=MonthDays[i][j];
                  if(maxStep<MonthDays[i][j]){
                      maxStep=MonthDays[i][j];
                  }
                  if(MonthDays[i][j]>=stepGoal && MonthDays[i][j+1]>=stepGoal){
                      k+=1;
                       m=k;
                  }
                  else{
                      k=0;
                  }
              }
              System.out.println();
          }
        for(int i=monthToPrint;i<(monthToPrint+1);i++){
            for(int j=0;j<MonthDays[0].length;j++){
                averageStep=allSteps/MonthDays[0].length;
            }
        }
        System.out.println("Всего шагов за меясц : " + allSteps);

        System.out.println();
        System.out.println("Максимальное колличество пройденных шагов за месяц : " + maxStep);
        System.out.println();
        if(m==0){
            System.out.println("Лучшая серия шагов : " + m);
        }
        else{
            System.out.println("Лучшая серия шагов : " + (m+1));
        }

        System.out.println("Среднее количество шагов : " + averageStep);
        System.out.println();
        converter1.distance(allSteps);
        converter1.calories(allSteps);

        allSteps=0;
        k=0;
    }

    void changeGoal(int newGoal){
          stepGoal=newGoal;
    }
}



