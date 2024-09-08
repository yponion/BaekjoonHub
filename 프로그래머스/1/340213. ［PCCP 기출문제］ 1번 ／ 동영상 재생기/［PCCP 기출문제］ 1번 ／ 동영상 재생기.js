const strToNum = (str) => {
  const [m, s] = str.split(":").map(Number);
  return m * 60 + s;
};

const formater = (n) => {
  if (n === 0) return "00";
  else if (n < 10) return "0" + n;
  else return n.toString();
};

const numToStr = (n) => {
  const m = Math.floor(n / 60);
  const s = n % 60;
  return formater(m) + ":" + formater(s);
};

function solution(video_len, pos, op_start, op_end, commands) {
  let now = strToNum(pos);
  const opStart = strToNum(op_start);
  const opEnd = strToNum(op_end);
  const len = strToNum(video_len);
  if (opStart <= now && now <= opEnd) {
    now = opEnd;
  }
  commands.forEach((command) => {
    if (command === "prev") {
      if (now < 10) now = 0;
      else now -= 10;
    } else if (command === "next") {
      if (now <= len - 10) now += 10;
      else now = len;
    }
    if (opStart <= now && now <= opEnd) {
      now = opEnd;
    }
  });

  return numToStr(now);
}