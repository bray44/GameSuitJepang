class SuitJepangGame:  GameInterface {
    override val titleCard = "Selamat Datang di Game Suit Jepang\n"

    override fun gameStart() {
        println("1. Masukan untuk pemain 1:")
        pemainSatu.chooseWeapon()
        println("2. Masukan untuk pemain 2:")
        pemainDua.chooseWeapon()
        gameResult()
    }

    override fun gameResult() {
        if (pemainSatu.getWeapon() == pemainDua.getWeapon()) {
            println("HASIL: DRAW!")
            pemainSatu.addScore()
            showCurrentScore()
        } else if (pemainSatu.getWeapon() == "kertas" && pemainDua.getWeapon() == "batu" ) {
            println("HASIL: PEMAIN 1 MENANG!!")
            pemainSatu.addScore()
            showCurrentScore()
        } else if (pemainSatu.getWeapon() == "gunting" && pemainDua.getWeapon() == "kertas") {
            println("HASIL: PEMAIN 1 MENANG!!")
            pemainSatu.addScore()
            showCurrentScore()
        } else if (pemainSatu.getWeapon() == "batu" && pemainDua.getWeapon() == "gunting")     {
            println("HASIL: PEMAIN 1 MENANG!!")
            pemainSatu.addScore()
            showCurrentScore()
        } else {
            println("HASIL: PEMAIN 2 MENANG!!")
            pemainDua.addScore()
            showCurrentScore()
        }
    }

    override fun showCurrentScore() {
        println("SKOR SEMENTARA: ${pemainSatu.name} ${pemainSatu.getScore()}:${pemainDua.getScore()} ${pemainDua.name}")
        when {
            pemainSatu.getScore() == pemainDua.getScore() -> println("${pemainSatu.name} & ${pemainDua.name} seimbang!!\n" )
            pemainSatu.getScore() > pemainDua.getScore() -> println("${pemainSatu.name} memimpin!!\n")
            pemainSatu.getScore() < pemainDua.getScore() -> println("${pemainDua.name} memimpin!!\n")
        }
    }

    fun continueOrNot(): String {
        println("Apakah anda ingin melanjutkan permainan?(y/n)")
        var answer = readLine()!!.toString().lowercase()
        while (answer != "y" && answer != "n") {
            System.err.println("Input anda salah\n")
            println("Apakah anda ingin melanjutkan permainan?(y/n)")
            answer = readLine()!!.toString().lowercase()
        }
        return answer
    }
}