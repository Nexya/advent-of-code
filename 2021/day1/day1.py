def getInput():
    with open("2021\day1\input.txt") as file:
        lines = file.readlines()
    numbers = [int(line.strip()) for line in lines]
    return numbers


sonar = getInput()
increases = 0

for i in range (1,len(sonar)):
    if sonar[i] > sonar[i-1]:
        increases += 1

print("Total sonar increases: ", increases)