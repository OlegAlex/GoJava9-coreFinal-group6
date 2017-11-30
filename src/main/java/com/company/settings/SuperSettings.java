package com.company.settings;

public class SuperSettings {


    public CacheSettings cacheSettings;
    public WorkTimer workTimer;

    public static String trueFalseCheckFromString(String workInput) {
        String work = workInput.toLowerCase();
        if (work.equals("true") || work.equals("false")) {  //проверка на валидность данных
            if (work.equals("true")) {
                return "true";
            } else return "false";
        } else
            System.err.println("Wrong input data");
        return null;
    }
}
