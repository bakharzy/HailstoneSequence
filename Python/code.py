# Written in Python 3 so run with the following command from terminal:
# python3 code.py
# In this code, the output is only printed to the terminal console. 
# Please check the Java solution for html output.

number = input("Please write your number...\n")
temp = int(number)
max = 0
sec = -1
counter = 0
while temp != 1:
    counter = counter +1
    if temp % 2:
        temp = 3*temp + 1
        #print(str(int(temp)), end=', ')
    else:
        temp = temp / 2
        #print(str(int(temp)), end=', ')
    if temp > max:
        sec = max
        max = temp
    elif temp > sec:
        sec = temp
print("Input number: " + number + 
    "\nMaximum number: " + 
    str(int(max)) + 
    "\nSecond maximum: " + 
    str(int(sec)) + "\nNumber of steps: " 
    + str(counter))