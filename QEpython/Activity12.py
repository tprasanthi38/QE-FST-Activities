def recursive_adder(n):
    if n == 0:
        return 0
    else:
        return n + recursive_adder(n - 1)
result = recursive_adder(10)
print(f"The recursive sum from 0 to 10 is: {result}")