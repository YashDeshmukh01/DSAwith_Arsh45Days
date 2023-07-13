package com.yash.Day10;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix{
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        List<Integer> ans = new ArrayList<>();
        while(left <= right && top <= bottom){
            //Traverse Right
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //Traverse Down
            for(int i = top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if (top<=bottom){
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left<=right){
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }
        return ans;
    }
}
