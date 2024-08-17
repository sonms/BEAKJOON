class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val mapReport = HashMap<String, ArrayList<String>>()
        val reportList = arrayListOf<String>()
        var answer = intArrayOf()

        for (i in report) {
            val (first, second) = i.split(" ")
            //여러번 신고
            if (!mapReport.containsKey(first)) {
            mapReport[first] = ArrayList()
        }

        // 동일 신고 중복 방지
        if (!mapReport[first]!!.contains(second)) {
            mapReport[first]!!.add(second)
            reportList.add(second)
        }
        }
    
        val reportKey = reportList.groupingBy { it }.eachCount().filter { it.value >= k }.keys

        //val result = mutableMapOf<String, Int>()
        for (user in id_list) {
            val count = mapReport[user]?.count { it in reportKey } ?: 0
            answer = answer.plus(count)
        }
        return answer
    }
}