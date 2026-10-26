class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int i = 0, j = 0, temp = 0;
        int n = a.length;
        int m = b.length;
        int median = (n+m)/2;
        if((n+m)%2 == 0)
        {
            int count = -1, first = 0, sec = 0;
            while(i < n && j < m){
                if(a[i] <= b[j])
                {
                    temp = a[i];
                    i++;
                    count++;
                }
                else
                {
                    temp = b[j];
                    j++;
                    count++; 
                }
                if(count == ((n+m)/2) -1)
                {
                    first = temp;
                }
                if(count == (n+m)/2)
                {
                    sec = temp;
                }
            }

            while(i < n && count < median)
            {
                temp = a[i];
                i++;
                count++;
                if(count == ((n+m)/2) -1)
                {
                    first = temp;
                }
                if(count == (n+m)/2)
                {
                    sec = temp;
                }
            }

            while(j < m && count < median)
            {
                temp = b[j];
                j++;
                count++; 
                if(count == ((n+m)/2) -1)
                {
                    first = temp;
                }
                if(count == (n+m)/2)
                {
                    sec = temp;
                    break;
                } 
            }
            return (double)(first+sec)/2;
        }
        else
        {
            int count = -1;
            while(i < n && j < m){
                if(a[i] <= b[j])
                {
                    temp = a[i];
                     i++;
                    count++;
                }
                else
                {
                    temp = b[j];
                    j++;
                    count++; 
                }

                if(count == median)
                { 
                    break;
                }
            }
            while(i < n && count < median)
            {
                temp = a[i];
                i++;
                count++;
                if(count == (n+m)/2)
                {
                    break;
                }
            }

            while(j < m && count < median)
            {
                temp = b[j];
                j++;
                count++; 
                if(count == (n+m)/2)
                {
                    break;
                } 
            }
            return temp;
        }
    }
}
