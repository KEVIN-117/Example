function add(...args) {
  return args.reduce((acc, val) => acc + val, 0);
}

const result = add(1, 2, 3, 4, 5);

console.log(result); // 15
