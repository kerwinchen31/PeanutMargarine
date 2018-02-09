# PeanutMargarine
Henry Carver, Kerwin Chen, Clarence Cheng
APCS2 Pd1
L#00 -- But What Does the Data Say?
2018-02-09

Hypothesis: The time will increase in a linear fashion as the size of the matrix increases.

Background:
Searching through Matrixes can take varying amounts of time depending on the matrix size, the method, and the search value. We optimized the method by making a linear one. We use varying sizes to see how it affects runtime. We searched for the value in the bottom left corner control our experiment.

Experiment Methodology:
Our search method will be the method described in MatrixFinder, which is a linear search beginning in the top right corner and work down and left to find the target that is being searched for. Down if the current int is less than the target, left is the current int is greater than the target.

For timing, we will start off by giving a long the value of currentTimeMillis. It will end with assigning another long with currentTimeMillis at that point in time. The former will be subtracted from the latter, and that value will be returned.

We will begin experimentation by using the same matrix and the same target many times, just to ensure that our search is really linear, before we start trying to randomly generate or enlarge the matrices.

Results:

![Graph ](chart.png)
![Graph avgChart](Avgchart.png)


Conclusions:
It is O(n). As expected bigger matrixes come with longer runtimes. We do not understand why the zigzags ups and down so violently!
