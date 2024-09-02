public class Main {
    public static void main(String[] args) {
        System.out.println("Д/З №5.");

        System.out.println();
        System.out.println("  Задача №1.");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("  Задача №2.");
        int clientDeviceYear = 2011;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS != 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS != 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("  Задача №3.");
        int year = 1580;
        if (year < 1584) {
            System.out.println("Год " + year + " не високосный.");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный.");
        } else {
            System.out.println("Год " + year + " не високосный.");
        }

        System.out.println();
        System.out.println("  Задача №4.");
        int deliveryDistance = 101;
        if (deliveryDistance < 20) {
            System.out.println("На удаленности в " + deliveryDistance + " км, срок доставки составит 1 день.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("На удаленности в " + deliveryDistance + " км, срок доставки составит 2 дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("На удаленности в " + deliveryDistance + " км, срок доставки составит 3 дня.");
        } else {
            System.out.println("На удаленности в " + deliveryDistance + " км, доставка не осуществляется.");
        }

        System.out.println();
        System.out.println("  Задача №5.");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц январь, принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц февраль, принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц март, принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц апрель, принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц май, принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц июнь, принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц июль, принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц август, принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц сентябрь, принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц октябрь, принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц ноябрь, принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц декабрь, принадлежит к сезону зима.");
                break;
            default:
                System.out.println(monthNumber + "Такого номера месяца не существует.");
        }


    }

}


