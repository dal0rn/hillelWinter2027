package HW8;

public class ArrayValueCalculator {

    public int doCalc(String[][] array)
            throws ArraySizeException, ArrayDataException {

        if (array == null || array.length != 4) {
            throw new ArraySizeException(
                    "Массив должен иметь размер 4x4"
            );
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new ArraySizeException(
                        "Массив должен иметь размер 4x4"
                );
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum += number;

                } catch (NumberFormatException e) {

                    throw new ArrayDataException(
                            "Ошибка в ячейке [" + i + "][" + j +
                                    "]. Значение: " + array[i][j],
                            e
                    );
                }
            }
        }

        return sum;
    }
}
