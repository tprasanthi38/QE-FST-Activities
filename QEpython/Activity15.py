try:
    print(my_secret_variable)
except NameError:
    print("Caught a NameError: You tried to use something that isn't defined!")

print("The program is still running successfully.")