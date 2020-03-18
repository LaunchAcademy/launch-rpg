# Launch RPG

## Characters
- Create a character class with the following attributes:
  * name
  * max hitpoints
  * A default weapon
  * current hitpoints
    * should be initialized as the same value as max hitpoints
  * a `getStatus` method
    - this method should output a string using stringbuilder which looks roughly as follows
    ```no-highlight
      ----
      Name: Billy
      Hitpoints: 100/100
      -----
    ```
  * a `takeDamage` method
    - this method should adjust the current hitpoints by the value passed in as an argument

- create the `main` method in the character class. Build out example characters, and example ArrayList called `party`, use ArrayList methods to add your characters to your party. Loop over the array using the character's getStatus method to build a string to output to the console with the results which should be each of the characters statuses. 

- Create a Nonplayer Character class:
  * inherit from character but use polymorphism so that the`getStatus`  indicates it's a non player character
  ```no-highlight
    ---
    Name: Joe (NPC)
    Hitpoints: 50/50
    ---
  ```
- Create a Wizard class:
  * inherit from character except constructor should also take in magic points
  * wizards should have current and max magic points as state. curret magic points should initialize equal to maximum magic points
  * a `getStatus` method that includes their magic points
    ```no-highlight
      ---
      Name: Jeff
      Hitpoints: 50/50
      Magic Points: 100/100
      ---
    ```
