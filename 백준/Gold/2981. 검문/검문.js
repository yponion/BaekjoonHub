const input = require("fs")
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n")
  .map(Number);

const sortedNumber = input.slice(1).sort((a, b) => a - b);
const dif = [];
for (let i = 1; i < sortedNumber.length; i++) {
  dif.push(sortedNumber[i] - sortedNumber[i - 1]);
}

// 비재귀적 GCD
const euclidean = (a, b) => {
  while (b !== 0) {
    [a, b] = [b, a % b];
  }
  return a;
};

// GCD 계산
let gcd = dif[0];
for (let i = 1; i < dif.length; i++) {
  gcd = euclidean(gcd, dif[i]);
}

// 약수 구하기 최적화
const getDivisors = (n) => {
  const divisors = [];
  for (let i = 1; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      divisors.push(i);
      if (i !== n / i) divisors.push(n / i);
    }
  }
  return divisors.sort((a, b) => a - b);
};

// 약수에서 1 제외하고 출력
const answer = getDivisors(gcd)
  .filter((v) => v !== 1)
  .join(" ");
console.log(answer);
