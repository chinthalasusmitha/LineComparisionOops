package linecomparisioncomputation;

import javax.sound.sampled.Line;

public class MainClass {
    public static void main(String[] args) {
        double secondLineLength = 0;
        LineComparisonComputation lineComputation = new LineComparisonComputation();

        lineComputation.setFirstCoordinatesOfX1(4);
        lineComputation.setFirstCoordinatesOfX2(8);
        lineComputation.setFirstCoordinatesOfY1(2);
        lineComputation.setFirstCoordinatesOfY2(10);
        lineComputation.setSecondCoordinatesOfX1(2);
        lineComputation.setSecondCoordinatesOfX2(6);
        lineComputation.setSecondCoordinatesOfY1(4);
        lineComputation.setSecondCoordinatesOfY2(12);
        System.out.println("lineComputation" + lineComputation.toString());

        double firstLineLength = Math.sqrt((lineComputation.getFirstCoordinatesOfX2() - lineComputation.getFirstCoordinatesOfX1())
                * (lineComputation.getFirstCoordinatesOfX2() - lineComputation.getFirstCoordinatesOfX1())
                + (lineComputation.getFirstCoordinatesOfY2() - lineComputation.getFirstCoordinatesOfY1())
                * (lineComputation.getFirstCoordinatesOfY2() - lineComputation.getFirstCoordinatesOfY1()));
        System.out.println("Length of the line: " + firstLineLength);

        double SecondLineLength = Math.sqrt((lineComputation.getSecondCoordinatesOfX2() - lineComputation.getSecondCoordinatesOfX1())
                * (lineComputation.getSecondCoordinatesOfX2() - lineComputation.getSecondCoordinatesOfX1())
                + (lineComputation.getSecondCoordinatesOfY2() - lineComputation.getSecondCoordinatesOfY1())
                * (lineComputation.getSecondCoordinatesOfY2() - lineComputation.getSecondCoordinatesOfY1()));
        System.out.println("Length of the line" + SecondLineLength);

        if (firstLineLength == secondLineLength) {
            System.out.println("Both Lines are equal");
        } else {
            if (firstLineLength > secondLineLength) {
                System.out.println("First line is longer than second line");
            } else {
                System.out.println("Second line is longer than First line");
            }

            if (firstLineLength == secondLineLength) {
                System.out.println("Both Lines are equal " + firstLineLength);
            } else {
                System.out.println("Lines are not equal " + secondLineLength);
//                checkingEqualityOfLine();
            }
        }
    }

}



