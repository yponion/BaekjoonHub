const solution = (clothes) => {
  const map = new Map();
  clothes.forEach((element) => {
    const type = element[1];
    if (map.has(type)) map.set(type, map.get(type) + 1);
    else map.set(type, 1);
  });
  const ary = [...map.values()];

  let result = 1;
  ary.forEach((v) => (result *= v + 1));
  return result - 1;
};