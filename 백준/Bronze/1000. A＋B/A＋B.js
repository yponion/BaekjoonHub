const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./example.txt";
let input = require("fs").readFileSync(filePath).toString().trim().split(" ");

const a = parseInt(input[0]);
const b = parseInt(input[1]);
console.log(a + b);
