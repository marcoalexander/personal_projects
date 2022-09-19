#weight calc
weightInt = input("Weight: ")
typeOWeight = input("(K)g or (L)bs: ")
if typeOWeight == 'K' or typeOWeight == 'k':
	print("Weight in lbs: " + str(int(weightInt) / 0.45))
elif typeOWeight == 'L' or typeOWeight == 'l':
	print("Weight in kg: " + str(int(weightInt) * 0.45))
else:
	print("invalid input suck my dick")
	



#passing str to int
birthYear = input("Enter your birth year: ")
age = 2022 - int(birthYear)
print(age)
#you can convert str to:
#int(), float(), bool(), str()

#calculator
firstInt = input("First: ")
secondInt = input("Second: ")
calcSum = int(firstInt) + int(secondInt)
print("Sum: " + str(calcSum))

#str manipulation
course = 'Python for Beginners'
print(course.upper()) #lower()
print(course.find('y')) #notice that capital y wouldnt work, case sensitive

#[::-2], [1:3]

#math operators
x = (10 + 3) * 2
x += 2

#comparison operators
boolCheck = 3 <= 2 # ==. <, !=

#logical operators
price = 25
print(price > 10 and price <30) #or

# if statements
temp = 35
if temp > 30:
	print("damn its hot")
	print("drink water")
elif temp > 20:
	print("its a nice day")
elif temp > 10:
	print("its chilly")
else:
	print("its cold")
print("end of if statement, technically after statemnt")

# while loops 
i = 1
while i <= 5:
	print(i)
	i += 1

#lists
names = ["John", "bob", "Mosh", "sam", "mary"]
names[0] = "jon"
print(names[0])
print(names[-1])
print(names[0:3])
names.append("dude")
names.insert(0, "-1")
names.remove("John")
print(len(names))


# for loop
numbers = [1, 2, 3, 4, 5]

for item in numbers:
	print(item)


#range function
num = range(5)
#range object stores sequence of numbers
print(num) #"Range(0,5)"

for number in num:
	print(number)


#tuples
tupleNumber = (1,2,3)







