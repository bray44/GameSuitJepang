open class Player (var name: String) {
    private var score: Int = 0
    fun getScore() = score
    fun addScore() {
        score += 1
    }
}