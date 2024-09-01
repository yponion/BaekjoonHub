function solution(phone_book) {
  let answer = phone_book.sort().some((v, i, a) => a[i + 1]?.startsWith(v));
  return !answer;
}