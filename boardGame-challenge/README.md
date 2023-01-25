INSTRUCTIONS

First run the [testing.py](https://github.com/ScienceStudentSuccessCentre/CodingChallenge2023/blob/main/boardGame-challenge/testing.py) file, this is just to ensure pygame works on your device, you
should just see a blank white window pop up on your screen.

You may need to install pygame to your device if it does not work, click [here](https://www.pygame.org/wiki/GettingStarted) 
for the installation process

There are 2 players (as shapes) on a numbered, checkered board. Each player moves according to 
a randomly generated number by the randInt function, based on the number the specific player
gets, determines the number of tiles they get to move forward. After that, the second player moves
and player 1 and player 2 keeps alternating on taking turns. The player that reaches the last tile
of the board first wins, and the program stops.

**You should only be coding in the [boardGame.py](https://github.com/ScienceStudentSuccessCentre/CodingChallenge2023/blob/main/boardGame-challenge/boardGame.py) file

**Look at the [boardGameSample.png](https://github.com/ScienceStudentSuccessCentre/CodingChallenge2023/blob/main/boardGame-challenge/boardGameSample.png) file to get an idea of how the board should look like

**NOTE: any imports you may need is already in the 'base code,' make sure to follow the hints
and guidlines that are given throughout the file

Distribution of points:
- max 30 minutes
- max points earned 300

30 pts for numbering each tile and creating the checkered board

135 pts for moving player 1 across the board
  includes:
  - moving the player 1 across a row (60 pts)
  - moving player 1 down, once it reaches the end of a row (60 pts)
  - using the randInt function to determine how many tiles player 1 can move (15 pts)
  
135 pts for moving player 2 across the board
  includes:
  - moving the player 2 across a row (60 pts)
  - moving player 2 down, once it reaches the end of a row (60 pts)
  - using the randInt function to determine how many tiles player 2 can move (15 pts)
