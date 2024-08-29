function solution(nums) {
  const set = new Set(nums);

  const n = nums.length / 2;
  const size = set.size;

  return size < n ? size : n;
}