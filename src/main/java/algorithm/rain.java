package algorithm;

public class rain {
    public static void main() {


        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = 0;
        int l = 0,r = 1;
        while (l < r && r < a.length) {
            int max = 0;
            while(a[l] <= a[l+1] && l < a.length) {
                l++;r++;
            }
            while(a[r] >= a[r+1] && r < a.length) r++;
            while(a[r] <= a[r+1] && r < a.length) r++;
            max = Math.min(a[l],a[r]);
            for (int i = l+1; i < r; i++) {
                if(a[i] < max) ans += max - a[i];
            }
            l = r;
            r++;

        }
        System.out.println(ans);
    }
//dp
    public static int trap1(int[] height) {
        if (height == null || height.length < 3) return 0;

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // 计算每个位置左边的最大值
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // 计算每个位置右边的最大值
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // 计算每个位置能接的雨水量
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;
    }
    public static int trap2(int[] height) {
        if (height == null || height.length < 3) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans += rightMax - height[right];
                }
                right--;
            }
        }

        return ans;
    }


}
