public int largestRectangleArea(int[] heights) {
	int area = 0;
	Stack<Integer> stack = new Stack<>();
	for (int idx = 0; idx <= heights.length; idx++) {
		int height = (idx == heights.length) ? 0 : heights[idx];
		while (!stack.isEmpty() && heights[stack.peek()] > height) {
			int last = heights[stack.pop()];
			int width = last * (stack.isEmpty() ? idx : idx - stack.peek() - 1);
			area = Math.max(area, width);
		}
		stack.push(idx);
	}
	return area;
}
