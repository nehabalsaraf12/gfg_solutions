class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i=0;i<=arr.length-1;i+=2)
        {
            resultList.add(arr[i]);
        }
        return resultList;
    }
}