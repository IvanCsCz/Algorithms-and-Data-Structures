function searchSubstring(string, subString) {
  let strlen = string.length;
  let sublen = subString.length;
  let positions = [];

  for (let i = 0; i <= strlen - sublen; i++) {
    let aux = 0;

    while (aux < sublen) {
      if (string[i + aux] !== subString[aux]) {
        break;
      }
      aux++;
    }
    if (aux === sublen) {
      positions.push(i);
    }
  }
}
