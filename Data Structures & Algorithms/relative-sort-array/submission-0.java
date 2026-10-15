class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();

        for (int num2 : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == num2) {
                    res.add(arr1[i]);
                    arr1[i] = -1;
                }
            }
        }

        Arrays.sort(arr1);
        for (int i = res.size(); i < arr1.length; i++) {
            res.add(arr1[i]);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}