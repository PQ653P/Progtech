package com.company.Worker;

public class TeslaWorker extends Worker{
    public void workEasy(){
        System.out.println("My job isn't too hard, so I work faster.");
    }

    public TeslaWorker(){
        super();
        setWorkerNumbers(12);
        setMaterialPrice(900);
        setWorkSpeed(70);
        setWorkTime(120);

        workingType= new WorkFast();
    }
}
