# Python Pair Challenge

1. Find `pair-challenge.py` in this directory, this is the only file you'll need to use for the challenge.

2. There is a variable called `data` with a list of numbers from [1,100]. In the function `getPairsSum100`, the data is copied into a local variable. 
3. You are to return a list of pairs from numbers in the data, in which the two numbers added together equal 100. To make this simpler, each instance of a number can only be used in one pair. Sort numbers within pairs by lowest number, and sort pairs by lowest number. ex: [ [1, 99], [49,51] ]. For example, with the numbers [1, 99, 99], the result would be [[1,99]], since the 1 can only be used in one pair.
4. results should be items in the output variable. they can be lists with 2 elements, tuples, string etc, anything to represent it, but each item in the output list must be a result.
5. To aid your debugging, there are 27 pairs in the data.

Try to solve this in a time complexity less than n^2.