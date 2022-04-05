package utils;

import Exceptions.EmptyStringException;
import Exceptions.NotIntException;

import java.util.Scanner;

public class Validator {

    //Name validation
    public static String isEmptyStr(String str) throws EmptyStringException {
        if (str.isEmpty()) throw new EmptyStringException("Пусто! Введите данные!");
            return str;
    }

    public static String validateName(Scanner scanner){
        String str = null;
        do{
            try{
                System.out.print("Введите имя клиента: ");
                str = isEmptyStr(scanner.nextLine().trim());
            } catch (EmptyStringException ex){
                System.out.println(ex);
            }
        } while (str == null);
        return str;
    }



}
