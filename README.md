#Spiral Array
## Spiraling inwards

###Description
Written in java, this program will take the integer values greater than 1 create a spiraled matrix array from the top left corner, spiraling in a clockwise fashion moving inwards. The spiraled path will also have incrementing values starting at 1.


###Examples
###### For example a 2 x 2 array
[1, 2] - R1

[4, 3] - R2

###### Another example with a 3 x 3 array
[1, 2, 3] - R1

[8, 9, 4] - R2

[7, 6, 5] - R3

##Design
###Basic Implementation
In order to control the spiral of matrix value inputs, I setup 4 quatrants, each relying on 4 points within the matrix. Each of these points are situated on corners of the matrix at the start of the program and move inwards with each individual pass in each direction; top left to top right, top right to bottom right, bottom right to bottom left and lastly bottom left to top right.

