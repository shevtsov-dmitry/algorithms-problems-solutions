void main() {
    int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int[] arr2 = {4, 2, 3};
    int[] arr3 = {6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3};

    int v1 = trap(arr);
    assert v1 == 6 : STR."case 1 expect 6 actual \{v1}";
    int v2 = trap(arr2);
    assert v2 == 1 : STR."case 2 expect 1 actual \{v2}";
    int v3 = trap(arr3);
    assert v3 == 83 : STR."case 3 expect 83 actual \{v3}";
}

public int trap(int[] height) {
    int sum = 0, tempoPools = 0;
    for (int l = 0, r = l + 1; true; r++) {
        if (height[r] >= height[l]) {
            sum += tempoPools;
            l = r;
            tempoPools = 0;
        }
        if (r == height.length - 1 && height[l] > height[r]) {
            tempoPools = 0;
            r = l;
            height[l]--;
        }
        if (height[l] == height[r] && r == height.length - 1) {
            return sum;
        }

        tempoPools += height[l] - height[r];

    }
}

