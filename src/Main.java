import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StepTracker stepTracker=new StepTracker();
        int day;
        int month;
        int newGoal;

NameMonth nameMonth=new NameMonth();
        while (true) {
            printMenu();
            int command = scanner.nextInt();


            if (command == 1) {

                while (true) {
                    System.out.println("За какой месяц хотите ввести шаги?");
                    nameMonth.oneFunction();
                    month = scanner.nextInt();
                    if (month < 0 || month > 12) {
                        System.out.println("месяц не может быть отрицательным или больше 12");
                        continue;
                    }
                    System.out.println("За какой день хотите ввести шаги?");
                    System.out.println("0-первый день  1-второй день ... 29-тридцатый день");
                    day = scanner.nextInt();
                    if (day < 0 || day > 30) {
                        System.out.println("день не может быть отрицательным или больше 30");
                        continue;
                    }
                    System.out.println("Сколько шагов?");
                    int step = scanner.nextInt();
                    if(step<=0){
                        System.out.println("шаги не могут быть меньше 0");
                        continue;
                    }
                    stepTracker.saveSteps(month, day, step);
                    break;
                }

                System.out.println("Данные успешно сохранены");

            }
                else if (command == 2) {
                    System.out.println("За какой месяц напечатать статистику?");
                    nameMonth.oneFunction();
                    int monthToPrint = scanner.nextInt();
                    stepTracker.printStep(monthToPrint);


                } else if (command == 3) {
                    System.out.println("Какую цель вы хотите поставить?");
                    newGoal = scanner.nextInt();
                    stepTracker.changeGoal(newGoal);
                System.out.println("Цель изменена");

                } else if (command == 0) {
                    System.out.println("Программа завершена");
                    break;
                }

        }
    }


    public static void printMenu() {
        System.out.println();
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");

    }
}


