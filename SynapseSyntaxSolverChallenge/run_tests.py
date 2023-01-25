from brain import Brain

tests = [
            [[0,0,0,0],
            [0,0,0,0],
            [0,0,0,0],
            [0,0,0,0]],

            [[1,1,1,1],
            [1,1,1,1],
            [1,1,1,1],
            [1,1,1,1]],

            [[1,1,1,1],
            [1,0,0,1],
            [1,0,0,1],
            [1,1,1,1]],

            [[0,1,1,1],
            [0,0,0,1],
            [0,0,0,1],
            [0,0,1,1]],

            [[0,0,0,1],
            [0,0,0,1],
            [0,0,0,1],
            [0,0,0,1]],

            [[0,0,0,0,0],
            [0,1,1,1,0],
            [0,1,1,1,0],
            [0,1,1,1,0],
            [1,1,1,1,1]],

            [[1,1,1,1,0],
            [0,0,0,0,0],
            [0,0,0,0,0],
            [0,0,0,0,0],
            [1,1,1,1,0]]


        ]

labels = [0,1,1,1,0,1,0]

if __name__ == '__main__':
    brain = Brain()
    N = len(tests)
    total_correct = 0
    print('\n--------RUNNING TESTS--------')
    for test, label in zip(tests,labels):
        image_type = 'Scary' if label == 1 else 'Happy'

        print('Image: ')
        for row in test:
            print(row)
        print(f'\nImage type: {image_type}')
        brain.process(test)
        print(f'Brain: "{brain.yell()}"')
        result = 'CORRECT' if brain.amygdala.is_scared == label else 'INCORRECT'
        if result == 'CORRECT':
           total_correct += 1 
        print(f'Result: {result}')


    print('\n--------TESTS COMPLETE--------')
    print(f'\nTOTAL TESTS PASSED: {total_correct} out of {N} ({round(total_correct/N,2)} %)')

