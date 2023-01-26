package de

class Game {

  private var score = 0

  fun roll(pins: Int) {
    if (pins < 0 || pins > 10) {
      throw IllegalArgumentException("hihi")
    }
    score = pins
  }

  fun score(): Int {
    return score
  }
}