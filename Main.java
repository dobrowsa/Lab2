class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
  int totalMMCount = 55*11;
  double countMMRed = totalMMCount * .13;
  double countMMBrown = totalMMCount * .13;
  double countMMBlue = totalMMCount * .24;
  double countMMYellow = totalMMCount * .14;
  double countMMOrange = totalMMCount * .20;
  double countMMGreen = totalMMCount * .16;
  double sumColoredMM = countMMGreen + countMMOrange + countMMYellow + countMMBlue + countMMBrown + countMMRed;
  
  System.out.println(totalMMCount);

  System.out.println("Blue: " + countMMBlue);
  System.out.println("Yellow: " + countMMYellow);
  System.out.println("Orange: " + countMMOrange);
  System.out.println("Brown: " + countMMBrown);
  System.out.println("Green: " + countMMGreen);
  System.out.println("Red: " + countMMRed);

  System.out.println("Sum: " + sumColoredMM);

  if (countMMBlue > countMMBrown && countMMRed > countMMOrange)
     System.out.println ("Blue over Brown and Red over Orange");
if (countMMBrown <= countMMGreen)
     System.out.println("Brown is less than or equal to Green");
if (sumColoredMM == totalMMCount)
      System.out.println("Numbers match");
  }
  }