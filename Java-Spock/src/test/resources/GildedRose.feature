Feature: Gilded Rose quality
  I want to know if the quality is updated properlys

  Scenario: Sellin and Quality decreasing
    Given for "+5 Dexterity Vest" initial sellin is 20 and quality is 30
    When I update the quality
    Then I should get sellin as 19 and quality as 29

  Scenario: Once the sell by date has passed, Quality degrades twice as fast
    Given for "+5 Dexterity Vest" initial sellin is 1 and quality is 30
    When I update the quality
    When I update the quality
    Then I should get sellin as -1 and quality as 27

  Scenario: The Quality of an item is never negative
    Given for "+5 Dexterity Vest" initial sellin is 10 and quality is 1
    When I update the quality
    When I update the quality
    Then I should get sellin as 8 and quality as 0

  Scenario: "Aged Brie" actually increases in Quality the older it gets
    Given for "Aged Brie" initial sellin is 10 and quality is 10
    When I update the quality
    When I update the quality
    Then I should get sellin as 8 and quality as 12

  Scenario: The Quality of an item is never more than 50
    Given for "Aged Brie" initial sellin is 10 and quality is 49
    When I update the quality
    When I update the quality
    Then I should get sellin as 8 and quality as 50

  Scenario: "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
    Given for "Sulfuras, Hand of Ragnaros" initial sellin is 0 and quality is 10
    When I update the quality
    Then I should get sellin as 0 and quality as 10

  Scenario: "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches
    Given for "Backstage passes to a TAFKAL80ETC concert" initial sellin is 11 and quality is 10
    When I update the quality
    Then I should get sellin as 10 and quality as 11
    When I update the quality
    Then I should get sellin as 9 and quality as 13

  Scenario: "Backstage passes", like aged brie, Quality increases by 2 when there are 10 days or less
    Given for "Backstage passes to a TAFKAL80ETC concert" initial sellin is 6 and quality is 10
    When I update the quality
    Then I should get sellin as 5 and quality as 12
    When I update the quality
    Then I should get sellin as 4 and quality as 15

  Scenario: "Backstage passes", like aged brie, Quality increases by 3 when there are 5 days or less
    Given for "Backstage passes to a TAFKAL80ETC concert" initial sellin is 6 and quality is 10
    When I update the quality
    Then I should get sellin as 5 and quality as 12
    When I update the quality
    Then I should get sellin as 4 and quality as 15

  Scenario: "Backstage passes", like aged brie, Quality drops to 0 after the concert
    Given for "Backstage passes to a TAFKAL80ETC concert" initial sellin is 1 and quality is 10
    When I update the quality
    Then I should get sellin as 0 and quality as 13
    When I update the quality
    Then I should get sellin as -1 and quality as 0
