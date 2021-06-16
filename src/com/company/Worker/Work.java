package com.company.Worker;

public interface Work {
    String work();
}

class WorkHard implements Work{
    @Override
    public String work() {
        return "I'm working slowly.";
    }
}

class WorkFast implements Work{
    @Override
    public String work() {
        return "I'm working fast.";
    }
}
