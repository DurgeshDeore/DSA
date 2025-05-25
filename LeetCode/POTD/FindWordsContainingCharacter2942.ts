function findWordsContaining(words: string[], x: string): number[] {
    const res: number[] = [];
    for (let i = 0; i < words.length; i++){
        if(words[i].includes(x)){
            res.push(i);
        }
    }
    return res;
};
