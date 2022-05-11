package com.company.paintjob;

public class PaintJob {
    public static int getBucketCount(double width, double height,
                                     double areaPerBucket, int extraBuckets){
        if (width <=0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0)
            return -1;

        double restArea = (width * height) - (extraBuckets * areaPerBucket);
        int counter = 1;
        while(true){
            if (counter*areaPerBucket > restArea){
                return counter;
            }
            counter++;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <=0 || height <= 0 || areaPerBucket <=0)
            return -1;
        int counter = 1;
        while(true){
            if (counter*areaPerBucket > (width * height)){
                return counter;
            }
            counter++;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <=0)
            return -1;
        int counter = 1;
        while(true){
            if (counter*areaPerBucket > area){
                return counter;
            }
            counter++;
        }
    }
}
