package de

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

internal class GameTest {

 lateinit var game: Game

  @BeforeEach
 fun before() {
    game = Game()
 }

 @Test
  fun `create new game`() {
    assertDoesNotThrow {
      Game()
    }
  }

  @Test
  fun `negative roll is impossible`()  {
    assertThrows<IllegalArgumentException> {
      game.roll(-1)
    }
  }

  @Test
  fun `roll greater than 10 is impossible`()  {
    assertThrows<IllegalArgumentException> {
      game.roll(11)
    }
  }

  @Test
  fun `initial score`() {
    val result = game.score()
    Assertions.assertThat(result).isEqualTo(0)
  }

  @Test
  fun `roll one`() {
    game.roll(1)
    val result = game.score()
    Assertions.assertThat(result).isEqualTo(1)
  }

}