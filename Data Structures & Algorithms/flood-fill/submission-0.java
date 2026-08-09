class Solution {
    public static int[] x = {0, 0, 1, -1};
    public static int[] y = {1, -1, 0, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];
        if (original == color) return image;
        image[sr][sc] = color;

        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < 4; i++) {
            if (sr + x[i] >= 0 && sc + y[i] >= 0 && sr + x[i] < rows && sc + y[i] < cols && image[sr + x[i]][sc + y[i]] == original) {
                floodFill(image, sr + x[i], sc + y[i], color);
            }
        }

        return image;
        
    }
}