def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)
count = int(input("How many Fibonacci numbers to generate? "))

if count <= 0:
    print("Please enter a positive integer.")
else:
    print("Fibonacci sequence:")
    for i in range(1, count + 1):
        print(fibonacci(i), end=" ")