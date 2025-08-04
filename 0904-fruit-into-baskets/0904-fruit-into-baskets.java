class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length <= 2) return fruits.length;

        int m = 0;
        int lastFruit = -1, secondLastFruit = -1;
        int lastFruitCount = 0;
        int currentMax = 0;

        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currentMax++;
            } else {
                currentMax = lastFruitCount + 1;
            }

            if (fruit == lastFruit) {
                lastFruitCount++;
            } else {
                lastFruitCount = 1;
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            m = Math.max(m, currentMax);
        }

        return m;
    }
}
