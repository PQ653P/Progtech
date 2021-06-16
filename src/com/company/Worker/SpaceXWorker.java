package com.company.Worker;

public class SpaceXWorker extends Worker{

    public void workHard(){
        System.out.println("My job is too hard, so i work slowly.");
    }

    public SpaceXWorker(){
        super();
        setWorkerNumbers(20);
        setMaterialPrice(5000);
        setWorkSpeed(40);
        setWorkTime(200);

        workingType= new WorkHard();
    }
}
