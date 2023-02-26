class Entree(private var anglais: String, private var francais: String) {
    init {
        require(!anglais.isNullOrBlank() && !francais.isNullOrBlank()) { "Les deux mots doivent être non null, non vides et non blancs" }
    }

    fun setAnglais(anglais: String) {
        require(!anglais.isNullOrBlank()) { "Le mot anglais doit être non null, non vide et non blanc" }
        this.anglais = anglais
    }

    fun setFrancais(francais: String) {
        require(!francais.isNullOrBlank()) { "Le mot français doit être non null, non vide et non blanc" }
        this.francais = francais
    }
    override fun toString(): String {
        return "$anglais:$francais"
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ent) return false
        return francais == other.francais
    }
}