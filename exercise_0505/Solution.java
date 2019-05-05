package exercise.exercise_0505;

 //分解让复杂问题简单
/*
字符串的排列
 */
/*
import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(str.length()==0 ||str == null){
            return result;
        }
        PermutationHelper(str.toCharArray(),0,result);
        Collections.sort(result);
        return result;
    }
    private void PermutationHelper(char[] chars,int i,ArrayList<String> result){
        if(i== chars.length-1){
            if(!result.contains(new String(chars))){
                result.add(new String(chars));
                return;
            }
        }else{
            for(int j=i; j<chars.length; j++){
                swap(chars,i,j);
                PermutationHelper(chars,i+1,result);
                swap(chars,i,j);
            }
        }
    }
    private void swap(char[] chars,int i,int j){
        if(i != j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }
}
*/

//综合
/*
把字符串转换成整数
题目描述
将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
输入描述:
输入一个字符串,包括数字字母符号,可以为空
输出描述:
如果是合法的数值表达则返回该数字，否则返回0
示例1
输入
+2147483647
    1a33
输出
2147483647
    0
 */
public class Solution {
    public int StrToInt(String str) {
        int len = str.length();
        if(len==0 || str == null){
            return 0;
        }
        int result = 0;
        boolean flag = true;
        int i=0;
        if(str.charAt(0) == '+'){
            i=1;
        }else if(str.charAt(0) == '-'){
            i=1;
            flag = false;
        }else if('0'>str.charAt(0)||str.charAt(0)>'9'){
            return 0;
        }
        for(; i<len; i++){
            char a = str.charAt(i);
            if('0'<=a && a<='9'){
                result = result*10 +(a-'0');
            }else{
                return 0;
            }
        }
        return flag ? result : -result;
    }
}