import sun.jvm.hotspot.HelloWorld.e
import java.util.ArrayList

import sun.jvm.hotspot.HelloWorld.e
import java.util.ArrayList

import java.util.HashSet

import sun.jvm.hotspot.HelloWorld.e
import java.util.ArrayList

import java.util.HashSet

import sun.jvm.hotspot.HelloWorld.e




class Dictionnaire {
    private val entries = ArrayList<Ent>()
    fun nombreEntrees(): Int {
        return entries.size
    }
    fun ajouter(e: Ent) {
        require(!entries.contains(e)) { "Cette entrée existe déjà dans le dictionnaire" }
        entries.add(e)
    }
    fun supprimer(e: Ent): Boolean {
        return entries.remove(e)
    }
    fun supprimer(motAnglais: String?): Boolean {
        for (e in entries) {
            if (e.getMotAnglais().equals(motAnglais)) {
                return entries.remove(e)
            }
        }
        return false
    }
    fun frAn(motFrancais: String?): List<String>? {
        val motsAnglais: MutableList<String> = java.util.ArrayList<String>()
        for (e in entries) {
            if (e.getMotFrancais().equals(motFrancais)) {
                motsAnglais.add(e.getMotAnglais())
            }
        }
        return motsAnglais
    }
    fun motsFrancais(): List<String?>? {
        val motsFrancais: MutableSet<String> = HashSet<String>()
        for (e in entries) {
            motsFrancais.add(e.getMotFrancais())
        }
        return java.util.ArrayList<String>(motsFrancais)
    }

}