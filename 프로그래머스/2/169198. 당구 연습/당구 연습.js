const minDist = (m, n, startX, startY, arriveX, arriveY) => {
  console.log("startX", startX);
  console.log("startY", startY);
  console.log("arriveX", arriveX);
  console.log("arriveY", arriveY);
  console.log();
  let min = 5000000;
  if (
    !(startY === arriveY && startX > arriveX) && // 가로로 같은 선 상에서 수구가 목적구 보다 오른쪽이면 왼쪽벽으로 안감
    min >
      Math.pow(startX + arriveX, 2) + Math.pow(Math.abs(startY - arriveY), 2)
  ) {
    min =
      Math.pow(startX + arriveX, 2) + Math.pow(Math.abs(startY - arriveY), 2);
  }
  if (
    !(startY === arriveY && startX < arriveX) && // 가로로 같은 선 상에서 수구가 목적구 보다 왼쪽이면 오른쪽벽으로 안감
    min >
      Math.pow(m - startX + m - arriveX, 2) +
        Math.pow(Math.abs(startY - arriveY), 2)
  ) {
    min =
      Math.pow(m - startX + m - arriveX, 2) +
      Math.pow(Math.abs(startY - arriveY), 2);
  }
  if (
    !(startX === arriveX && startY > arriveY) && // 세로로 같은 선 상에서 수구가 목적구 보다 위쪽이면 아래쪽벽으로 안감
    min >
      Math.pow(startY + arriveY, 2) + Math.pow(Math.abs(startX - arriveX), 2)
  ) {
    min =
      Math.pow(startY + arriveY, 2) + Math.pow(Math.abs(startX - arriveX), 2);
  }
  if (
    !(startX === arriveX && startY < arriveY) && // 세로로 같은 선 상에서 수구가 목적구 보다 아래쪽이면 위쪽벽으로 안감
    min >
      Math.pow(n - startY + n - arriveY, 2) +
        Math.pow(Math.abs(startX - arriveX), 2)
  ) {
    min =
      Math.pow(n - startY + n - arriveY, 2) +
      Math.pow(Math.abs(startX - arriveX), 2);
  }
  return min;
};

function solution(m, n, startX, startY, balls) {
  var answer = [];
  balls.forEach((element) => {
    answer.push(minDist(m, n, startX, startY, element[0], element[1]));
  });
  console.log(answer);

  return answer;
}