package com.pretest.repositories

import com.pretest.data.model.ChampModel

class ChampionRepository(private val champions: MutableList<ChampModel>) {
    fun getChamps () = champions
    fun addChamp (champ: ChampModel) = champions.add(champ);
}