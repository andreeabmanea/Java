package com.company;

public class Main {

    public static void main(String[] args) {

        //we create the instances of the problem
        Source s1 = new Source("S1", 10);
        Source s2 = new Source("S2", 35);
        Source s3 = new Source("S3", 25);
        Destination d1 = new Destination("D1",20);
        Destination d2 = new Destination("D2",25);
        Destination d3 = new Destination("D3",25);
        s1 = new Source(s1.name,Source.SourceType.FACTORY);
        s2 = new Source(s2.name, Source.SourceType.WAREHOUSE);
        s3 = new Source(s3.name, Source.SourceType.WAREHOUSE);

        //we set the Matrix of costs
        //to be continued for the optional part
        Problem myMatrix = new Problem(1,1, 1);

        //we print the Matrix of costs

    }
}