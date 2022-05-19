function detectWord(str) {
    let newStr = ""

    for (let l of str){
        if(l.toLowerCase() === l){
        newStr += l;
        }
    }

    return newStr;
}