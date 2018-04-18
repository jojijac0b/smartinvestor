# 002 - Jigsaw Puzzle

Design a jigsaw puzzle with N by M pieces.

# Clarifying Questions/Answers

**1) Is there a limit to how many pieces there can be?**

For the sake of scalability, limit the puzzle to be a max of 100,000 pieces

**2) Does each piece connect to up to 4 specific other pieces?**

Yes interior pieces connect to 4 surrounding pieces.  Sides and corners pieces connect to 2.

**3) Is there an image that we should account for?**

Yes for image.

**4) What about 3D jigsaw puzzles?**

No for 3D.

**5) Is this a timed game?**

No

**6) Is there a persistent score?**

No

# Objects

1) These are given for you: `Board` class, `Piece` class.
2)  What other objects do you need if any?

# Interviewer Checklist

1) Does the interviewee clarify the questions to get a good understanding of user requirements?

2) Does the interviewee demonstrate the composition of each object i.e., what owns what?

3) Does the interviewee demonstrate  inheritance hierarchy if applicable?

4) Does the interviewee detail the minimum properties (data) and methods (actions) of these objects to allow the user requirements to be met?

5) Do the objects ensure encapsulation of data leading to a good interface for methods and restricting unnecessary access to data?

# Specific Follow Up Questions

1) How do you check whether a piece fits with another piece?

2) How can you ensure that multiple groups of pieces can be worked on simultaneously?

3) How does a user reset the game?

4) How would you account for multiplayer, where players can collaborate?
