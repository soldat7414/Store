package utils;

import Exceptions.EmptyStringException;
import Exceptions.NotDoubleException;
import Exceptions.NotIntException;
import Exceptions.NotPositiveValueException;

import java.util.Scanner;

public class Validator {


    public static String isEmptyStr(String str) throws EmptyStringException {
        if (str.isEmpty()) throw new EmptyStringException("Пусто! Введите данные!");
            return str;
    }

    public static int isInt (Scanner scanner) throws NotIntException {
        if(!scanner.hasNextInt()) throw new NotIntException(" - не число!", scanner.nextLine().trim());
        return scanner.nextInt();
    }

    public static double isDouble (Scanner scanner) throws NotDoubleException {
        if(!scanner.hasNextDouble()) throw new NotDoubleException(" - не число!", scanner.nextLine().trim());
        return scanner.nextDouble();
    }

    public static int isPositive (int value) throws NotPositiveValueException {
        if(value<=0) throw new NotPositiveValueException("Значение не может быть меньше или равно нулю!");
        return value;
    }
    public static double isPositive (double value) throws NotPositiveValueException {
        if(value<=0) throw new NotPositiveValueException("Значение не может быть меньше или равно нулю!");
        return value;
    }

    public static String validateName(Scanner scanner){
        String str = null;
        int count = 0;
        do{
            count++;
            if(count>=3 && count<6) System.out.println("Хоть пальцы сотрите, а я ЖЕЛЕЗНЫЙ!!!");
            if (count>5) System.out.println("Может у Вас кнопка залипла?");
            try{
                System.out.print("Введите имя клиента: ");
                str = isEmptyStr(scanner.nextLine().trim());
            } catch (EmptyStringException ex){
                System.out.println(ex.getMessage());
            }
        } while (str == null);
        return str;
    }

    public static int validateQuantityInput(Scanner scanner){
        int value = -1;
        do{
            try{
                System.out.println("Введите количество: ");
                value = isPositive(isInt(scanner));
            }catch (NotIntException ex){
                System.out.println(ex.getInput() + ex.getMessage());
            }catch (NotPositiveValueException exv){
                System.out.println(exv.getMessage());
            }
        } while (value<0);
        return value;
    }

    public static double validatePriceInput(Scanner scanner){
        double value = -1;
        do{
            try{
                System.out.println("Введите цену: ");
                value = isPositive(isDouble(scanner));
            }catch (NotDoubleException ex){
                System.out.println(ex.getInput() + ex.getMessage());
            }catch (NotPositiveValueException exv){
                System.out.println(exv.getMessage());
            }
        } while (value<0);
        return value;
    }
}
