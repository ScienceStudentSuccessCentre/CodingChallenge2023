
class Retina:

    def __init__(self):
        self.light = []

    def recieve_light(self,light):
        # We ignore optics here (and basically every other branch of science)
        self.light = light

    def send_light(self,lobe):
        if self.light != []:
            lobe.recieve_light(self.light)

class Occipital:

    def __init__(self):
        self.light = []

    def recieve_light(self,light):
        # S.C.I.E.N.C.E 
        self.light = light

    def create_image(self):
        # I am just going to pretend like I know how brains work
        # No harm done ... right?
        if self.light != []:
            self.image = self.light
        
    def send_image_for_inspection(self,lobe):
        # Much like how we consult our closest friends for big decisions in our lives, Occipital too has a group of lobular comrades to turn to in difficult times
        if self.image != []:
            result = lobe.inspect_image(self.image)
            return result
            
#In documentation, indicate that we are treating temporal lobe as image recognition 
class Temporal:

    def __init__(self):
        pass

    def inspect_image(self,image):
        '''
        Temporal cares if recognizes anything that would spook Amygdala. Lucky for us, Amygdala is very predictable and is spooked by stimulation, so Temporal just checks whether an image contains a lot of stimulation or not
        Your task is to complete Temporal's interpretation of the image:
        Return 1 if the image contains more 1's than 0's
        Return 0 if it is a tie or if there are more 0's than 1's in the image
        Example:

        Return 1 (Reason: More 1's)
        [[1,1,1],
        [0,1,0],
        [1,1,1]]
            
        Return 0 (Reason: More 0's)
        [[0,1,0],
        [1,0,1],
        [0,1,0]]

        Return 0 (Reason: Tie)
        [[0,0,0,0],
        [1,1,1,1],
        [0,0,0,0],
        [1,1,1,1]]
        '''
 
        #TODO: Implement me :) 
        return 0
        
        

class Parietal:

    def __init__(self):
        pass

    def inspect_image(self,image):
        '''
        Parietal cares if there is a lot of stimulation coming from the border of the image, as it cooresponds to something new moving in front of brain. 
        Your task is to complete Parietal's interpretation of the image:
        Return 1 if the border of the image contains more 1's than 0's
        Return 0 if it is a tie or if there are more 0's than 1's on the border
        Example:

        Return 1 (Reason: More 1's on border)
        [[1,1,1],
        [0,1,0],
        [1,1,1]]
            
        Return 0 (Reason: More 0's on border)
        [[0,1,0],
        [1,0,1],
        [0,1,0]]

        Return 0 (Reason: Tie)
        [[0,0,1],
        [1,0,1],
        [0,0,1]]
        '''
        
        #TODO: Implement me :)
        return 0

class Amygdala:

    def __init__(self):
        self.is_scared = True # Coming into existence is scary :( 

    def assess_situation(self,result1,result2):
        #Amygdala has a fear of stimulation of any sorts, prefers cats over dogs (except tigers) and secretly dreams of one day becoming a writer
        total = result1 + result2
        if total > 0: # Either Temporal or Parietal have bad news
            self.is_scared = True #Yikes, leave me alone, I need solitude
        else:
            self.is_scared = False #Finally, some peace and quiet


        

