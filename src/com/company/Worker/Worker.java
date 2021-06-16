package com.company.Worker;

public class Worker {

    private int workerNumbers;
    private int workTime;
    private int materialPrice;
    private int workSpeed;

    public Work workingType;

    public void setWorkerNumbers(int newWorkerNumbers){workerNumbers = newWorkerNumbers;}
    public int getWorkerNumbers(){return workerNumbers;}

    public void setWorkTime(int newWorkTime){workTime = newWorkTime;}
    public int getWorkTime(){return workTime;}

    public void setMaterialPrice(int newMaterialPrice){materialPrice = newMaterialPrice;}
    public int getMaterialPrice(){return materialPrice;}

    public void setWorkSpeed(int newWorkSpeed){workSpeed = newWorkSpeed;}
    public int getWorkSpeed(){return workSpeed;}

    public String tryToWorkFast(){
        return workingType.work();
    }

    public void setWorkingSpeed(Work newWorkingType){
        workingType = newWorkingType;
    }

}
