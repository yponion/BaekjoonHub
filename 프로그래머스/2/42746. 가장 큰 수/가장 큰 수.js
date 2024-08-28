function solution(numbers) {
  var answer = "";
  numbers.sort(function (a, b) {
    const sa = String(a);
    const sb = String(b);
    return Number(sb + sa) - Number(sa + sb);
  });
  numbers.forEach((element) => {
    answer += element;
  });
  if (Number(answer) === 0) return "0";
  return answer;
}