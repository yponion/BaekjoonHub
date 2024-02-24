// 입력 참고 https://minjo0n.tistory.com/2

const fs = require("fs");
const input = fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");

const n = +input[0];
let players = new Map();

for (let i = 1; i <= n; i++) {
    const first = input[i][0];
    if (players.has(first)) players.set(first, players.get(first) + 1);
    else players.set(first, 1);
}

// Map을 순회하면서 value 값이 5 미만인 요소 삭제
players.forEach((value, key) => {
    if (value < 5) {
        players.delete(key);
    }
});

if (players.size > 0) {
    let sortedPlayers = new Map([...players.entries()].sort((a, b) => a[0].localeCompare(b[0])));

    let answer = "";

    sortedPlayers.forEach((value, key) => {
        answer += key;
    })

    console.log(answer)
} else {
    console.log("PREDAJA")
}

