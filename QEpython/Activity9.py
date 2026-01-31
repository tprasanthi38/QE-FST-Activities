list1 = list(map(int, input("Enter first list: ").split()))
list2 = list(map(int, input("Enter second list: ").split()))

new_list = []

for i in list1:
    if i % 2 != 0:
        new_list.append(i)

for i in list2:
    if i % 2 == 0:
        new_list.append(i)

print("New list:", new_list)