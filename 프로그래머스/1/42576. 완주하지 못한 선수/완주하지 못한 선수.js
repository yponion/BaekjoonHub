const aryToMap = (ary) => {
  const tmpMap = new Map();
  ary.forEach((element) => {
    if (tmpMap.has(element)) tmpMap.set(element, tmpMap.get(element) + 1);
    else tmpMap.set(element, 1);
  });
  return tmpMap;
};

function solution(participant, completion) {
  const mapA = aryToMap(participant);
  completion.forEach((element) => {
    if (mapA.get(element) > 1) {
      mapA.set(element, mapA.get(element) - 1);
    } else {
      mapA.delete(element);
    }
  });
  return [...mapA][0][0];
}