def getInput():
    with open("input.txt") as file:
        lines = file.readlines()
    numbers = [int(line.strip()) for line in lines]
    return numbers