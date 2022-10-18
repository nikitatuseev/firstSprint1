public class NameMonth {
    void name(int monthToPrint) {  // сделать отдельный класс
        switch (monthToPrint) {
            case 0:
                System.out.println("Статистика за Январь");
                break;
            case 1:
                System.out.println("Статистика за Февраль");
                break;
            case 2:
                System.out.println("Статистика за Март");
                break;
            case 3:
                System.out.println("Статистика за Апрель");
                break;
            case 4:
                System.out.println("Статистика за Май");
                break;
            case 5:
                System.out.println("Статистика за Июнь");
                break;
            case 6:
                System.out.println("Статистика за Июль");
                break;
            case 7:
                System.out.println("Статистика за Август");
                break;
            case 8:
                System.out.println("Статистика за Сентябрь");
                break;
            case 9:
                System.out.println("Статистика за Октябрь");
                break;
            case 10:
                System.out.println("Статистика за Ноябрь");
                break;
            case 11:
                System.out.println("Статистика за Декабрь");
                break;
        }
    }


    void oneFunction(){
        System.out.println("0-Январь  1-Февраль  2-Март  3-Апрель  4-Май  5-Июнь  6-Июль  " +
                "7-Август  8-Сентябрь  9-Октябрь  10-Ноябрь  11-Декабрь  ");
    }


}
