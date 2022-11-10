# PacManProject
Instructions on how to run the program:

You need to pull up the bitmap display as well as the keyboard display and attach it to MIPS.
Type WASD into the keyboard display to move Pac-Man around and if you hit into a ghost the program will end.

Written overview on what the program does:

The program is a simple run of the famous Pac-Man game
The aim of the game is to eat all the white dots while avoiding the ghosts and if you hit the ghosts the program ends.

Flowchart of the program logic:
In the beginning of the code I load up the colors and the width and height of the screen in pixels.
My main function begins with four loops that draw the four blue outer walls of the maze that pac man will be in.
The other blue walls that I draw in to make the maze follow the x and y coordinate logic and I choose where on the bitmap I draw pieces of the maze. 
When I target where on the bitmap I call the draw_pixel function and increment either x or y until it hits the max counter value in the beq instruction.
I repeated this process over 20 times to finish the maze until I had to draw the ghosts with loops.
The draw_ pixel  function follows the formula $s1 = address = MEM + 4*(x + y*width) and store the color at the end of the function.
We use get_color and it uses the same formula as draw_pixel. Gets whatever color already stored there rather than storing the color like draw_pixel does. Returns in $v0
The code for drawing the ghosts follows the same logic as drawing the walls but the only difference was that I loaded in different colors to show the user which ones the ghosts are.
The next portion of the flowchart shows me loading pacman into the middle of the maze by dividing the width and height by 2 and storing the pixel color as yellow to symbolize pacman
For the keyboard input loop we start by calling the draw_pixel function and then check if input is available. If no input or invalid input we jump the loop and ignore the instructions for wasd movement of the pacman pixel.
For the directions (up, down, left, right) First we check the pixel that the user wants to move pac man to. If there is a wall then action is cancelled and it goes back to keyboard input. If there’s a ghost then it calls the game over function. I black out the pixel, then call draw pixel function again, then use addi instruction to show which direction I’m going and use $a0 or $a1 depending on if I use x or y. 
Obviously game over function ends the program when pac man hits ghost.
I repeated this steps for all directions.

User helpful tips:
When moving pacman don’t hold down any of the keys as you could easily run into a ghost and lose the game.

