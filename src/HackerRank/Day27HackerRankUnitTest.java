package HackerRank;

public class Day27HackerRankUnitTest {
    public static void main(String[] args) {

    }

    static class TestDataEmptyArray{
        public static int[] get_array(){
            return new int[0];
        }
    }

    static class TestDataUniqueValues{
        public static int[] get_array(){
            return new int[] {1,2,3,4,5};
        }

        public static int get_expected_result(){
            return 0;
        }

    }

    static class TestDataExactlyTwoDifferentMinimums{
        public static int[] get_array(){
            return new int[] {1,2,3,4,1};
        }

        public static int get_expected_result(){
            return 0;
        }
    }
}
