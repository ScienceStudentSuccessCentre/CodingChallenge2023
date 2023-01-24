#random board game

import pygame
import random

pygame.init()

# 2 players
# numbered checkered board
# each player 'rolls dice' and randomly generates number on how many times each player moves
# EX: after one player moves across the board the next one starts moving
# you will be doing this with pygame make sure to look at the hints and guidelines throughout the challenge
# whichever player reaches the end first wins
# wherever it says HINT, thats where your code should go

 

#HINT: SET GAMEBAORD DIMENSIONS 
# your code goes here
w = 
h = 

#set your dim value
dim = 100

# set your colours (feel free to change)
blue = (173,216,230)
white = (255,255,255)
black = (0,0,0)
red = (250,128,114)
green = (190,229,176)

current_colour = white

window = pygame.display.set_mode((w * dim, h * dim))

#initializing pygame font (feel free to change)
num_font = pygame.font.SysFont('constantia', 15, bold = True, italic = False)
number = 0

#loop for gameboard and numbering tiles 
for y in range(h):
	for x in range(w):
		
		#HINT: Draws numbered tiles
		pygame.draw.rect(window, current_colour, (x * dim, y * dim, dim, dim))
		# your code goes here
		
		window.blit(num_font.render(str(number), 100, black), (8+(x*dim), 8+(y*dim)))
		pygame.display.update()
		
		#HINT: think about how you're going to alternate between each colour for a checkered board
		# your code goes here

		

#set your players initial positions based on your board dim and shapes! 
player1 = pygame.draw.rect(window, red, (40,18,18,18))
print("Player 1 is a rectangle")
(p1_x,p1_y) = (40,18)

#set your players initial positions based on your board dim and shapes! 
player2 = pygame.draw.circle(window, green, (48,55),12)
print("player 2 is a circle")
(p2_x,p2_y) = (48,55)

pygame.display.update()

#HINT start with a boolean value for each player on which one gets to go first (LOOK AT THE IF STATEMENTS BELOW)



while True:
	#player 1 turn 
	if p1_turn == True:
		#HINT: randomly choose an integer between 1 and 10 which specifiy how many tiles to move forward (store it in a variable)
		#you can also print how many times player has moved to keep track
		  
		
		pygame.time.delay(1000)

		 
		
		#HINT: move player 1 horizontally depending on your dim, make sure to draw your shape
			
			

			pygame.display.update()
			pygame.time.delay(1000)

			#HINT: move player 1 to next line if not already won
			# you will want to do a little bit of math based on your dim, board, and shapes
			
			
			
			
			
			
			
		#HINT: exit loop if player 1 wins in its end position (based on size of shape)
		

		
		

	#player 2 turn 
	if p2_turn == True:
		#HINT: randomly choose an integer between 1 and 10 which specifiy how many tiles to move forward (store it in a variable)
		#you can also print how many times player has moved to keep track
		
		
		
		
		
		pygame.time.delay(1000)

		
		#HINT: move player 2 horizontally depending on your dim, make sure to draw your shape
			
			
			
			
			pygame.display.update()
			pygame.time.delay(1000)
			
			#HINT: move player 2 to next line if not already won
			# you will want to do a little bit of math based on your dim, board, and shapes
			
			
			
			
			
			
			
			
			

		#HINT: exit loop if player 2 wins in its end position (based on size of shape)
		

		

		

		pygame.time.delay(3000)
		
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
pygame.quit()
