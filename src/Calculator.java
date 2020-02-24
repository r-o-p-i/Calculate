public class Calculator {
    private int result;

    /**
     * Суммируем Аргументы
     *
     * @param params Аргументы суммирщвания
     */
    public void add(int... params) {
        for (Integer param : params
        ) {
            this.result += param;
        }
    }

    /**
     * Получить результат
     *
     * @return результат вычисления
     */
    public int getResult() {
        return result;
    }

    /**
     * Щчистить результат вычисления
     */
    public void cleanResult() {

        this.result = 0;

    }
}
