```
TNPG: NGL -- Nafiz Labib, Gabriel Thompson, Lauren Lee
APCS pd8
HW91: Deque the Halls
2022-04-13
time spent: 0.3 hr
```
Plan:
1) Write interface with all methods
2) Implement methods one-by-one (in order listed below)
  - isEmpty()
  - peek (first and last)
  - remove (first and last)
  - add (first and last)
  - poll (first and last)
3) Enjoy

Design Breakdown:
- All of these methods already exist in LinkedList:
  - We started with isEmpty() because it's the simplest.
  - We went on to peek because it's the next simplest method.
  - Afterwards, we did remove and add, because they are the more "important" methods that have more functionality.
- We did poll last because we didn't originally include it in our implementation of Deque, but decided to do so later. We looked at other people's codes, and they had poll, so we're using poll too.
- We are NOT implementing offer because we're using LinkedList, which won't have capacity problems.   
