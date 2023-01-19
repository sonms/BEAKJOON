class Solution {
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a

    fun lcm(a : Int, b : Int) : Int {
        return a * b / gcd(a,b)
    }
    
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(3,3)
        
        answer[0] = if (n > m) {
            gcd(n,m)
        } else {
            gcd(m,n)
        }

        answer[1] = if (n > m) {
            lcm(n,m)
        } else {
            lcm(m,n)
        }
        
        return answer
    }
}