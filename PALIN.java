//package DSA;

class PALIN{
    // same digit in reverse
    static boolean isPalindrome(int x)
    {
    int rev = 0;
    int temp = x;
    while(temp !=0)
    {
        //int ld = temp % 10 ;
        rev = (rev * 10) +(temp % 10);
        temp = temp/10;
    }
    return (rev == x);
}
public static void main (String []args){
    int x = 454;
    if (isPalindrome(x) == true){
        System.out.println("yes");
    }
    else {
        System.out.println("no");
    }
}
}