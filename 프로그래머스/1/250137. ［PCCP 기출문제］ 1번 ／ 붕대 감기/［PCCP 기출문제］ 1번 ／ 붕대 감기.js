
// bandage = [시전 시간, 1초당 회복량, 추가 회복량]
// health = 최대 체력
// attacks = [[공격 시간, 피해량], ...]

function solution(bandage, health, attacks) {
  const max = health;
  let gap_time = 0;
  for (let i = 0; i < attacks.length; i++) {
    if (i !== 0) gap_time = attacks[i][0] - attacks[i - 1][0] - 1;

    health += bandage[1] * gap_time; // 1초당 회복량
    if (health > max) health = max;

    health += bandage[2] * Math.floor(gap_time / bandage[0]); // 추가 회복량
    if (health > max) health = max;

    health -= attacks[i][1]; // 피해량
    if (health <= 0) return -1; // 캐릭터 사망
  }
  return health;
}
