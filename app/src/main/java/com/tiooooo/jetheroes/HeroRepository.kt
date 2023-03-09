package com.tiooooo.jetheroes

import com.tiooooo.jetheroes.model.Hero
import com.tiooooo.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}
