// Extension pour vérifier si la chaine est vide ou blanche
fun String.estVideOuBlanche(): Boolean {
    return this.trim().isEmpty()
}

// Extension pour retourner le sigle de la chaine
fun String.sigle(): String {
    val words = this.trim().split("\\s+".toRegex())
    val sigle = StringBuilder()
    for (word in words) {
        sigle.append(word.first().toUpperCase())
    }
    return sigle.toString()
}