#Rithik Saripella

        #Bitmap PacMan

        #11/6/2022

        #functionality works just like pacman and you lose the game if you hit a ghost.

        #avoid the ghosts and eat the white pixels

        .eqv WIDTH 32

        # height of screen in pixels

        .eqv HEIGHT 32


        # colors
        .eqv	YELLOW 	0x00FFFF00
        .eqv 	CYAN 	0x0000FFFF
        .eqv 	BLUE    0x000000FF
        .eqv 	PINK 	0x00FF69B4
        .eqv 	RED 	0x00FF0000
        .eqv 	WHITE 	0x00FFFFFF
        #memory address of pixel
        .eqv 	MEM 0x10010000
        .text
        #length of y determined by s2
        main:

        #loop where i draw blue walls or before loop 1
        addi $a0, $zero, 0
        addi $s2, $zero, 31
        addi	$a1, $0, 0  # add to base address
        addi 	$a2, $0, BLUE
        loop1:

        jal draw_pixel
        addi $a0, $a0, 1
        beq $a0, $s2, beforeLoop2
        j loop1


        beforeLoop2:	#loop where i draw blue walls
        addi $a0, $zero, 0
        addi $a1, $0, 0  # add to base address
        loop2:
        jal draw_pixel
        addi $a1, $a1, 1
        beq $a1, $s2, beforeLoop3 #y value is changing
        j loop2

        beforeLoop3:	#loop where i draw white walls
        addi $a0, $zero, 31
        addi $a1, $0, 0  # add to base address

        loop3:
        jal draw_pixel
        addi $a1, $a1, 1
        beq $a1, $s2, beforeLoop4  #y value is changing
        j loop3
        exit3:
        #a0 = x
        #a1 = y
        beforeLoop4:	#loop where i draw white walls
        addi $a0, $zero, 0
        addi $a1, $0, 31 # add to base address

        loop4:
        jal draw_pixel
        addi $a0, $a0, 1
        beq $a0, $s2, exit4#y value is changing
        j loop4
        exit4:

        beforeLoop5:
        addi $a0, $zero, 8    #x=8
        addi $a1, $0, 1       #y = 1
        addi $s2, $zero, 9   #makes it go down as many pixels. is a counter
        loop5:
        jal draw_pixel
        addi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq $a1, $s2, exit5  #once y = this value then stop
        j loop5
        exit5:

        beforeLoop6:
        addi $a0, $zero, 23   #x=23
        addi $a1, $0, 1       #y = 1
        addi $s2, $zero, 9
        loop6:
        jal draw_pixel
        addi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq $a1, $s2, exit6 #once y = this value then stop
        j loop6
        exit6:

        beforeLoop7:
        addi $a0, $zero, 11   #x=11
        addi $a1, $0, 8      #y = 3
        addi $s2, $zero, 20
        loop7:
        jal draw_pixel
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit7#once y = this value then stop
        j loop7
        exit7:

        beforeLoop8:
        addi $a0, $zero, 8    #x=8
        addi $a1, $0, 30    #y = 31 - 1
        addi $s2, $zero, 24  #for bottom row up. its 31 - 9
        loop8:
        jal draw_pixel
        subi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq $a1, $s2, exit8  #once y = this value then stop
        j loop8
        exit8:

        beforeLoop9:
        addi $a0, $zero, 23    #x= 31 - 8
        addi $a1, $0, 30       #y = 31 - 1
        addi $s2, $zero, 25   #31 - 9 as well
        loop9:
        jal draw_pixel
        subi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq  $a1, $s2, exit9#once y = this value then stop
        j loop9
        exit9:
        beforeLoop10:
        addi $a0, $zero, 11   #x=11
        addi $a1, $0, 23      #y = 1
        addi $s2, $zero, 20
        loop10:
        jal draw_pixel
        addi $a0, $a0, 1   #increments y and s2 is stop value as well
        beq $a0, $s2, exit10 #once y = this value then stop
        j loop10
        exit10:

        beforeLoop11:
        addi $a0, $zero, 11 #x=11
        addi $a1, $0, 13      #y = 1
        addi $s2, $zero, 8	#stops at 11
        loop11:
        jal draw_pixel
        subi $a0, $a0, 1   #increments y and s2 is stop value as well
        beq $a0, $s2, exit11 #once y = this value then stop
        j loop11
        exit11:
        beforeLoop12:
        addi $a0, $zero, 8    #x=8
        addi $a1, $0, 13       #y = 1
        addi $s2, $zero, 17  #makes it go down as many pixels. is a counter
        loop12:
        jal draw_pixel
        addi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq $a1, $s2, exit12  #once y = this value then stop
        j loop12
        exit12:
        beforeLoop13:
        addi $a0, $zero, 8   #x=8
        addi $a1, $0, 17       #y = 1
        addi $s2, $zero, 23
        loop13:
        jal draw_pixel
        addi $a0, $a0, 1   #increments y and s2 is stop value as well
        beq $a0, $s2, exit13 #once y = this value then stop
        j loop13
        exit13:
        beforeLoop14:
        addi $a0, $zero, 23    #x=8
        addi $a1, $0, 17    #y = 31 - 1
        addi $s2, $zero, 13  #for bottom row up. its 31 - 9
        loop14:
        jal draw_pixel
        subi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq $a1, $s2, exit14  #once y = this value then stop
        j loop14
        exit14:
        beforeLoop15:
        addi $a0, $zero, 11   #x=11
        addi $a1, $0, 23      #y = 1
        addi $s2, $zero, 20
        loop15:
        jal draw_pixel
        addi $a0, $a0, 1   #increments y and s2 is stop value as well
        beq $a0, $s2, exit15 #once y = this value then stop
        j loop15
        exit15:
        beforeLoop16:
        addi $a0, $zero, 19#x=11
        addi $a1, $0, 13    #y = 3
        addi $s2, $zero, 24
        loop16:
        jal draw_pixel
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit16#once y = this value then stop
        j loop16
        exit16:
        beforeLoop17:
        addi $a0, $zero, 3    #x=8
        addi $a1, $0, 7       #y = 1
        addi $s2, $zero, 20  #makes it go down as many pixels. is a counter
        loop17:
        jal draw_pixel
        addi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq $a1, $s2, exit17 #once y = this value then stop
        j loop17
        exit17:
        beforeLoop18:
        addi $a0, $zero, 28    #x=8
        addi $a1, $0, 19       #y = 1
        addi $s2, $zero, 7 #makes it go down as many pixels. is a counter
        loop18:
        jal draw_pixel
        subi $a1, $a1, 1   #increments y and s2 is stop value as well
        beq $a1, $s2, exit18  #once y = this value then stop
        j loop18
        exit18:
        #the bottom of the ghost drawing line
        beforeLoop19:
        addi $a0, $zero, 14 #x=14
        addi $a1, $0, 11    #y = 11
        addi $s2, $zero, 18
        loop19:
        addi $a2, $0, PINK
        jal  draw_ghost1
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit19#once y = this value then stop
        j loop19
        exit19:
        #top of ghost drawing
        beforeLoop20:
        addi $a0, $zero, 15#x=15
        addi $a1, $0, 10    #y = 10
        addi $s2, $zero, 17
        loop20:
        addi $a2, $0, PINK
        jal draw_ghost1
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit20#once y = this value then stop
        j loop20
        exit20:
        #ghost thats middle bot
        beforeLoop21:
        addi $a0, $zero, 14#x=14
        addi $a1, $0, 28    #y = 28
        addi $s2, $zero, 18
        loop21:
        addi $a2, $0, CYAN
        jal draw_ghost1
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit21#once y = this value then stop
        j loop21
        exit21:
        beforeLoop22:
        addi $a0, $zero, 15#x=15
        addi $a1, $0, 27    #y = 27
        addi $s2, $zero, 17
        loop22:
        addi $a2, $0, CYAN
        jal draw_ghost1
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit22#once y = this value then stop
        j loop22
        exit22:
        #ghost that is top of screen
        beforeLoop23:
        addi $a0, $zero, 14#x=14
        addi $a1, $0, 4  #y = 4
        addi $s2, $zero, 18
        loop23:
        addi $a2, $0, RED
        jal draw_ghost1
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit23#once y = this value then stop
        j loop23
        exit23:


        beforeLoop24:
        addi $a0, $zero, 15#x=15
        addi $a1, $0, 3    #y = 3
        addi $s2, $zero, 17


        loop24:
        addi $a2, $0, RED
        jal  draw_ghost1
        addi $a0, $a0, 1   #increments x and s2 is stop value as well
        beq  $a0, $s2, exit24#once y = this value then stop
        j loop24
        exit24:

        #draw white pixels for pacman to eat
        li $a0, 2
        li $a1, 2
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 4
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 6
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 8
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 10
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 12
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 14
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 16
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 22
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 24
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 26
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 28
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 2
        li $a1, 30
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 2
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 4
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 6
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 8
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 10
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 12
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 14
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 16
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 22
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 24
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 26
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 28
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 4
        li $a1, 30
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 2
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 4
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 6
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 8
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 10
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 12
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 14
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 16
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 22
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 24
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 26
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 28
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 6
        li $a1, 30
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 2
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 4
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 6
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 8
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 10
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 12
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 14
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 16
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 22
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 24
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 26
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 28
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 25
        li $a1, 30
        li $a2, WHITE
        jal 	draw_pixel

        # y coordinates 18 across 20 across and 22 across
        #x coordinates are 8 till 24
        li $a0, 8
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 10
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 12
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 14
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 16
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 18
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 20
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 22
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 8
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 10
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 12
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 14
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 16
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 18
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 20
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 22
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 2
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 4
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 6
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 8
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 10
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 12
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 14
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 16
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 22
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 24
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 26
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 28
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 29
        li $a1, 30
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 2
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 4
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 6
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 8
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 10
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 12
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 14
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 16
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 18
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 20
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 22
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 24
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 26
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 28
        li $a2, WHITE
        jal 	draw_pixel

        li $a0, 27
        li $a1, 30
        li $a2, WHITE
        jal 	draw_pixel



        #before the loop where pacman moves I need to check if the pixel next to it is blue.
        #If pixel is blue then don't move pacman there
        #pacman pixel
        addi 	$a0, $0, WIDTH    # a0 = X = WIDTH/2
        srl 	$a0, $a0, 1
        addi 	$a1, $0, HEIGHT   # a1 = Y = HEIGHT/2
        srl 	$a1, $a1, 1
        addi 	$a2, $0, YELLOW  # a2 = red (ox00RRGGBB)
        jal 	draw_pacman


        loop:


        # check for input
        lw  $t0, 0xffff0000  #t1 holds if input available
        beq $t0, 0, loop   #If no input, keep displaying

        # process input
        lw 	$s1, 0xffff0004
        beq	$s1, 32, exit	# input space
        beq	$s1, 119, up 	# input w
        beq	$s1, 115, down 	# input s
        beq	$s1, 97, left  	# input a
        beq	$s1, 100, right	# input d
        # invalid input, ignore
        j	loop

        # process valid input

        up:
        addi	$a1, $a1, -1
        jal 	get_color
        li 	$t0, BLUE
        beq 	$v0,$t0, notup
        li 	$t0, CYAN
        beq 	$v0,$t0, game_over
        li 	$t0, RED
        beq 	$v0,$t0, game_over
        li 	$t0, PINK
        beq 	$v0,$t0, game_over
        addi 	$a1, $a1, 1
        li	$a2, 0		# black out the pixel
        jal	draw_pixel
        addi	$a1, $a1, -1
        addi 	$a2, $0, YELLOW
        jal	draw_pixel
        j 	loop


        notup:
        addi	$a1, $a1, 1
        j 	loop


        down:	addi	$a1, $a1, 1
        jal 	get_color
        li 	$t0, BLUE
        beq 	$v0,$t0, loop
        li 	$t0, CYAN
        beq 	$v0,$t0, game_over
        li 	$t0, RED
        beq 	$v0,$t0, game_over
        li 	$t0, PINK
        beq 	$v0,$t0, game_over
        addi 	$a1, $a1, -1
        li	$a2, 0		# black out the pixel
        jal	draw_pixel
        addi	$a1, $a1, 1
        addi 	$a2, $0, YELLOW
        jal	draw_pixel
        j 	loop


        notdown:
        addi	$a1, $a1, -1
        j 	loop


        right:	addi	$a0, $a0, 1
        jal 	get_color
        li 	$t0, BLUE
        beq 	$v0,$t0, loop
        li 	$t0, CYAN
        beq 	$v0,$t0, game_over
        li 	$t0, RED
        beq 	$v0,$t0, game_over
        li 	$t0, PINK
        beq 	$v0,$t0, game_over
        addi 	$a0, $a0, -1
        li	$a2, 0		# black out the pixel
        jal	draw_pixel
        addi	$a0, $a0, 1
        addi 	$a2, $0, YELLOW
        jal	draw_pixel
        j 	loop


        notright:
        addi	$a0, $a0, -1
        j 	loop


        left:	addi	$a0, $a0, -1
        jal 	get_color
        li 	$t0, BLUE
        beq 	$v0,$t0, loop
        li 	$t0, CYAN
        beq 	$v0,$t0, game_over
        li 	$t0, RED
        beq 	$v0,$t0, game_over
        li 	$t0, PINK
        beq 	$v0,$t0, game_over
        addi 	$a0, $a0, 1
        li	$a2, 0		# black out the pixel
        jal	draw_pixel
        addi	$a0, $a0, -1
        addi 	$a2, $0, YELLOW
        jal	draw_pixel
        j 	loop
        notleft:
        addi	$a0, $a0, 1
        j 	loop
        exit:

        # subroutine to draw a pixel
        # $a0 = X
        # $a1 = Y
        # $a2 = color
        draw_pixel:

        # $s1 = address = MEM + 4*(x + y*width)
        mul  $s1, $a1, WIDTH
        add  $s1, $s1, $a0
        mul  $s1, $s1, 4
        add  $s1, $s1, MEM
        sw  $a2, 0($s1)
        jr  $ra


        get_color:
        # $s1 = address = MEM + 4*(x + y*width)
        mul  $s1, $a1, WIDTH
        add  $s1, $s1, $a0
        mul  $s1, $s1, 4
        add  $s1, $s1, MEM
        lw  $v0, 0($s1)
        jr  $ra


        draw_ghost1:
        mul  $s1, $a1, WIDTH
        add  $s1, $s1, $a0
        mul  $s1, $s1, 4
        add  $s1, $s1, MEM
        sw  $a2, 0($s1)
        jr  $ra


        draw_pacman:
        # s1 = address = $gp + 4*(x + y*width)
        mul	$t9, $a1, WIDTH   # y * WIDTH
        add	$t9, $t9, $a0	  # add X
        mul	$t9, $t9, 4	  # multiply by 4 to get word offset
        add	$t9, $t9, MEM  # add to base address
        sw	$a2, ($t9)	  # store color at memory location
        jr 	$ra


        game_over:
        li $v0, 10
        syscall

	