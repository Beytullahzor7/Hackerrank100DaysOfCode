class Result {
  
  /*
  HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from 0 to 100.
Any  less than 40  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of 5 is less than 3, round  up to the next multiple of 5.
If the value of  is less than 38, no rounding occurs as the result will still be a failing grade.
Examples

 grade=84 round to  (85 - 84 is less than 3)
 grade=29 do not round (result is less than 40)
 grade=57 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

*/
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for(Integer i : grades){ //73 67 38 33
            if(i%5>2 && i>37)  {
                i += 5 - (i%5);
                result.add(i);
            }else{
                result.add(i);
            }
        }
        return result;
    }
}
