package com.company.settings;

public class WorkTimer extends SuperSettings{

    public boolean work;
    private long timer;

    public WorkTimer() {
    }

    public void setTimerWork(String workInput) {
        if (SuperSettings.trueFalseCheckFromString(workInput).equals("true"))
            this.work = true;
        else this.work = false;
    }

    public void workTimeStart(){                                //запускаем в начале процесса для подсчёта времени выполнения
        this.timer = System.currentTimeMillis();
    }

    public long workTimeEnd (){                      //запускаем в конце процесса для подсчёта времени затраченого на выполнение
        return this.timer = System.currentTimeMillis() - timer;
    }
}
