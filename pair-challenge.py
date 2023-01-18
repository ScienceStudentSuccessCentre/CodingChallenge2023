data = [58,68,32,96,45,84,29,20,92,50,95,7,72,19,35,83,88,3,8,62,44,26,95,72,77,67,99,16,35,67,42,5,32,47,72,80,58,96,38,12,46,60,31,27,4,7,45,41,41,69,23,5,28,39,16,81,88,19,32,23,79,39,100,77,73,11,6,65,41,31,10,2,12,91,55,94,77,100,73,84,64,93,13,77,15,73,87,16,84,38,63,85,80,61,32,34,98,46,60,95]

# return a list of pairs from numbers in the data, in which the two numbers added together equal 100. 
# To make this simpler, each instance of a number can only be used in one pair.
# Sort numbers within pairs by lowest number, and sort pairs by lowest number. ex: [ [1, 99], [49,51] ]
# results should be items in the output variable. they can be lists with 2 elements, tuples, string etc, anything to represent it,
# but each item in the output list must be a result.
def getPairsSum100():

    numbers = data[:] # copy the data into a variable so original is not modified
    output = []

    # PUT CODE HERE

    return output
# Get a bonus score if solve this in a time complexity less than n^2 (the solution above is less than n^2)

result = getPairsSum100()
if len(result) == 27:
    print("Correct amount of pairs! Please check with SSSC Team to verify answers")