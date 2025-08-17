class Student:
    def __init__(self, name, marks):
        self.__name = name   #private(hidden)
        self.__marks = marks #private(hidden)
        
    def get_marks(self):
        return self.__marks
    
    def set_marks(self, new_marks):
        if 0 <= new_marks <=100:
            self.__marks = new_marks
        else:
            print("invalid marks")

s1 = Student("Aparna", 85)
print(s1.get_marks()) #allowed
s1.set_marks(95)      #allowed
print(s1.get_marks())

s1.set_marks(150)
