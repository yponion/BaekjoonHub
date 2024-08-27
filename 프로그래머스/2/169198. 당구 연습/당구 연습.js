function solution(m, n, startX, startY, balls) {
  var answer = [];
  balls.forEach((element) => {
    const [x, y] = element;
    const value = [];

    // 가로로 같은 선 상에서 수구가 목적구 보다 오른쪽이면 왼쪽벽으로 안감
    if (!(startY === y && startX > x))
      value.push((startX + x) ** 2 + (startY - y) ** 2);

    // 가로로 같은 선 상에서 수구가 목적구 보다 왼쪽이면 오른쪽벽으로 안감
    if (!(startY === y && startX < x))
      value.push((2 * m - startX - x) ** 2 + (startY - y) ** 2);

    // 세로로 같은 선 상에서 수구가 목적구 보다 위쪽이면 아래쪽벽으로 안감
    if (!(startX === x && startY > y))
      value.push((startY + y) ** 2 + (startX - x) ** 2);

    // 세로로 같은 선 상에서 수구가 목적구 보다 아래쪽이면 위쪽벽으로 안감
    if (!(startX === x && startY < y))
      value.push((2 * n - startY - y) ** 2 + (startX - x) ** 2);

    answer.push(Math.min(...value));
  });

  console.log(answer);
  return answer;
}

solution(10, 10, 3, 7, [
  [7, 7],
  [2, 7],
  [7, 3],
]); //[52, 37, 116]
