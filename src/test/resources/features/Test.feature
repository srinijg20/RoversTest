Feature: Rover movement analysis

  Scenario: Rover movement
    Given that the rover initial co ordinates
      | 1 | 2 | 1 |
    When I move in "LMLMLMLMM" direction

  @Srini
  Scenario Outline: Rover many movements
    Given rover is at position <x> and <y> and facing <z>
    When I move in the direction "<dir>"

    Examples: 
      | x | y | z | dir        |
      | 1 | 2 | 1 | LMLMLMLMM  |
      | 3 | 3 | 2 | MMRMMRMRRM |
