package com.company;

public class Solution extends Problem{

    public Solution(int n, int m) {
        super(n, m);
    }

    //it doesn't work
    void findSolution(){
        for (int i = 0; i < destinations.size(); i++)
            if (destinations.get(i).demand != 0) {
                if (sources.get(i).capacity != 0)
                    if (sources.get(i).capacity < destinations.get(i).demand) {
                        destinations.get(i).demand = destinations.get(i).demand - sources.get(i).capacity;
                        sources.get(i).capacity = 0;
                        System.out.println("From" + sources.get(i).name + "to" + destinations.get(i).name + ":" + sources.get(i).capacity);
                    } else {
                        destinations.get(i).demand = 0;
                        sources.get(i).capacity = sources.get(i).capacity - destinations.get(i).demand;
                        System.out.println("From" + sources.get(i).name + "to" + destinations.get(i).name + ":" + destinations.get(i).demand);
                    }
            }

    }

}
