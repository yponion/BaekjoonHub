function solution(nums) {
  const n = nums.length / 2;

  const map = new Map();

  nums.forEach((v) => {
    if (map.get(v)) map.set(v, map.get(v) + 1);
    else map.set(v, 1);
  });

  return map.size < n ? map.size : n;
}
