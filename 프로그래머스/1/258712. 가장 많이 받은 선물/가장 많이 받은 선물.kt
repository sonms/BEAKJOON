class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        var answer: Int = 0
        // 받은 선물 - 이름, 받은 선물 개수
        val getGift = mutableMapOf<String, Int?>()
        //준 선물 - 이름,준 선물개수
        val giveGift = mutableMapOf<String?, Int?>()
        //선물을 주고 받은 기록
        val record = mutableMapOf<String?, ArrayList<String>>()
        //선물지수
        val giftIndex = mutableMapOf<String?, Int?>()
        //다음 달 결과
        val resultGift = mutableMapOf<String?, Int?>()

        for (friend in friends) {
            record[friend] = ArrayList()
            giftIndex[friend] = 0
            getGift[friend] = 0
            giveGift[friend] = 0
            resultGift[friend] = 0

            for (gift in gifts) {
                if (gift.split(" ").first() == friend) {
                        giveGift.replace(friend, giveGift[friend],giveGift[friend]?.let { it+1 })

                    }

                    if (gift.split(" ").last() == friend) {
                        getGift.replace(friend, getGift[friend], getGift[friend]?.let { it+1 })
                        record[friend]?.add(gift.split(" ").first())
                    }
                }

                giftIndex.replace(friend, giftIndex[friend], giveGift[friend]?.minus(getGift[friend]!!))
        }

        for (j in giftIndex) {//muzi
            for (friend in friends) {
                if (j.key == friend) {
                    continue
                }

                val toCount = record[j.key]?.count { it == friend } ?: 0 //3
                val friendCount = record[friend]?.count { it == j.key } ?: 0 //0

                if (toCount < friendCount) {
                    resultGift[j.key] = resultGift[j.key]?.plus(1)
                }

                if (toCount == 0 && friendCount == 0 || toCount == friendCount) {
                    if (j.value!! > giftIndex[friend]!!) {
                        resultGift[j.key] = resultGift[j.key]?.plus(1)
                    }
                }
            }
        }
        
        answer = resultGift.maxOf {it.value!!}
        
        return answer
    }
}