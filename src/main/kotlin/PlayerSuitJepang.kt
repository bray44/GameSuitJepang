class PlayerSuitJepang(name: String): Player(name) {
    private var weapon: String = ""

    fun getWeapon() = weapon

    fun chooseWeapon() {
        weapon = readLine()!!.toString().lowercase()
        when (weapon) {
            "gunting","batu","kertas" -> println("Senjatamu berhasil disimpan.\n")
            else -> errMessage()
        }
    }

    private fun errMessage() {
        System.err.println("Input anda tidak bisa diterima. Silahkan ketik gunting, batu, atau kertas di bawah:")
        chooseWeapon()
    }
}