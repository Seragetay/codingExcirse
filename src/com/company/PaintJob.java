package com.company;

public class PaintJob {

    public static int paintJob(double width,double height, double areaPerBuket, int extraBukets){

          if (width <= 0 || height <= 0 || areaPerBuket <= 0){
              System.out.println("Invalid input");
              return -1;
          }
          double totalArea = width * height;
          double buckerForTotalArea = totalArea / areaPerBuket;
          int totalTakeToJob = (int) buckerForTotalArea - extraBukets;

          if (totalArea > buckerForTotalArea){
              totalTakeToJob +=1;

          }

        return totalTakeToJob;

    }

}
