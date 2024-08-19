import java.util.Collections

class Solution {
    fun solution(players: Array<String>, callings: Array<String>): MutableList<String> {
        var anPlayers = players.toMutableList()
        val playerMap: MutableMap<String, Int> = anPlayers.withIndex().associate { it.value to it.index }.toMutableMap()

        for (i in callings) {
            val index = playerMap[i]!!.toInt() //4
            val prePlayer = anPlayers[index-1] //po
            Collections.swap(anPlayers, index, index-1)
            playerMap[i] = index - 1 //mi -> 3로변경
            playerMap[prePlayer] = index//po -> 4으로

        }
        return anPlayers
    }
}