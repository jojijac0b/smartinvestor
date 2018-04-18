# 003 - Elevator System

Design an elevator system for a building with two elevator shafts.

# Clarifying Questions

**1) What kind of building is it used for?**

General purpose office for work, mainly used 9-5pm and about 100 people per floor.

**2) What are the specs of the building, elevator?**

40 floors. Each elevator can hold 15 people at once. The elevator travels at 3 miles/hr.

**3)What should I optimize for?**

Individual people should on average get picked up quickly.

# Objects

a. These are given for you: `Elevator` class, `Button` class.

b.  What other objects do you need if any?

# Interviewer Checklist

1) Does the interviewee clarify the questions to get a good understanding of user requirements?

2) Does the interviewee demonstrate the composition of each object i.e., what owns what?

3) Does the interviewee demonstrate  inheritance hierarchy if applicable?

4) Does the interviewee detail the minimum properties (data) and methods (actions) of these objects to allow the user requirements to be met?

5) Do the objects ensure encapsulation of data leading to a good interface for methods and restricting unnecessary access to data?

# Specific Follow Up Questions

1) Where do you place an elevator that isn’t occupied?

2) How does the system know which elevator to send to a request?

3) How does adding more elevators change the algorithm to determine elevator route?
