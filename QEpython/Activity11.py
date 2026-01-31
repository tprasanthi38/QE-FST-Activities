fruits = {
    "apple": 120,
    "banana": 40,
    "orange": 60,
    "mango": 150
}

fruit_name = input("Enter fruit name: ").lower()

if fruit_name in fruits:
    print(fruit_name, "is available")
    print("Price:", fruits[fruit_name])
else:
    print(fruit_name, "is not available")