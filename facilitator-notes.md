# Launch RPG

## Characters

- Characters have:
  - A character name
  - Max Energy
  - A weapon
  - a `getStatus` method that prints out the name and how many current hit points they have out of max hit points
  - a `takeDamage` method that takes in damage and decreases energy
  - refactor `takeDamage` to advise if a character is dead (reaches 0 energy)
- Computer Characters have:
  - a `getStatus` that indicates it's a computer character (adds `"(COMPUTER)\n"` to the beginning of the string)
- A wizard has:
  - Magic Points (maxMagicPoints and a `currentMagicPoints` that starts at max - 10)
  - a `getStatus` that includes their magic points
  - a `castSpell` method that takes in `magicUsed` and updates the magic points to decrease by that many points (handle for not enough magic!)
