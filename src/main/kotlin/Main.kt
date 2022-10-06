var suitJepangGame = SuitJepangGame()
var pemainSatu = PlayerSuitJepang("Pemain 1")
var pemainDua = PlayerSuitJepang("Pemain 2")



fun main(args: Array<String>) {
    println(suitJepangGame.titleCard)
    do {suitJepangGame.gameStart()} while (suitJepangGame.continueOrNot() == "y")
}