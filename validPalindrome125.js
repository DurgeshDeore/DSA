var isPalindrome = function(s) {
    let str="";
    for(let i=0;i<s.length;i++){
        if(s[i].match(/[a-zA-Z0-9]/)){
            str+=s[i];
        }
    }
    str=str.toLowerCase();
    let j=str.length-1,i=0;
    while(i<j){
        if(str[i++] !== str[j--]){
            return false;
        }
    }
    return true;
};
