/***
Team Mamba: Nafiz Labib, Kartik Vanjani, Prattay Dey
APCS pd8
HW93 -- A Tree Grows in 251
2022-05-05r
time spent:  hrs


DISCO
------------------------------------------------
* After further consideration, trees can never have closed tours, but can sometimes have open tours.
================================================


QCC
------------------------------------------------
* What is a good alternate definition of balanced?
- Why does balanced tree have allowable height difference of 1?
- Is the Man Who Is Tall Happy? (what do we answer for this)
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
- A tree grows downwards, because the root is the topmost node.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
- A tree is made up of distinct nodes connected by paths.
- A tree has no cycles, because when we traverse it, we never "go around" the nodes and stop at the original node. We always stop our overall traversal at a node that is yet to be processed.
- Because a tree has no cycles, it has no closed tour. If a tree is degenerate, it can have an open tour because it will only traverse in one direction without reaching an already reached node.

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
- Not quite sure, but if we're talking about just binary trees, then when you reach the highest level, or the ""height", one side might have child nodes, another might not. Again, not sure about allowable part.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
- Left and right subtrees of a tree are balanced (height difference of 1 or less).

Is a perfect tree complete?
- Yes, because in a perfect tree, all levels are full. In a complete tree, at least all the levels besides the last one is full.

Is a complete tree balanced?
- Yes, because if all levels are filled, then the left and right subtrees have a height difference of 1 or less (it's actually 0 in this case).

Is the Man Who Is Tall Happy?
- Is the Man Who Is Tall Happy? is a 2013 French animated documentary film by Michel Gondry about the linguist, philosopher, and political activist Noam Chomsky.
- (I dont't know what I'm supposed to answer for this, I googled this and it's an actual movie.)

What must be true of perfect trees but not others?
- All levels are completely full.
================================================


C'EST POSSIBLE?
------------------------------------------------
< your explanation of whether the tree reconstruction challenge given in class is achievable or not >
================================================
We were able to make a tree that makes sense (although it took some time for me):
      E
       \
        G
       /
       D
       / \
      K   I
          / \
          N  L  // branches off from I
             / \
            O   W // branches off from L
Sort of brute forced through this, which wasn't the best idea. However, there are clues to start off with, like how E is definitely the root and it has no left branch because E is still first in the in-order.
***/
