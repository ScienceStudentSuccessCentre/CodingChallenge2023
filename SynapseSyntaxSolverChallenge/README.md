# SynapseSyntaxSolverChallenge

Today you will be using your Computer Science skills to help create a "fully functional" brain 🧠 


## Overview of Repository

Within this repository, there are **3 main files**: `lobes.py`, `brain.py` and `run_tests.py`

### `lobes.py` 

Contains the building blocks of our computer brain. It contains 5 classes: Retina, Occipital, Temporal, Parietal and Amygdala which have functionality vaguely resemblant of their traditional biological counterparts. 

- Retina: Although not a lobe, Retina plays an important role for our computer brain. Its job is to take in light and pass it along to Occipital, which is does via function calls `recieve_light()` and `send_light()`

- Occipital: Plays the role of processing visual input. Here it performs 4 main operations:
	1) Create an "image" (which it stores)
	2) Consult Temporal 
	3) Consult Parietal 
	4) Send results to Amygdala

- Temporal: Does a really dodgy job at object recognition. It is your job to implement its `inspect_image()` function

- Parietal: Does a really dodgy job at motion detection. It is your job to implement its `inspect_image()` function

- Amygdala: Its existence is to tell our computer brain whether to be scared or not based on the results of Temporal and Parietal's consultation. If either Temporal or Parietal report back with bad news (that is, return a 1), then Amygdala sets in internal state to "scared", triggering our computer brain to yelp in fear. 

### `brain.py` 

Contains the completed Brain class, which contains and controls all of the lobe classes from `lobe.py`. The class contains two main methods:

- `process()`: Takes in "light" as input and processes it 
- `yell()`: Makes an exclamation based on Amygdala's judgement of the inputted light.

### `run_tests.py`

File that can be used for testing your code. 


## Your task

The goal of this challenge is to implement the two `inspect_image()` functions inside of Temporal and Parietal classes of `lobes.py` and can be found on lines 67 and 101 of the file. Implementation details can be found commented in the code. If done correctly, Amygdala will be able to correctly inform our brain how to respond when facing scary (and non-scary) images.

To verify that your code is correct, run the `run_tests.py` script and ensure that all tests are passed. Given a correct implementation, you should see the following output:

--------TESTS COMPLETE--------

TOTAL TESTS PASSED: 7 out of 7 (1.0 %)

## Dependencies 

This requires that you have Python 3 installed locally on your system and know how to execute a Python script in your IDE of choice or from the command line.

## Last but not least: Have fun!!! 😸
