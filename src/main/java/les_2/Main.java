package les_2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {{"1111", "1122", "1111", "1122"}, {"1111", "1122", "1111", "1122"},
                {"1111", "1122", "1111", "1122"}, {"1111", "1122", "1111", "1133"}};

        try {
            System.out.println("The ansver is = " + convert(arr));
        }catch (MySizeArrayException e) {
            e.printStackTrace();
        }
        catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    private static int convert(String[][] arr) throws MyArrayDataException, MySizeArrayException{

        isForeFore(arr);

        int ans = 0;
        int letter = -1;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                while (++letter < arr[i][j].length()){
                    if (arr[i][j].charAt(letter) <= 57 && arr[i][j].charAt(letter) >= 48)
                        continue;
                    else
                        throw new MyArrayDataException("Exeption in cell [" + i + "][" + j + "]");
                }
                    letter = -1;
                    ans += Integer.parseInt(arr[i][j]);
            }
        return ans;
    }

    private static void isForeFore(String[][] arr) throws MySizeArrayException{
        for (String[] strings : arr)
            for (String string : strings)
                if (strings.length != 4 || string.length() != 4)
                    throw new MySizeArrayException("Array must be 4x4");
    }
}
