function solution(today, terms, privacies) {
  var answer = [];

  const dayToNumber = (day) => {
    let [y, m, d] = day.split(".").map(Number);
    return y * 12 * 28 + m * 28 + d;
  };

  const toD = dayToNumber(today);

  const termsAry = {};
  terms.forEach((element) => {
    const [type, num] = element.split(" ");
    termsAry[type] = parseInt(num);
  });

  privacies.forEach((element, index) => {
    const [day, type] = element.split(" ");
    const d = dayToNumber(day) + termsAry[type] * 28 - 1;
    if (d < toD) answer.push(index + 1);
  });

  return answer;
}