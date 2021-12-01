def getInput():
    with open("2021\day1\input.txt") as file:
        lines = file.readlines()
    numbers = [int(line.strip()) for line in lines]
    return numbers


sonar = getInput()

#Part 1
increases1 = 0

for i in range (1,len(sonar)):
    if sonar[i] > sonar[i-1]:
        increases1 += 1

#Part 2
increases2 = 0

for i in range(3,len(sonar)):
    sum1 = sonar[i-3] + sonar[i-2] + sonar[i-1]
    sum2 = sonar[i-2] + sonar[i-1] + sonar[i]
    if sum2 > sum1:
        increases2 += 1

print("Total sonar increases part 1: ", increases1)
print("Total sonar increases part 2: ", increases2)